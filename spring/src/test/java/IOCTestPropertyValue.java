import org.example.bean.Person;
import org.example.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestPropertyValue {
    @Test
    public void test01() {
        // 1、创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
//        printBeans(annotationConfigApplicationContext);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);

        String nickName = annotationConfigApplicationContext.getEnvironment().getProperty("nickName");
        System.out.println(nickName);

    }

    public void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        for (String beanName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
