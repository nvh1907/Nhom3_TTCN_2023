/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package BTchuong6;

/**
 *
 * @author mlc
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Employee e=new Employee();
        e.name="Lucas";
        e.dateOfBirth="25/10/2002";
        e.wasHireOn="01/09/2017";
        e.job="CEO";
        e.salary=50000.0;
        e.promote(1000.0);
        double annualSalary=e.calculateAnnualSalary();
        System.out.println("Annual Salary =" + annualSalary)    ;
        
        e.show();
    }
}
