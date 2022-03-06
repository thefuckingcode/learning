package org.example;

import org.example.bean.Person;
import org.example.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @ComponentScan value:指定要扫描的包
// excludeFilters = Filter[]；指定扫描的时候按照什么规则排除哪些组件
// includeFilters = Filter[]；指定扫描的时候只包含哪些组件
// FilterType.ANNOTATION；按照注解
// FilterType.ASSIGNABLE_TYPE；按照给定的类型
// FilterType.ASPECTJ；使用ASPECTJ表达式
// FilterType.REGEX；使用正则表达式
// FilterType.CUSTOM；使用自定义规则
public class Main {
    public static void main(String[] args) {
        // 注解式
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(Person.class));
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
