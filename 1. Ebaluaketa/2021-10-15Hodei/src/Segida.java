/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Segida {

    public static void main(String[] args) {
        int sum = 0;
        int zenbakia = 1;
        int azkena;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein da inprimitu nahi duzun azken zenbakia? ");
        azkena = in.nextInt();
        zenbakia = azkena;

        for (int i = zenbakia; i >= azkena; ++i) {
            sum = sum + i;
         

        }
 System.out.println( sum);
    }

}
