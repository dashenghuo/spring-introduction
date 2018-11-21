package introduction.aop.beforadvice;

import introduction.aop.Calculator;
import introduction.aop.CalculatorImpl;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("input parameter: " + Arrays.toString(objects));
    }



}
