package org.andersen.lab.lesson3;

public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name='" + name + '\'' + ", position='"
                + position + '\'' + ", email='" + email + '\'' +
                ", phone='" + phone + '\'' + ", salary=" + salary +
                ", age=" + age + '}';
    }

//    public void printInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Position: " + position);
//        System.out.println("E-mail: " + email);
//        System.out.println("Phone number: " + phone);
//        System.out.println("Salary: " + salary);
//        System.out.println("Age: " + age);
//    }
}
