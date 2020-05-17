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

        // 如果一个Lambda的主体是一个语句表达式， 它就和一个返回 void 的函数描述符兼容（当然需要参数列表也兼容
        List<String> stringList = new ArrayList<>();
        // Predicate返回了一个boolean
        Predicate<String> predicate = s -> stringList.add(s);
        // Consumer返回了一个void
        Consumer<String> consumer =    s -> stringList.add(s);

        Runnable o = () -> {System.out.println("Tricky example"); };

        int num = 1;
        Runnable runnable = ()->System.out.println(num);
    }



}
