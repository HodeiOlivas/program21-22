
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author olivas.hodei
 */
public class Menua {

    Laukia[] laukiak;
    final int LAUKI_KOP = 10;
    private int sortutakoak;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aukera = 0;

        do {
            System.out.println();
            System.out.println("LAUKIAK");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Laukien arraya sortzeko");
            System.out.println("6.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    sortu();

                    break;
                case 2:
                    inprimatu();
                    break;
                case 3:
                    marraztu();
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                    arrayaBete();
                    break;
                case 6:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 6);
    }

    public static void sortu() {
        int zabalera;
        int altuera;
        Scanner in = new Scanner(System.in);
        System.out.println("LAUKI BERRIA SORTZEN...");

        System.out.print("Sartu zabalera: ");
        zabalera = in.nextInt();

        System.out.print("Sartu altuera: ");
        altuera = in.nextInt();
        laukiak[] = new Laukia(zabalera, altuera);

    }

    public static void inprimatu() { 
    }

    public static void marraztu() {
    }

    public static void handiena() {
    }

    public static void arrayaBete() {

        for (int i = 0; i < LAUKI_KOP; i++) {
            laukiak[i] = new Laukia((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
            sortutakoak++;
        }

    }

}
