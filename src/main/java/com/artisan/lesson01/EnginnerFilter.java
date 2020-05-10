package com.artisan.lesson01;

import com.artisan.domain.Enginner;

@FunctionalInterface
public interface EnginnerFilter {
    boolean getMatchedEnginner(Enginner enginner);
}
