/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author qz211
 */

import java.util.Scanner;

public class UserName {
    public static void main (String []args){
        Scanner kbd = new Scanner (System.in);
        
        String name;
        int pw;
        
        System.out.println("enter your name");
        name = kbd.nextLine();
        
        System.out.println("enter your password");
        pw = kbd.nextInt();
        
        System.out.println("Hello " + name + ". Welcome to CSC200 class! and Your password is " + pw);
    }
}