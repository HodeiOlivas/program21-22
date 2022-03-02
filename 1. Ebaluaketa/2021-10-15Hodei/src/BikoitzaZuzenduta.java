
import java.util.Arrays;
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
public class BikoitzaZuzenduta {

    public static void main(String[] args) {

        final int TAMAINA = 5;
        int[] zenbakiak;
        int[] temp = {0, 0, 0, 0, 0};
        int[] bikoitiak;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu itzazu " + TAMAINA + " zenbaki espazioz bananduta: ");
        zenbakiak = new int[TAMAINA];

        for (int i = 0; i < zenbakiak.length; ++i) {
            zenbakiak[i] = in.nextInt();

        }
       
            System.out.println(Arrays.toString(zenbakiak));
        

        bikoitiak = temp;
        for (int i = 0; i < zenbakiak.length; ++i) {

            bikoitiak[i] = zenbakiak[i] * 2;

        }
        System.out.println(Arrays.toString(bikoitiak));

    }

}
