package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petrov Petr Petrovich");
        student.setGroup("MVT-6");
        student.setAccession(new Date());

        System.out.println(student.getFio() + " added to the group " + student.getGroup());
    }
}
