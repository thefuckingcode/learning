import org.example.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestLifeCycle {
    @Test
    public void testAnnotation() {
        // 1、创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        annotationConfigApplicationContext.getBean("car");
        System.out.println("容器创建完成。。。。");
        annotationConfigApplicationContext.close();
    }

    @Test
    public void testInterface() {
        // 1、创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("容器创建完成。。。。");
        annotationConfigApplicationContext.close();
    }
}
