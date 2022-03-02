/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azterketa1;

import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Izenak {

    public static void main(String[] args) {

        /* String[] izenak = {"Jon", "Jone", "June", "Julian", "Julen"};
        int izena;

        Scanner in = new Scanner(System.in);
        System.out.print("Noren bila zabiltza? ");
        izena = in.nextInt();

        for (int i = 0; i < izenak.length; ++i) {
             
        if (izenak[i].equals(izena)) {
    
                System.out.println(izena + " zerrendako " +(i + 1) +".a da");
          
            } else {
            ++izena;
            if(izena == izenak.length) {
                System.out.println(izena + " ez dago zerrendan");
            }
        }*/
        String[] izena;

        izena = new String[5];

        String non;
        izena[0] = "Jon";
        izena[1] = "Jone";
        izena[2] = "June";
        izena[3] = "Julian";
        izena[4] = "Julen";

        int has = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Noren bila zabiltza? ");
        non = in.next();

        for (int i = 0; i < izena.length; ++i) {
            if (izena[i].equals(non)) {

                System.out.println(non + " zerrendako " + (i + 1) + ".a da");

            } else {
                ++has;
                if (has == izena.length) {
                    System.out.println(non + " ez dago zerrendan");
                }

            }
        }
    }
}
