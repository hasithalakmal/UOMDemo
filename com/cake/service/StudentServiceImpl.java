package com.cake.service;

import com.cake.model.Student;

/**
 * Created by hasithagamage on 3/1/17.
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void createStudent(String stuName, int stuID) {
        Student s = new Student(stuID, stuName);
        System.out.println(s.toString());

    }

    @Override
    public Student getStudent(int stuID) {
        Student s = new Student(stuID, "aaa");
        System.out.println(s.toString());
        return s;
    }
}
