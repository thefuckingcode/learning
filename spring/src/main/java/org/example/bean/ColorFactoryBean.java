package org.example.bean;

import org.springframework.beans.factory.FactoryBean;

// 创建一个Spring定义的工厂bean
public class ColorFactoryBean implements FactoryBean<Color> {

    @Override
    public Color getObject() {
        System.out.println("get factory bean");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // true代表bean是单实例，在容器中只会保存一份
    // false代表bean是多实例，每次获取都会创建一个新的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
