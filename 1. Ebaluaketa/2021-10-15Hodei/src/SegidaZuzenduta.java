
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
public class SegidaZuzenduta {

    public static void main(String[] args) {

        int azkZenb;
        int mulZenb;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimatu nahi duzun azken zenbakia? ");
        azkZenb = in.nextInt();
        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        mulZenb = in.nextInt();

        for (int i = 1; i <= azkZenb; ++i) {

            if (i % mulZenb == 0) {
                System.out.println(i);
                System.out.println("====");
            } else {
                System.out.println(i);
            }

        }
    }
}
