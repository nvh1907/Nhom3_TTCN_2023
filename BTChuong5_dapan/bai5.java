/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTChuong5_dapan;

import java.util.Scanner;

/**
 *
 * @author mlc
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        }
        else {
            System.out.println(n+" is odd");    
        }
    }
}
