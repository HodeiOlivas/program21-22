/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.Liburua;

/**
 *
 * @author olivas.hodei
 */
public class ProgramaNagusiaArrayListekin {

    private static ArrayList<Liburua> books;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        books = Liburua.getLiburuSortaArrrayaList();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("-1.- Liburua gehitu");
            System.out.println("0.- Liburua ezabatu");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case -1:

                    liburuaGehitu();
                    break;
                case 0:
                    liburuaEzabatu();
                    break;
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() { //ALDATUTAKO METODOA
        int i = 0;
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==============================");
        while (i < books.size()) {
            if (books.get(i) != null) {
                System.out.println(books.get(i).toString());
            }
            i++;
        }
    }

    public static void liburuenDatuGuztiakIkusi() { //ALDATUTAKO METODOA
        int orriKop = 0, kont = 0;

        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < books.size(); i++) {

            if (books.get(i) != null) {
                System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", i + 1, books.get(i).getIzenburua(), books.get(i).getEgilea(), books.get(i).getOrriKopurua(), books.get(i).getUrtea(), books.get(i).getGaia(), books.get(i).getHizkuntza(), books.get(i).getPrezioa(), books.get(i).getKodea());
                orriKop = orriKop + books.get(i).getOrriKopurua();
                kont++;
            }
        }
        System.out.println();
        System.out.printf("Liburuen batez besteko orri kopurua: %.2f", (double) orriKop / kont);
        System.out.println();
    }

    public static void liburuenPrezioaIrudikatu() { //ALDATUTAKO METODOA

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i) != null) {
                System.out.printf("%35s: %s\n", books.get(i).getIzenburua(), books.get(i).getPrezioaIzartxotan());
            }
        }
    }

    public static void zaharrenaBilatu() { //ALDATUTAKO METODOA
        int max = books.get(0).getUrtea(), i, pos = 0;

        for (i = 0; i < books.size(); i++) {
            if (books.get(i) != null) {
                if (books.get(i).getUrtea() < max) {
                    max = books.get(i).getUrtea();
                    pos = i;
                }
            }
        }
        System.out.printf("Liburu zaharrena %d urtean argitaratu zen: %s", max, books.get(pos).toString());
    }
    public static void liburuaGehitu() {
        String hizkera;
        char hizkuntza;
        Scanner sc = new Scanner(System.in);
         System.out.println("Sartu nahi duzun liburua: "); 
         String name = sc.next();
          System.out.println("Egilea: "); 
          String egilea = sc.next();
         System.out.println("Zenbat orri ditu: ");
         int orriak = sc.nextInt();
         System.out.println("Noizkoa da: ");
         int urtea = sc.nextInt();
         System.out.println("zer gai du: ");
         String gaia = sc.next();
        
         do {
            System.out.println("Zer hizkuntzatan dago idatzita? ");
            hizkera = sc.next();

            if (hizkera.length() == 1) {
                switch (hizkera.toLowerCase()) {

                    case "e":
                        hizkuntza = 'e';
                        break;
                    case "g":
                        hizkuntza = 'g';
                        break;
                    case "i":
                        hizkuntza = 'i';
                        break;
                    default:
                        hizkuntza = '?';
                        break;
                }
            } else {
                System.out.println("Bakarrik karaktere bat jarri");
                hizkuntza = '?';
            }
        } while (hizkera.length() != 1);
        System.out.println("Zenbateko prezioa du? ");
        double prezioa = sc.nextDouble();
         
        books.add(new Liburua(name, egilea, orriak, urtea, gaia, hizkuntza, prezioa));
         
         
          
     
        
    }
    
    public static void liburuaEzabatu() {
        
        Scanner sc = new Scanner( System.in);
        System.out.println("Sartu ezabatu nahi duzun librua: ");  
        int pos= sc.nextInt();
        
        books.remove(pos-1);
        
      liburuenDatuGuztiakIkusi();
    }

}
