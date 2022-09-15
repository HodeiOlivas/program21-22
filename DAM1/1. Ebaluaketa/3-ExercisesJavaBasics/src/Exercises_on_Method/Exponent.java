/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises_on_Method;


import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Exponent {

    public static void main(String[] args) {

        int base, exp;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.println();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
        /* Los nombres en los diferentes "public static..." 
        
        NO tienen por que ser los mismos para que el programa lo entienda, esto es, el programa se centra en el ORDEN  que tiene cada variable para luego asi compartir un mismo valor.  */

    }

    public static int exponent(int bas, int exip) { // como es en el caso de base y bas comparten un mismo valor por el orden en el que estan puestos, hacen exactamente lo mismo exp y exip.

        int product = 1;

        for (int i = 0; i < exip; ++i) {

            product *= bas;

        }
        return product;
    }
}
