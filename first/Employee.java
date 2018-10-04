package com.company;

public class Employee {
    static int countId = 0;
    private int ID;
    private String name;
    private String position;
    private float salary;

    Employee(String name) {
        this.ID = countId++;
        this.name = name;
        this.position = "worker";
        this.salary = 5000.0f;
    }

    Employee(String name, String position) {
        this(name);
        this.position = position;
        if (this.position == "worker")
            this.salary = 5000.0f;
        else
            this.salary = 6000.0f;
    }

    Employee(String name, String position, float salary) {
        this(name, position);
        this.salary = salary;
    }

    public String toString() {
        return "ID = " + this.ID + " Name = " + this.name + " Position = " + this.position +
                " Salary = " + this.salary;
    }

    static void ShowEmployees(Employee[] EmployeeArray) {
        for (Employee Emp: EmployeeArray) {
            System.out.println(Emp);
        }
    }

    static void SalarSumm(Employee[] EmployeeArray) {
        long summ = 0;
        int maxSalaryPos = 0;
        for (int i = 0; i < EmployeeArray.length; i++) {
            summ += EmployeeArray[i].salary;
            if (EmployeeArray[i].salary > EmployeeArray[maxSalaryPos].salary)
                maxSalaryPos = i;
        }
        System.out.println("Position with max salary = " + EmployeeArray[maxSalaryPos].position);
        System.out.println("Summ salary = " + summ);
    }
}
