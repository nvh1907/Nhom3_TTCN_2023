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
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter=sc.next();
        if(letter.toUpperCase().equals("Y")){
            System.out.println("Yes");   
        }else if(letter.toUpperCase().equals("N")){
            System.out.println("No");
        }else{
            System.out.println("Invalid a");
    }
}
}

