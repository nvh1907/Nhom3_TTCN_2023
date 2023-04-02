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
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s1= sc.next();
        System.out.println("Enter another String : ");
        String s2=sc.next();
        System.out.println(s1.toLowerCase()+"\n"+s2.toUpperCase());
    }
}
