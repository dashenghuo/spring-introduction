package introduction.ioc.annotationconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationConfMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/annotationcnfig-applicationcontext.xml");
        introduction.ioc.annotationconf.AController acontroller = (AController) ctx.getBean("AController");

        acontroller.invokeBService();

        ((ClassPathXmlApplicationContext) ctx).destroy();
    }


}
