package com.example.myuiautomationtestapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestEmailValidate.class,
    TestCountryCode.class,
    MyUnitTest.class

})
public class SuiteTest {

}
