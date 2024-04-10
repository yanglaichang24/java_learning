package com.ylch.apache.commons.lang3.utils;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

/**
 * @author Mr.Yang
 * @desc DateUtils
 * @date 2023/4/26 14:08
 */
public class DateUtils_Demo {


    @Test
    public void test() throws ParseException {
        String date = "2022-03-08 00:00:00";
        Date date2 = DateUtils.parseDate(date, "yyyy-MM-dd HH:SS:MM","yyyy-MM-dd");

        System.out.println(date2);


    }





}
