
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
public class InputValidation {

    public static void main(String[] args) {

        int numberin;
        boolean esvalido;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu 0-10 edo 90-100 artean dagoen edozein zenbaki: ");
        numberin = in.nextInt();
        esvalido = false;
        do {
            if (numberin >= 0 && numberin <= 10 || numberin >= 90 && numberin <= 100) {

                esvalido = true;

            } else {
                System.out.println("Ez da valid zenbaki hau...");

            }
        } while (!esvalido);

        System.out.println("Sartu duzu: " + numberin);
        esvalido = true;
    }
}
