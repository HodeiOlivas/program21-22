
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
public class PrintArrayInStars {

    public static void main(String[] args) {

        final int NUM_ITEMS;
        int[] items;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbakia: ");
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.print("Idatzi elementu guztien balioa: ");

            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }

        }

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");

            for (int starNo = 1; starNo <= items[idx]; ++starNo) {

                System.out.print("*");

            }
            System.out.print("(" + items[idx]);
            System.out.println(")");

        }
    }
}
