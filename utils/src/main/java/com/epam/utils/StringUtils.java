package com.example.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}
