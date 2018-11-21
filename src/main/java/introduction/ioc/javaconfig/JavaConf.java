package introduction.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {


    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("BWM");
        car.setSpeed(100);
        return car;
    }


    static class Car {
        private String brand;
        private Integer speed;

        public String getBrand() {
            System.out.println("Car brand = " + brand);
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }
    }
}
