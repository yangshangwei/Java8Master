package com.artisan.lesson01;

import com.artisan.domain.Enginner;

@FunctionalInterface
public interface Filter<T> {

    boolean filter(T t);

    default void print(String var){
        System.out.println(var);  // default 级别的方法
    };

    static String staticMethod(){  // default 级别的方法
        return "";
    };
}
