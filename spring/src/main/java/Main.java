import bean.Person;
import config.MainConfig;

public class Main {
    public static void main(String[] args) {
        // 注解式
        AnnotationConfigAplicationContext annotationConfigAplicationContext = new AnnotationConfigAplicationContext(MainConfig.class);
        System.out.println(annotationConfigAplicationContext.getBean(Person.class));
    }
}
