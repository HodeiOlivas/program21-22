/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Erosketa;
import model.Produktua;

/**
 *
 * @author olivas.hodei
 */
public class ErosketenKudeaketa {

    private static ArrayList<Bezeroa> kontaktuak;
    private static ArrayList<Produktua> produktuKatalogoa;
    private static ArrayList<Erosketa> erosketenZerrenda;
     private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
   
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("********************************************************");
            System.out.println("EROSKETEN KUDEAKETA");
            System.out.println("------------------------------------------");
            System.out.println("1. Create (Datuak gehitu) ");
            System.out.println("2. Read (Ikusi)");
            System.out.println("3. Update (Aldatu)");
            System.out.println("4. Delete (Ezabatu)");
            System.out.println("5. Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    create();
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    read();
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    update();
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    delete();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
    }

    public static void create() {
        ArrayList<Produktua> erosketakoProduktua = new ArrayList<>();
        ArrayList<Integer> erosketakoUnitateak = new ArrayList<>();
      

        char produktuenAukera= 'E';

        System.out.println("Erosketa berria");
        System.out.println("============================");
        System.out.print("Sartu erosketa kodea: ");
        String kodea = in.next();
        System.out.print("Sartu bezero kodea: ");
        String bezerokodea = in.next();
    
            }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void read() {

    }

    public static void update() {

    }

    public static void delete() {

    }

}
