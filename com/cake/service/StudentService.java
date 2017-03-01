package com.cake.service;

import com.cake.model.Student;

/**
 * Created by hasithagamage on 3/1/17.
 */
public interface StudentService {
    void createStudent(String stuName, int stuID);

    Student getStudent(int stuID);
}
