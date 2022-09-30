package com.heniux.jinx.demo2;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("alex");
        s1.setAge(40);
        System.out.println(s1.getName() + ": " + s1.getAge());
        Student s2 = new Student("jun", 39);
        System.out.println(s2.getName() + ": " + s2.getAge());

    }
}
