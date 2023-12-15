package org.example.scanner;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num =scn.nextInt();

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Enter the opt");
        String opt = scn1.next();

        Scanner  scn2= new Scanner(System.in);
        System.out.println("Enter the 2nd number");
        int num2 =scn.nextInt();

        switch ("opt"){
            case "AB":
                 int total = num+num2;
                System.out.println(total);
                System.out.println("done add");
                break;
            case "BB":
                int total1 = num-num2;
                System.out.println(total1);
                System.out.println("done add");
                break;
            case "CB":
                int total2 = num*num2;
                System.out.println(total2);
                System.out.println("done add");
                break;
            case "DB":
                int total3 = num/num2;
                System.out.println(total3);
                System.out.println("done add");
                break;
        }




    }
}
