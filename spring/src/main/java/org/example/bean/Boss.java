package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {


    private Car car;

    private Cat cat;

    //    @Autowired
    public Boss(Car car) {
        this.car = car;
        System.out.println("有参构造器");
    }

    public Boss(Car car,Cat cat) {
        this.car = car;
        this.cat = cat;
        System.out.println("有参构造器2");
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Car getCar() {
        return car;
    }

    // 标准在方法上，Spring容器创建当前对象，就会调用方法完成赋值
    // 方法使用的参数，自定义类型的值从ioc容器中获取
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
