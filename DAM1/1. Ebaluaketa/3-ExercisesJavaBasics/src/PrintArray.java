/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class PrintArray {

    public static void main(String[] args) {

        final int NUM_ITEMS;
        int items[];

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbakia: ");
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];

        //Hurrengo lerroetan erabiltzaileari zenbaki batzuk eskatuko dizkiogu.
        //Zenbaki horiek array baten gordeko ditugu
        if (items.length > 0) {
            System.out.print("Idatzi elementu guztien balioa: ");

            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }

        }
        in.close();

        //Hurrengo lerroetan arrayean gordeta dauzkagun balioak inprimatuko ditugu
        System.out.print("Zenbakiak dira: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {

                System.out.print(items[0]);
            } else {
                System.out.print(", " + items[i]);
            }

        }

        System.out.println("]");

    }

}
