package org.example.config;

import org.example.bean.Person;
import org.example.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration // 告诉Spring这是一个配置类
//@ComponentScan(value = "org.example", excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {
//                Controller.class,
//                Service.class}),
//}, useDefaultFilters = false)

//@ComponentScan(value = "org.example", includeFilters = {
//}, useDefaultFilters = false)
@ComponentScan(value = "org.example", includeFilters = {
//        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
//        @Filter(type = FilterType.ANNOTATION, classes = {
//                Controller.class}),
        @Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig {

    @Bean // 表示注入一个对象，对象名称为方法名
    public Person person() {
        return new Person("lisi", 20);
    }
}
