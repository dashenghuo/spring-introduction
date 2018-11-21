package introduction.ioc.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/applicationcontext.xml");
        AController aController = (AController) ctx.getBean("aController");

        aController.getName();
        aController.invokeBService();


    }



}

