package com.tw.WrongEqualsAndHashCode;

import com.tw.WrongPerson;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrongEqualandHashcodeTest {
    @Test
    public void test_implementation_of_wrong_equals() throws Exception {
        WrongPerson prateek1 = new WrongPerson("prateek",18);
        WrongPerson prateek2 = new WrongPerson("prateek",18);
        boolean result = prateek1.equals(prateek2);
        assertEquals(false,result);
    }

    @Test
    public void test_implementation_of_wrong_hashcode() throws Exception{
        WrongPerson prateek1 = new WrongPerson("prateek",18);
        WrongPerson prateek2 = new WrongPerson("prateek",18);
        boolean result = prateek1.hashCode() == prateek2.hashCode();
        assertEquals(false,result);
    }
}
