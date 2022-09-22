package org.andresen.lab.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Master", "Ivanov@company.com", "89001111111", 70000, 40);
        employees[1] = new Employee("Petrov", "Woodworker", "Petrov@company.com", "89002222222", 60000, 60);
        employees[2] = new Employee("Sidorov", "Engineer", "Sidorov@company.com", "89003333333", 100000, 50);
        employees[3] = new Employee("Popova", "Engineer", "Popova@company.com", "89004444444", 100000, 28);
        employees[4] = new Employee("Smirnova", "Director", "Smirnova@company.com", "89005555555", 150000, 38);
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
