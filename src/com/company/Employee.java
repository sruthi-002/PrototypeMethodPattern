package com.company;
public class Employee implements Details{
    private int id;
    private String name;
    private int Salary;
    public Employee() {
        System.out.println("Id"+"\t"+"Name"+"\t"+"Salary"+"\t");
    }
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }
    public void show()
    {
        System.out.println(id+"\t"+name+"\t"+Salary+"\t");
    }
    public Details getClone(){
        return new Employee(id,name,Salary);
    }
}
