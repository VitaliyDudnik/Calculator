package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {
    private static final Logger log = LoggerFactory.getLogger(CalculatorAspect.class);

    @Pointcut("execution(public * org.example.calculatorRun.CalculatorRun.*(..))")
   public void calculatorRunPublic(){

    }
    @Around("calculatorRunPublic()")
    public Object calculatorRunPublic(ProceedingJoinPoint pj) throws Throwable {
            log.info("start -> "+pj.toShortString());
            Object proceed = pj.proceed();
            log.info("Finish -> "+pj.toShortString());
            return proceed;
    }
}
