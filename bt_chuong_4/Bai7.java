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
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(2*n);
        System.out.println(Math.pow(n,2));//n*n
        System.out.println(n/2.0f);
        System.out.println(Math.sqrt(n));
    }
}
