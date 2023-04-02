/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bt_chuong_4;

import java.util.Scanner;

/**
 *
 * @author mlc
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1=sc.nextInt();
        System.out.println("Enter anothor number: ");
        int n2=sc.nextInt();
        sc.close();
        double average = (n1+n2)/2f;
        System.out.println("The average is "+average);
    }
}
