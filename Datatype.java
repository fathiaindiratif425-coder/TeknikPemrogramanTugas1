/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teknikpemrograman;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;
public class Datatype {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();   // jumlah test case
            
            for (int i = 0; i < t; i++) {
                
                String input = sc.next();
                
                try {
                    long n = Long.parseLong(input);
                    
                    System.out.println(n + " can be fitted in:");
                    
                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    
                    System.out.println("* long");
                    
                } catch (NumberFormatException e) {
                    System.out.println(input + " can't be fitted anywhere.");
                }
            }
        } 
    }
}
