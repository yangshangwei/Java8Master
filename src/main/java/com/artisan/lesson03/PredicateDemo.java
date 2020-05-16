package com.artisan.lesson03;

import com.artisan.domain.Enginner;
import com.artisan.lesson01.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-16 9:13
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class PredicateDemo {

    /**
     * 过滤符合规则的泛型类
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    private static <T> List<T> filter(List<T> list , Predicate<T> predicate){
        List<T> targetList = new ArrayList<>();
        for (T t :list){
            if (predicate.test(t)){
                targetList.add(t);
            }
        }
        return  targetList;
    }

    private static <T> List<T> filterCustom(List<T> list , Filter<T> filter){
        List<T> targetList = new ArrayList<>();
        for (T t :list){
            if (filter.filter(t)){
                targetList.add(t);
            }
        }
        return  targetList;
    }

    public static void main(String[] args) {
        List<Enginner> enginnerList = Arrays.asList(new Enginner("Java", 18), new Enginner("GO", 20));
        List<Enginner> goEngineerList = filter(enginnerList,engineer -> engineer.getJob().equals("GO"));
        System.out.println(goEngineerList);

        List<Enginner> javaEngineerList = filterCustom(enginnerList, engineer -> engineer.getJob().equals("Java"));
        System.out.println(javaEngineerList);
    }
}
