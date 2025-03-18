package es.jcyl.formacion.aop.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspecto {
    @Before("execution(* es.jcyl.formacion.aop.aopdemo.Servicio.*(..))") // Pointcut
    public void logBefore(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Método a punto de ejecutarse: " + className + "." + methodName);
    }
}

