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
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter the temperature in Celsius: ");
        double c=sc.nextDouble();
        sc.close();
        double f=9/5.0*c+32;
        System.out.println(c+"°C is equivalent to "+ f +"°F ");
    }
}
