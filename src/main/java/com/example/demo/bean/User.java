package com.example.demo.bean;

import java.util.List;
import java.util.Map;

/**
 * @author YanQing Gao
 * @date 2018/11/28 11:41
 * Goals determine what you are going to be!
 */
public class User {
    private String name;
    private int age;
    private Map<String, String> price;
    private List<Student> allStudent;

    public User() {
    }

    public User(String name, int age, Map<String, String> price, List<Student> allStudent) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.allStudent = allStudent;
    }

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

    public Map<String, String> getPrice() {
        return price;
    }

    public void setPrice(Map<String, String> price) {
        this.price = price;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }
}
