
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
public class LaukiAskoSortu {

    public static void main(String[] args) {

        final int laukiKantitatea;
        Laukia[] laukiak;
        int zabalera;
        int altuera;

        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        laukiKantitatea = in.nextInt();

        laukiak = new Laukia[laukiKantitatea];

        for (int i = 0; i < laukiak.length; ++i) {
            System.out.println((i+1) + " LAUKIAREN DATUAK: ");

            System.out.print("Zabalera: ");
            zabalera = in.nextInt();
            System.out.print("Altuera: ");
            altuera = in.nextInt();

            laukiak[i] = new Laukia(zabalera, altuera);

        }

        System.out.printf("%-8s %15s %15s %15s %15s %15s  \n", "Laukia", "Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("=========================================================================================================");

        for (int i = 0; i < laukiak.length; ++i) {
            
       
            System.out.printf("%-8s %15s %15s %15s %15s %15s  \n", laukiak[i], laukiak[i].getWidth(), laukiak[i].getHeight(), laukiak[i].getArea(), laukiak[i].getPerimeter(), laukiak[i].getMota());

        }
    }

}
