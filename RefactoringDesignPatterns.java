/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hector.refactoringdesignpatterns;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class RefactoringDesignPatterns {

    public void menu(){
        System.out.println("Escolha o Design Patterns");
        System.out.println("1 - Visitor");
        System.out.println("2 - Composite");
        System.out.println("3 - Adapter");
        System.out.println("4 - Prototype");
        System.out.println("5 - Bridge");
        System.out.println("6 - Interpreter");
        System.out.println("7 - Builder");
        System.out.println("8 - State");
        System.out.println("9 - Abstract Factory");
        System.out.println("10 - Proxy");
        System.out.println("11 - Chain of Responsability");
        
        Scanner in = new Scanner(System.in);
        String opc = in.nextLine();
        
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    
    
    
    
}
