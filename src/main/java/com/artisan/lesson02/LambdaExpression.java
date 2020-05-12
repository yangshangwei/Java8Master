package com.artisan.lesson02;

import com.artisan.domain.Enginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-12 22:28
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class LambdaExpression {


    public static void main(String[] args) {
        Comparator<Enginner> enginnerComparator = new Comparator<Enginner>() {
            @Override
            public int compare(Enginner o1, Enginner o2) {
                return o1.getJob().compareTo(o2.getJob());
            }
        };

        enginnerComparator.compare(new Enginner("Java",18),new Enginner("Go",10));

        List<Enginner> enginnerList = Arrays.asList(new Enginner("Java",18),new Enginner("Go",10));
        enginnerList.sort(enginnerComparator);
        System.out.println("enginnerList:" + enginnerList);


        Comparator<Enginner> comparator = (Enginner o1, Enginner o2) -> o1.getJob().compareTo(o2.getJob());

        Comparator<Enginner> comparator2 = ( o1,  o2) -> o1.getJob().compareTo(o2.getJob());


        int compare = comparator2.compare(new Enginner("Java", 18), new Enginner("Go", 10));
        System.out.println("Result:" + compare);

        // 常见的lambda表达式

        Function<String,Integer> flambda = (String s) -> s.length();

        Predicate<Enginner>  predicate= (Enginner e) -> e.getAge() > 30 ;


    }

}
