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
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("How old are you ? ");
        int age = sc.nextInt();
        sc.close();
        int born = 2023-age;
        System.out.println("you were born in "+ born);
    }
}
