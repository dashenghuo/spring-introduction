package introduction.aop.aspectj;

import introduction.aop.Calculator;
import introduction.aop.CalculatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
public class BeforeAdvice  {

    @Before("execution(* introduction.aop.CalculatorImpl.add(..))")
    public void before(JoinPoint joinPoint)  {
        System.out.println("input parameter: " + Arrays.toString(joinPoint.getArgs()));
    }
}
