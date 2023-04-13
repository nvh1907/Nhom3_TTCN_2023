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
public class bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = sc.nextLine();
        
        System.out.println("In what year were you born ?");
        int age= sc.nextInt();
        
        if(age>=16){
            System.out.println(name + ",you are "+age+"and you can drive in the US");
            
        }else
        {
            System.out.println(name +", you are "+age+" and you can not drive in the US");
        }
    }
}
