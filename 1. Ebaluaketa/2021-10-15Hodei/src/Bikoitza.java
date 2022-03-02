/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Bikoitza {

    public static void main(String[] args) {

        final int zenbakiak ;
        int[] zenbKopuru;
        int zenbKopuru2;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu bost zenbakia: ");
        zenbakiak = in.nextInt();

        zenbKopuru = new int[zenbakiak];

        if (zenbKopuru.length > 0) {
            System.out.print("Sartu itzazu 5 zenbaki espazioz bananduta: ");
         
            for (int i = 0; i < zenbKopuru.length; ++i) {
                zenbKopuru[i] = in.nextInt();

            }
 
        }
        System.out.println(Arrays.toString(zenbKopuru));
      
         
    }
    
}
