package com.example.myuiautomationtestapp;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestEmailValidate {
    EmailValidator emailValidator;
    public String email;

    public TestEmailValidate(String email) {
        this.email = email;
    }

    @Before
    public void init() {
        emailValidator = new EmailValidator();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[]{
                "Mohanned@gmail.com", "mO@gmail.com",
                "Yousef28@gmail.com", "Ali@gmail.com",
                "mohannedSohail@ucas.edu.ps",
                "hosam75@ucas.edu.ps",

        });
    }


    @Test
    public void emailValidator_validInput_success() {
        assertTrue(EmailValidator.isValidEmail(email));
    }


}