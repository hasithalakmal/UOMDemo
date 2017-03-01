package com.cake.model;

/**
 * Created by hasithagamage on 3/1/17.
 */
public class Student {
    private int stuID;
    private String studentName;
    private int grade;

    public Student(int stuID, String studentName) {
        this.setStuID(stuID);
        this.setStudentName(studentName);
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + getStuID() +
                ", studentName='" + getStudentName() + '\'' +
                ", grade=" + getGrade() +
                '}';
    }


}
