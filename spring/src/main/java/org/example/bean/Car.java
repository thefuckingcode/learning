package org.example.bean;

public class Car {
    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public Car() {
        System.out.println("constructor");
    }
}
