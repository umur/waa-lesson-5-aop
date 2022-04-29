package edu.miu.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(edu.miu.springaop.aspect.annotation.LogMe)")
    public void a(){}

    @After("a()")
    public void log(JoinPoint joinPoint){
        System.out.println("Method Name: " + joinPoint.getSignature().getName());
    }
}
