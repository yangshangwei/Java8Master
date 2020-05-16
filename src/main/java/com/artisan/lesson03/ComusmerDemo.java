package com.artisan.lesson03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-16 20:20
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class ComusmerDemo {

    public static <T> void doForEach(List<T> tList, Consumer<T> consumer){
        for (T t: tList ) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        // 第二个参数 Lambda是 Consumer 中accept 方法的实现
        doForEach(Arrays.asList(1,2,3,5,7),(Integer i) -> System.out.println(i));


    }
}
