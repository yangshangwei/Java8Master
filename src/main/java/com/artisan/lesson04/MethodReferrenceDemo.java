package com.artisan.lesson04;

import com.artisan.domain.Enginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-17 9:01
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class MethodReferrenceDemo {

    public static <T, R> R doSomething(T t, Function<T, R> f) {
        return f.apply(t);
    }

    public static void main(String[] args) {
        Function<Enginner, String> ef = (Enginner e) -> e.getJob();
        System.out.println(doSomething(new Enginner("Java", 18), ef));

        Function<Enginner, String> ef2 = Enginner::getJob;
        System.out.println(doSomething(new Enginner("Java", 18), ef2));

        Consumer<String> consumer = (String s) -> System.out.println(s);
        Consumer<String> consumer2 = System.out::println;




        Function<String, Integer> stringIntegerFunction = (String s) -> s.length();
        Function<String, Integer> stringIntegerFunction1 = String::length;

        System.out.println(stringIntegerFunction.apply("abc"));
        System.out.println(stringIntegerFunction1.apply("abc"));


        Function<String, Integer> stringIntegerFunction2 = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringIntegerFunction3 = Integer::parseInt;

        System.out.println(stringIntegerFunction2.apply("18"));
        System.out.println(stringIntegerFunction3.apply("18"));


        List<String> list = Arrays.asList("apple","pear","banana");
        list.sort((s1,s2)-> s1.compareToIgnoreCase(s2));

        list.sort(String::compareToIgnoreCase);


        Supplier<Enginner> supplier = Enginner::new;
        Enginner enginner = supplier.get();

        Supplier<Enginner> s = () -> new Enginner();
        Enginner supplier2 = s.get();


        Function<Integer,Enginner> function = Enginner::new;
        Enginner e = function.apply(11);
        System.out.println(e.getAge());



        Function<String ,Enginner> f2 =  Enginner::new;
        Enginner e2 =f2.apply("Java");
        System.out.println(e2.getJob());



        BiFunction<String ,Integer,Enginner> f3 = Enginner::new;
        Enginner e4 = f3.apply("Java",18);
        System.out.println(e4 .getJob() + " - " +  e4.getAge());

        BiFunction<String,Integer,Enginner> f4 = (str , age)-> new Enginner(str, age);
        Enginner ee =f4.apply("Go", 10);
        System.out.println(ee .getJob() + " - " +  ee.getAge());

    }

}
