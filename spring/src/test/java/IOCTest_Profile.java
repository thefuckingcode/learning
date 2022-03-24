import org.example.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Profile {
    @Test
    public void test01() {
        // 1、创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        // 一次激活多个环境
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("test", "dev");
        // 注册主配置类
        annotationConfigApplicationContext.register(MainConfigOfProfile.class);
        // 启动刷新容器
        annotationConfigApplicationContext.refresh();
    }
}
