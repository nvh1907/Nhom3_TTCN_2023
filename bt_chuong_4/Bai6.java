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
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        sc.close();
        int predecessor=n-1;
        int successor=n+1;
        System.out.println("predeccessor: "+predecessor);
        System.out.println("successor: "+successor);
    }
}
