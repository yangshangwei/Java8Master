package com.artisan.lesson03;

import com.artisan.domain.Enginner;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

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

        Callable<Integer> integerCallable = () -> 18;
        PrivilegedAction<Integer> privilegedAction = () -> 18;

        // 同一个Lambda可用于多个不同的函数式接口
        Comparator<Enginner> enginnerComparator = (e1, e2) -> e1.getJob().compareTo(e2.getJob());
        ToIntBiFunction<Enginner, Enginner> toIntBiFunction = (e1, e2) -> e1.getJob().compareTo(e2.getJob());
        BiFunction<Enginner, Enginner, Integer> toIntFunction = (e1, e2) -> e1.getJob().compareTo(e2.getJob());
    }

}
