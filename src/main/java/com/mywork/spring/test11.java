package com.mywork.spring;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class test11 {
    public static void main(String[] args) {
        String v = "1.02.3.5.0.0";
        String s = Pattern.compile("\\.")
                .splitAsStream(v)
                .map(Integer::valueOf)
                .map(String::valueOf)
                .collect(Collectors.joining());



        System.out.println(s);
    }
}
