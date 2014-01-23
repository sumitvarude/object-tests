package com.tw.ArrayListTest;
import com.tw.Person;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast() throws ClassCastException {
        ArrayList list = new ArrayList<String>();
        list.add(new Object());
        list.add(new Object());
        String a = (String)list.get(0);
    }


    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast_2() throws ClassCastException {
        ArrayList list = new ArrayList<Integer>();
        list.add(new Object());
        list.add(new Object());
        Integer a = (Integer)list.get(0);
    }

    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast_3() throws ClassCastException {
        ArrayList list = new ArrayList<Float>();
        list.add(new Object());
        list.add(new Object());
        Float a = (Float)list.get(0);
    }

    @Test(expected = java.lang.ClassCastException.class)
    public void testGivesExceptionWhenIllegalCast_4() throws ClassCastException {
        ArrayList list = new ArrayList<Person>();
        list.add(new Object());
        list.add(new Object());
        Person a = (Person)list.get(0);
    }
}
