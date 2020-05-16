package com.artisan.lesson03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-16 20:47
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class FunctionDemo {

    /**
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return 返回 List<R>
     */
    public static <T, R> List<R> doSomething(List<T> list, Function<T, R> function) {
        List<R> rList = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            rList.add(apply);
        }
        return rList;
    }

    public static void main(String[] args) {
        // Lambda是 Function 接口的 apply 方法的 实现
        List<Integer> list = doSomething(Arrays.asList("artisan", "small", "happy"), (String s) -> s.length());
        System.out.println(list);
    }

}
