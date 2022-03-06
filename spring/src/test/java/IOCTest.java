import org.example.config.MainConfig;
import org.example.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @ComponentScan value:指定要扫描的包
// excludeFilters = Filter[]；指定扫描的时候按照什么规则排除哪些组件
// includeFilters = Filter[]；指定扫描的时候只包含哪些组件
// FilterType.ANNOTATION；按照注解
// FilterType.ASSIGNABLE_TYPE；按照给定的类型
// FilterType.ASPECTJ；使用ASPECTJ表达式
// FilterType.REGEX；使用正则表达式
// FilterType.CUSTOM；使用自定义规则
public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        Object bean = annotationConfigApplicationContext.getBean("person");
        Object bean2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(bean == bean2);
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println(annotationConfigApplicationContext.getEnvironment().getProperty("os.name"));
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
//        Object bean = annotationConfigApplicationContext.getBean("person");
//        Object bean2 = annotationConfigApplicationContext.getBean("person");
//        System.out.println(bean == bean2);
    }

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String name : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Test
    public void testFactoryImport() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        // 工厂Bean获取的是调用getObject创建的对象
//        System.out.println(annotationConfigApplicationContext.getBean("colorFactory"));
//        System.out.println(annotationConfigApplicationContext.getBean("colorFactory"));
//        System.out.println(annotationConfigApplicationContext.getBean("colorFactory"));

        System.out.println(annotationConfigApplicationContext.getBean("&colorFactory"));
    }
}
