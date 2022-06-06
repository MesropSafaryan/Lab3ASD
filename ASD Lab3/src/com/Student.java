package com;

public class Student {
    private String name;
    private String surname;
    private float height;
    private float weight;
    private int studentTicket;


    public Student(String name, String surname, float height, float weight, int studentTicket) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.studentTicket = studentTicket;
    }

    public int GetStudentTicket() {
        return studentTicket;
    }

    public String toString()
    {
        return "Студент: { ім'я: "+ name + "; прізвище: "+ surname + "; зріст: "+ height +
                "; вага: "+ weight + "; студентський квиток: "+ studentTicket +"}";
    }
}


