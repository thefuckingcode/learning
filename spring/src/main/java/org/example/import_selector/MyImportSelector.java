package org.example.import_selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    /**
     * 返回值为导入到容器中组件的类全类名
     *
     * @param importingClassMetadata 当前@Import注解的类的所有注解信息，包括其它注解，比如@Configuration
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.example.bean.shape"};
    }
}
