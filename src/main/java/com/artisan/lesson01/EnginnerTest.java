package com.artisan.lesson01;

import com.artisan.domain.Enginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-10 16:16
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class EnginnerTest {

    public List getJavaEngineers(List<Enginner> enginnerList) {
        List javaEnginnerList = new ArrayList();
        for (Enginner enginner : enginnerList) {
            if ("Java".equals(enginner.getJob())) {
                javaEnginnerList.add(enginner);
            }
        }
        return javaEnginnerList;
    }


    public List getEngineersByJob(List<Enginner> enginnerList, String job) {
        List targetEngineerList = new ArrayList();
        for (Enginner enginner : enginnerList) {
            if (job.equals(enginner.getJob())) {
                targetEngineerList.add(enginner);
            }
        }
        return targetEngineerList;
    }

    public List findEnginner(List<Enginner> enginnerList, EnginnerFilter filter) {
        List targetEngineerList = new ArrayList();
        for (Enginner enginner : enginnerList) {
            if (filter.getMatchedEnginner(enginner)) {
                targetEngineerList.add(enginner);
            }
        }
        return targetEngineerList;
    }

    public static <T> List filter(List<T> list, Filter<T> p) {
        List<T> targetList = new ArrayList();
        for (T t : list) {
            if (p.filter(t))
                targetList.add(t);
        }
        return targetList;
    }

    public List getEngineersByJobAndAge(List<Enginner> enginnerList, String job, int age) {
        List targetEngineerList = new ArrayList();
        for (Enginner enginner : enginnerList) {
            if (job.equals(enginner.getJob()) && enginner.getAge() > age) {
                targetEngineerList.add(enginner);
            }
        }
        return targetEngineerList;
    }

    public static void main(String[] args) {
        List<Enginner> enginnerList = Arrays.asList(new Enginner("Java", 18), new Enginner("GO", 20), new Enginner("Python", 15), new Enginner("DBA", 15), new Enginner("Java", 30));
        EnginnerTest enginnerTest = new EnginnerTest();
//        List javaEngineers = enginnerTest.getJavaEngineers(enginnerList);
//        System.out.println(javaEngineers);
//
//        List targetEngineerList = enginnerTest.getEngineersByJob(enginnerList, "Java");
//        System.out.println(targetEngineerList);
//
//
//        List targetEngineerList2 = enginnerTest.getEngineersByJob(enginnerList, "GO");
//        System.out.println(targetEngineerList2);
//
//        List targetEngineerList3 = enginnerTest.getEngineersByJobAndAge(enginnerList, "Java", 25);
//        System.out.println(targetEngineerList3);
//
//        System.out.println("===================================");
//
//
//        List targetEngineerList4 = enginnerTest.findEnginner(enginnerList, new AgeGte30JavaEnginnerFilter());
//        System.out.println(targetEngineerList4);
//
//        List targetEngineerList5 = enginnerTest.findEnginner(enginnerList, new JavaEnginnerFilter());
//        System.out.println(targetEngineerList5);
//
//
//        List targetEngineerList6 = enginnerTest.findEnginner(enginnerList, new EnginnerFilter() {
//            @Override
//            public boolean getMatchedEnginner(Enginner enginner) {
//                return "Python".equals(enginner.getJob());
//            }
//        });
//        System.out.println(targetEngineerList6);


        List targetEngineerList7 = enginnerTest.findEnginner(enginnerList,engineer -> {
            return "Java".equals(engineer.getJob());
        });
        System.out.println(targetEngineerList7);

    }
}
