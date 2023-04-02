/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bt_chuong_4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mlc
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //use this if you are getting java.util.inputMismathchException
        sc.useLocale(Locale.US);
        System.out.println("What is the price of the product?");
        double price = sc.nextDouble();
        sc.close();
        double newPrice= price*0.9;
        System.out.println("After a 10% discount ,this product will be sold for $" + newPrice);
        
    }
}
