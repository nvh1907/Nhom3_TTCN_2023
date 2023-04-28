/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTchuong6;

/**
 *
 * @author mlc
 */
public class Employee {
    String name;
    String dateOfBirth;
    String wasHireOn;
    String job;
    double salary;
    
    void promote(double amount){
        this.salary+= amount;
    }
    double calculateAnnualSalary(){
        return this.salary*12;
    }
    void show(){
        System.out.println("Name: "+this.name);
        System.out.println("Date of birth: "+this.dateOfBirth);
        System.out.println("Hired on :"+this.wasHireOn);
        System.out.println("Job: "+this.job);
        System.out.println("Salary : "+this.salary);
        System.out.println("Annual Salary : "+this.calculateAnnualSalary());
    }
}
