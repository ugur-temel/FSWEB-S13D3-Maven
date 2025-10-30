package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    double salary;
    String birthPlace;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName,String lastName,int age, String job, double salary, String birthPlace){
        this(firstName, lastName, age);
        this.job = job;
        this.salary = salary;
        this.birthPlace = birthPlace;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return  age;
    }
    public boolean isTeen(){
        return age>=13 && age<=19;
    }
}
