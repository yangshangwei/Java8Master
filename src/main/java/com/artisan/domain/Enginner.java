package com.artisan.domain;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-10 16:10
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class Enginner {
    private String job;
    private int age;

    public Enginner(String job, int age) {
        this.job = job;
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Enginner{" +
                "job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
