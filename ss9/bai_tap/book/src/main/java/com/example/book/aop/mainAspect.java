package com.example.book.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class mainAspect {
    private long numberOfRequestsToServer = 0;

    @Pointcut("within(com.example.book.controller.*)")
    public void countNumberOfRequestsToServer() {

    }

    @Pointcut("execution(* com.example.book.controller.BookController.createBook(..))")
    public void logCreateBook() {

    }

    @Before("countNumberOfRequestsToServer()")
    public void beforCountNumberOfClientsHandler(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName());
        this.numberOfRequestsToServer++;
        System.out.println("The number of requests to server: " + this.numberOfRequestsToServer);
    }

    @AfterReturning(value = "logCreateBook()", returning = "returned")
    public void logCreateBookHandler(JoinPoint joinPoint, Object returned) {
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println(returned);
    }
}
