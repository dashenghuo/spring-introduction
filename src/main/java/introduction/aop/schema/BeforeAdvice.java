package introduction.aop.schema;

import introduction.aop.Calculator;
import introduction.aop.CalculatorImpl;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BeforeAdvice  {

    public void log(JoinPoint joinPoint)  {
        System.out.println("input parameter: "  + Arrays.toString(joinPoint.getArgs()));
    }
}
