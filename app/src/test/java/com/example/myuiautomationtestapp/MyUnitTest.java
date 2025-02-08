package com.example.myuiautomationtestapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MyUnitTest {

    MyMath myMath;

    @Before
    public void init() {
        myMath = new MyMath();

    }



   @Test(timeout = 2)
   @Ignore("because Datatable")
   public void countryCode_validInput_success() {
       CommonFunction commonFunction = new CommonFunction();
       String code = commonFunction.getCountryCode("egypt");

       assertEquals("eg", code);
   }

    @Test
    public void countryCode_validInput_success3() {

        CommonFunction commonFunction = new CommonFunction();


        String code = commonFunction.getCountryCode("Egypt");

        assertEquals("eg", code);
    }

}