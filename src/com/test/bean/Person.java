package com.test.bean;

/**
 * Created by huxs on 16/9/30.
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void info(){
        System.out.println("一起来吃麻辣烫！");
        System.out.println("name:"+getName()+" age:"+getAge());
    }
}