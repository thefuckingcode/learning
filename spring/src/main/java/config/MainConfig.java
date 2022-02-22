package config;

import bean.Person;

@Configuration // 告诉Spring这是一个配置类
public class MainConfig {

    @Bean // 表示注入一个对象，对象名称为方法名
    public Person person() {
        return new Person("lisi", 20);
    }
}
