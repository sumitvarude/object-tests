package com.tw.comparators;

import com.tw.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/14/14.
 */
public class CompareTest {
    Person swamiji;
    Person kunal;
    Person digvijay;
    List<Person> people;
    @Before
    public void setUp() throws Exception {
        swamiji = new Person("Swamiji", 3);
        kunal = new Person("Kunal", 50);
        digvijay = new Person("Digvijay", 35);
        people = addPeopleToList(digvijay, kunal, swamiji);
    }

    public static List addPeopleToList(Person... persons){
        List<Person> people = new ArrayList<Person>();
        for (Person person : persons) {
            people.add(person);
        }
        return people;
    }

    @Test
    public void testForComparatorOnLengthOfPersonName() throws Exception {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length() - p2.getName().length();
            }
        });

        assertEquals(true,kunal.equals(people.get(0)));
        assertEquals(true,swamiji.equals(people.get(1)));
        assertEquals(true,digvijay.equals(people.get(2)));
    }

    @Test
    public void testForComparatorByNames() throws Exception {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        assertEquals(true,digvijay.equals(people.get(0)));
        assertEquals(true,kunal.equals(people.get(1)));
        assertEquals(true,swamiji.equals(people.get(2)));
    }

    @Test
    public void testForComparatorByAge() throws Exception {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge()-p2.getAge();
            }
        });

        assertEquals(true,swamiji.equals(people.get(0)));
        assertEquals(true,digvijay.equals(people.get(1)));
        assertEquals(true,kunal.equals(people.get(2)));
    }
    @Test
    public void testForComparatorByReverseOfNames() throws Exception {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName()) * -1 ;
            }
        });

        assertEquals(true,swamiji.equals(people.get(0)));
        assertEquals(true,kunal.equals(people.get(1)));
        assertEquals(true,digvijay.equals(people.get(2)));
    }

}
