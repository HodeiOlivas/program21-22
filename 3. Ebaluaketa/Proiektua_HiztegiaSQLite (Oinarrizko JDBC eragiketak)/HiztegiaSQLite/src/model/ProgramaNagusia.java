/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class ProgramaNagusia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Konektatu");
            System.out.println("2.- Terminoak aldatzeko");
            System.out.println("3.- Terminoak ezabatzeko");
            System.out.println("4.- Terminoak gehitzeko");
            System.out.println("5.- Terminoak inprimatzeko");
            System.out.println("6.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    SQLliteKudeatu.terminoaAldatu(2, "marrubia", "pera");
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    SQLliteKudeatu.delete(3);
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    SQLliteKudeatu.terminoaGehitu("platanoa", "plátano");
                    break;
                case 5:
                    System.out.println("Bostgarren aukera aukeratu duzu.");
                    SQLliteKudeatu.terminoakImprimatu();
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 6);
    }

}
