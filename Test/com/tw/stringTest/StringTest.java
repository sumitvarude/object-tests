package com.tw.stringTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void test_to_check_the_equality_of_literals() throws Exception {
        Boolean result = "Pallavi".equals("Pallavi");
        assertEquals(true,result);
    }

    @Test
    public void test_to_check_the_non_equality_of_literals() throws Exception {
        Boolean result = "Pallavi".equals("Pallavig");
        assertEquals(false,result);
    }

    @Test
    public void test_to_check_the_equality_of_string_constructor() throws Exception {
        String person1 = new String("Prateek");
        String person2 = new String("Prateek");
        Boolean result = person1.equals(person2);
        assertEquals(true,result);
    }

    @Test
    public void test_to_check_the_non_equality_of_string_constructor() throws Exception {
        String person1 = new String("Prateek");
        String person2 = new String("Prateekj");
        Boolean result = person1.equals(person2);
        assertEquals(false,result);
    }

    @Test
    public void test_to_check_the_equality_of_string_constructor_and_literal() throws Exception {
        String person1 = new String("Prateek");
        Boolean result = person1.equals("Prateek");
        assertEquals(true,result);
    }

    @Test
    public void test_to_check_the_non_equality_of_string_constructor_and_literal() throws Exception {
        String person1 = new String("Prateek");
        Boolean result = person1.equals("Pra");
        assertEquals(false,result);
    }
}
