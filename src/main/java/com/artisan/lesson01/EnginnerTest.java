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

    public List getJavaEngineers(List<Enginner> enginnerList){
        List javaEnginnerList = new ArrayList();
        for (Enginner enginner: enginnerList) {
            if ("Java".equals(enginner.getJob())){
                javaEnginnerList.add(enginner);
            }
        }
        return javaEnginnerList;
    }

    public static void main(String[] args) {
        List<Enginner> enginnerList = Arrays.asList(new Enginner("Java", 18), new Enginner("GO", 20), new Enginner("Python", 15), new Enginner("DBA", 15),new Enginner("Java", 25));
        EnginnerTest enginnerTest= new EnginnerTest();
        List javaEngineers = enginnerTest.getJavaEngineers(enginnerList);
        System.out.println(javaEngineers);
    }
}
