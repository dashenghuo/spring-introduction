package introduction.aop.beforadvice;

import introduction.aop.Calculator;
import introduction.aop.CalculatorImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        Calculator target = new CalculatorImpl();
        BeforeAdvice beforeAdvice = new BeforeAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(beforeAdvice);
        Calculator calculator = (Calculator) factory.getProxy();
        calculator.sub(1 , 1);

    }

}
