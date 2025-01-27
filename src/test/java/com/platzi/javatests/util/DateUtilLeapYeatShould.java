package com.platzi.javatests.util;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYeatShould {
    /*
    All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    All years divisible by 100 but not by 400 are NOT
    leap years (1700, 1800, 1900), All years divisible
    by 4 but not by 100 ARE 1eap years (1996, 2004, 2008)
     All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)
     */


    @Test
    public void return_true_when_year_is_divisible_by_400() {

        assertThat(DateUtil.isLapYear(1600),is(true));
        assertThat(DateUtil.isLapYear(2000),is(true));
        assertThat(DateUtil.isLapYear(2400),is(true));
    }

    @Test
    public void return_false_when_year_divisible_by_100_but_not_by_400() {

        assertThat(DateUtil.isLapYear(2017),is(false));
        assertThat(DateUtil.isLapYear(2018),is(false));
        assertThat(DateUtil.isLapYear(1900),is(false));
    }

    @Test
    public void return_true_when_year_divisible_by_4_but_not_by_100() {

        assertThat(DateUtil.isLapYear(1996),is(true));
        assertThat(DateUtil.isLapYear(2004),is(true));
        assertThat(DateUtil.isLapYear(2008),is(true));
    }

    @Test
    public void return_false_when_year_not_divisible_by_4() {

        assertThat(DateUtil.isLapYear(2017),is(false));
        assertThat(DateUtil.isLapYear(2018),is(false));
        assertThat(DateUtil.isLapYear(2019),is(false));
    }

}