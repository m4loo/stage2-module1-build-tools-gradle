package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)){
            int num = Integer.parseInt(str);return num > 0;
        } else {
            return false;
        }
    }
}