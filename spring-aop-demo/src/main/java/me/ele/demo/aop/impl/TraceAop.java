package me.ele.demo.aop.impl;


import lombok.extern.slf4j.Slf4j;
import me.ele.demo.aop.TraceLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
@Slf4j
public class TraceAop {

    @Pointcut("@annotation(me.ele.demo.aop.TraceLog)")
    private void pointCut() {
        //仅用于写
    }

    @Around(value = "pointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        TraceLog traceLog = method.getAnnotation(TraceLog.class);
        //打印参数日志
        if (traceLog.logArgs()) {
            log.info("input-->:{}", pjp.getArgs());
        }
        Object returnObj;
        long startTime = System.currentTimeMillis();
        try {
            returnObj = pjp.proceed();
            //打印结果
            if (traceLog.logReturn()) {
                log.info("return-->:{}", returnObj);
            }
            return returnObj;
        } catch (Throwable e) {
            if (traceLog.logException()) {
                //如果有异常则输出异常
                log.error("error:{},args:{}", e.getMessage(), pjp.getArgs(), e);
            }
            throw e;
        } finally {
            long usedMills = System.currentTimeMillis() - startTime;
            if (usedMills > 200) {
                log.warn("{}#{} total cost:{} ms ", pjp.getTarget().getClass().getName(), method.getName(), usedMills);
            }
        }
    }

}
