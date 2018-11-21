package introduction.ioc.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConf.class);
        JavaConf.Car car = (JavaConf.Car) ctx.getBean("car");
        car.getBrand();
    }
}
