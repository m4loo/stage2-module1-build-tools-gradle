package com.epam.utils;

import org.apache.commons.lang3.StringUtils;

//public class StringUtils {
//    public static boolean isPositiveNumber(String str) {
//        return StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
//    }
//}

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            int num = Integer.parseInt(str);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
