package com.tw.personRight;

import com.tw.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/14/14.
 */


public class PersonTest {

    //----------------Person Tests with correct equals & hashcode--------------------
    Person prateek1;
    Person prateek2;
    Person sumit1;
    Person sumit2;
    List<Person> prateekList;
    List<Person> sumitList;
    @Before
    public void setUp() throws Exception {
        prateek1 = new Person("Prateek", 18);
        prateek2 = new Person("Prateek", 18);
        sumit1 = new Person("Sumit", 18);
        sumit2 = new Person("Sumit", 18);
        prateekList = new ArrayList<Person>();
        sumitList = new ArrayList<Person>();
        prateekList.add(prateek1);
        prateekList.add(prateek2);
        sumitList.add(sumit1);
        sumitList.add(sumit2);

    }

    @Test
    public void test_to_check_the_equality_of_Person() throws Exception {
        Boolean result = prateek1.equals(prateek2);
        assertEquals(true, result);
    }

    @Test
    public void test_to_check_the_unequality_of_Person() throws Exception {
        Person prateek = new Person("Prateek", 18);
        Person sumit = new Person("Sumit", 18);
        Boolean result = sumit.equals(prateek);
        assertEquals(false, result);
    }

    @Test
    public void test_to_check_the_equality_of_hashcode() throws Exception {
        Boolean result = prateek1.hashCode() == prateek2.hashCode();
        assertEquals(true, result);
    }

    @Test
    public void test_to_check_the_unequality_of_hashcode() throws Exception {
        Person prateek = new Person("Prateek", 18);
        Person sumit = new Person("sumit", 18);
        Boolean result = prateek.hashCode() == sumit.hashCode();
        assertEquals(false, result);
    }

    //-------------using arrayList-----------------
    @Test
    public void test_to_check_the_equality_of_Person_in_arrayList() throws Exception {
        Boolean result = sumitList.get(0).equals(sumitList.get(1));
        assertEquals(true, result);
    }

    @Test
    public void test_to_check_the_unequality_of_Person_in_arrayList() throws Exception {
        Person prateek = new Person("Prateek", 18);
        Person sumit = new Person("sumit", 18);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(prateek);
        people.add(sumit);
        Boolean result = people.get(0).equals(people.get(1));
        assertEquals(false, result);
    }

    @Test
    public void test_to_check_the_equality_of_Person_with_hashcode_in_arrayList() throws Exception {

        Boolean result = prateekList.get(0).hashCode() == prateekList.get(1).hashCode();
        assertEquals(true, result);
    }

    @Test
    public void test_to_check_the_unequality_of_Person_with_hashcode_in_arrayList() throws Exception {
        Person prateek = new Person("Prateek", 18);
        Person sumit = new Person("sumit", 18);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(prateek);
        people.add(sumit);
        Boolean result = people.get(0).hashCode() == people.get(1).hashCode();
        assertEquals(false, result);
    }

    //---------------using hashmap------------
    @Test
    public void test_to_check_the_equality_of_Person_in_hashMap() throws Exception {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, prateek1);
        map.put(2, prateek2);
        assertEquals(true, map.get(1).equals(map.get(2)));
    }

    @Test
    public void test_to_check_the_unequality_of_Person_in_hashMap() throws Exception {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, prateek1);
        map.put(2, sumit1);
        assertEquals(false, map.get(1).equals(map.get(2)));
    }

    @Test
    public void test_to_check_the_equality_of_Person_with_hashcode_in_hashMap() throws Exception {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, prateek1);
        map.put(2, prateek2);
        assertEquals(true, map.get(1).hashCode() == map.get(2).hashCode());
    }

    @Test
    public void test_to_check_the_inequality_of_Person_with_hashcode_in_hashMap() throws Exception {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, prateek1);
        map.put(2, sumit1);
        assertEquals(false, map.get(1).hashCode() == map.get(2).hashCode());
    }

    //--------------------using mapsets-------------
    @Test
    public void test_to_check_the_hashset_for_no_of_people() throws Exception {
        Set<Person> people = new HashSet<Person>();
        people.add(prateek1);
        people.add(sumit1);
        assertEquals(2, people.size());
    }

    @Test
    public void test_to_check_that_hashset_will_not_allow_to_add_same_person() throws Exception {
        Set<Person> people = new HashSet<Person>();
        people.add(prateek1);
        people.add(prateek1);
        assertEquals(1, people.size());
    }
}