import org.example.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestAutowired {
    @Test
    public void test01() {
        // 1、创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        printBeans(annotationConfigApplicationContext);
        System.out.println(annotationConfigApplicationContext.getBean("boss"));

    }

    public void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        for (String beanName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
