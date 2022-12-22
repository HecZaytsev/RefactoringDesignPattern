/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


import java.util.Scanner;

import Prototype.DesignPatternPrototype;
import Visitor.*;

import java.util.*;

/**
 *
 * @author hecto
 */
public class RefactoringDesignPatterns {

    public static char menu(){
        System.out.println(" ");
        System.out.println("Escolha o Design Pattern");
    
        System.out.println("1 - Visitor");
        System.out.println("2 - Composite");
        System.out.println("3 - Adapter");
        System.out.println("4 - Prototype");
        System.out.println("5 - Bridge");
        System.out.println("6 - Interpreter");
        System.out.println("7 - Builder");
        System.out.println("8 - State");
        System.out.println("9 - Abstract Factory");
        System.out.println("A - Proxy");
        System.out.println("B - Chain of Responsability");
        System.out.println("X - Sair");
        
        Scanner in = new Scanner(System.in);
        char opc = in.nextLine().charAt(0);;
        
        return opc;
    }
    
    public static void main(String[] args) {
        
        char opc = ' ';

        DesignPatternVisitor visitor;
        DesignPatternComposite composite;
        DesignPatternPrototype prototype;

        while (opc != 'X'){

            opc = menu();

            switch(opc){

                case '1': //Visitor
                    System.out.println("É um padrão de projeto comportamental que permite que você");
                    System.out.println("separe algoritmos dos objetos de suas classes nos quais eles operam.");

                    visitor = new DesignPatternVisitor() ;
                    visitor.exemplo();

                    break;
                case '2': //Composite
                    System.out.println("É um padrão de projeto estrutural que permite que você alinhe objetos em estruturas de");
                    System.out.println("árvores e então trabalhe com essas estruturas como se elas fossem objetos individuais.");

                    composite = new DesignPatternComposite() ;
                    composite.exemplo();

                    break;
                case '3': //Adapter
                    System.out.println("É um padrão de projeto estrutural que possibilita que objetos com interfaces");
                    System.out.println("incompatíveis colaborarem entre si.");

                    prototype = new DesignPatternPrototype();
                    prototype.exemplo();

                    break;
                case '4': //Prototype
                    System.out.println("É um padrão de projeto de criação que permite copiar objetos existentes sem");
                    System.out.println("fazer seu código ficar dependente de suas classes.");
                    break;
                case '5': //Bridge
                    System.out.println("É um padrão de projeto estrutural que possibilita que você divida uma classe grande ou um conjunto de classes ");
                    System.out.println("profundamente ligadas em duas hierarquias separadas, abstração e implementação, que podem ser desenvolvidas independentemente umas das outras.");
                    break;
                case '6': //Interpreter
                    System.out.println("É um dos padrões de design comportamental. O padrão interpretador é usado para definir uma representação");
                    System.out.println("gramatical para uma linguagem e fornecer um intérprete para lidar com essa gramática.");
                    break;
                case '7': //Builder
                    System.out.println("É um padrão de projeto criacional que permite a você construir objetos complexos passo a passo.");
                    System.out.println("O padrão possibilita que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.");
                    break;
                case '8': //State
                    System.out.println("É um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu ");
                    System.out.println("estado interno muda. Assim parecendo como se o objeto mudasse de classe.");
                    break;
                case '9': //Abstract Factory
                    System.out.println("É um padrão de projeto criacional que permite que você produza");
                    System.out.println("famílias de objetos relacionados sem ter que especificar suas classes concretas.");
                    break;
                case 'A': //Proxy
                    System.out.println("É um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro objeto. ");
                    System.out.println("Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.");
                    break;
                case 'B': //Chain of Responsability
                    System.out.println("É um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers.");
                    System.out.println("Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo.");
                    break;
            }



        }


    }
    
    
    
    
    
}
