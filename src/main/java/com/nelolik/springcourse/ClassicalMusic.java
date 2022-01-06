package com.nelolik.springcourse;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{

    ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
