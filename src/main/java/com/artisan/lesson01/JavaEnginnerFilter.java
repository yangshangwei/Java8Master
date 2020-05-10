package com.artisan.lesson01;

import com.artisan.domain.Enginner;

/**
 * @author 小工匠
 * @version v1.0
 * @create 2020-05-10 22:41
 * @motto show me the code ,change the word
 * @blog https://artisan.blog.csdn.net/
 * @description
 **/

public class JavaEnginnerFilter implements EnginnerFilter {
    @Override
    public boolean getMatchedEnginner(Enginner enginner) {
        return "Java".equals(enginner.getJob());
    }
}
