package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String name;
        int Salary;
        Scanner in = new Scanner(System.in);
        id = in.nextInt();
        name=in.next();
        Salary = in.nextInt();
        Employee e1 = new Employee(id , name,Salary);
        e1.show();
        Employee e2 = (Employee)e1.getClone();
        e2.show();
    }
}
