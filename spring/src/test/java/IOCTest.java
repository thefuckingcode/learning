import org.example.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
