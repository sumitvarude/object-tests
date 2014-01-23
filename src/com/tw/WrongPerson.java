package com.tw;

public class WrongPerson implements Comparable<WrongPerson>{
    String name;
    int age;

    public WrongPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        WrongPerson person = (WrongPerson) o;
        return !(this.name.equals(person.getName()));
    }

    @Override
    public int hashCode() {
        int result = (int) (Math.random()*100);
        return result;
    }

    @Override
    public int compareTo(WrongPerson o) {
        return 0;
    }
}