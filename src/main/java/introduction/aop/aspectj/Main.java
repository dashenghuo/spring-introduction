package introduction.aop.aspectj;

import introduction.aop.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/aspectj-applicationcontext.xml");
        Calculator calculator = (Calculator) ctx.getBean("calculator");

        calculator.add(1, 1);
        calculator.sub(1, 1);


    }

}
