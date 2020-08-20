package com.makkkkkkkks;

import com.makkkkkkkks.model.Car;
import com.makkkkkkkks.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Executor {
    @Bean
    public User user() {
        return new User("Maks");
    }

    @Bean
    public Car car(User user) {
        return new Car(user, "toyota");
    }

    public void start() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Executor.class);

        Car car = (Car) context.getBean("car");
        System.out.println("user name - " + car.getUser().getName());
    }
}
