package com.artisan.lesson03;

import com.artisan.domain.Enginner;

import java.util.function.Supplier;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-16 21:08
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class SupplierDemo {

    public static <T> T doGet(Supplier<T> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        Enginner enginneer = new Enginner("JAVA", 18);

        String s = doGet(() -> enginneer.getJob());

        System.out.println(s);
    }
}
