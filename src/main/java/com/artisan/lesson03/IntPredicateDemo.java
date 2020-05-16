package com.artisan.lesson03;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-16 21:25
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class IntPredicateDemo {


    public static void main(String[] args) {

        // 无装箱
        IntPredicate intPredicate = (int i) -> i % 2 == 0;
        intPredicate.test(100);


        // 装箱
        Predicate<Integer> predicate = (Integer i) -> i % 2 == 0;
        predicate.test(20);
    }
}
