package introduction.aop.schema;

import introduction.aop.CalculatorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/schema-applicationcontext.xml");
        CalculatorImpl calculator = (CalculatorImpl) ctx.getBean("calculator");

        calculator.add(1, 1);
        calculator.sub(1, 1);


    }

}
