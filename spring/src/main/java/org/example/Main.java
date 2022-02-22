package org.example;

import org.example.bean.Person;
import org.example.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 注解式
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(Person.class));
        for (String name : annotationConfigApplicationContext.getBeanNamesForType(Person.class)) {
            System.out.println(name);
        }
    }
}
