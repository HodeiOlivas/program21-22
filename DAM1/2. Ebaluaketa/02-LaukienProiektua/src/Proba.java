/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class Proba {

    public static void main(String[] args) {

        //  double zHamartarra;
        int zOsoa;
        int dadoa;

        //  zHamartarra = Math.random();
        //zHamartarra = zHamartarra * 6;
        // Zer egin beharko genuke  ausasko zifra bateko zenbakia lortzeko?
        //  zOsoa = (int)zHamartarra;
        // Zer egin beharko genuke tarte baten barruan daukagun ausasko zenbakia lortzeko ? Adibidez 1-6
        double numero;
        int zenb;
        numero = Math.random();
        numero = numero * 6 + 1;
        zenb = (int) numero;

        if (zenb > 0 && zenb <= 6) {

            System.out.println(zenb);

        }

        //   System.out.println("Math.random() => " + zHamartarra);
    }

}
