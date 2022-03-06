package org.example.config;

import org.example.bean.*;
import org.example.condition.MyImportBeanRegistrar;
import org.example.import_selector.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;


@Configuration
@Import(value = {Color.class, Red.class, Blue.class, MyImportSelector.class, MyImportBeanRegistrar.class})
public class MainConfig2 {
    /**
     * 默认单实例
     * prototype: 多实例：ioc容器启动不会调用方法创建对象到容器中,只在获取对象的时候才调用方法来创建对象,多次获取，多次调用
     * singleton: 单实例（默认值）：ioc容器启动会调用方法创建对象放到容器中,以后每次获取就直接从容器中拿
     * request: 同一次请求创建一个对象
     * session: 同一次会话创建一个对象
     * <p>
     * 懒加载：
     * 单实例bean，默认在容器启动的时候创建对象；懒加载，容器启动不创建对象。第一次使用（获取）Bean创建对象，并初始化；
     *
     * @return
     */

//    @Scope(value = SCOPE_PROTOTYPE)
    @Bean("person")
    @Lazy
    public Person person() {
        System.out.println("给容器中添加person");
        return new Person("张三", 25);
    }

    /**
     * @Contidional：按照一定的条件进行判断，满足条件给容器中注册bean 如果是windows，给容器注册("bill")
     * 如果是linux，给容器注册("linus")
     */
//    @Bean("bill")
//    @Conditional(WindowsCondition.class)
//    public Person person01() {
//        return new Person("bill gates", 70);
//    }
//
//    @Bean("linus")
//    @Conditional(LinuxCondition.class)
//    public Person person02() {
//        return new Person("linus", 60);
//    }
    @Bean("colorFactory")
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
