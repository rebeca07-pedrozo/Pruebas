package com.platzi.javatests.util;

public class DateUtil {
    public static boolean isLapYear(int year) {
        return (year % 4 == 0 && year != 0) || (year % 400 == 0);
    }
}
