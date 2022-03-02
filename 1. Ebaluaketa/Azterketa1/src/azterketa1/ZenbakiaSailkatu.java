/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azterketa1;

import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class ZenbakiaSailkatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int zenb;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbaki oso postibo bat: ");
        zenb = in.nextInt();

        while (zenb <= 0) {
            System.out.println("Zenbaki ezegokia");
            System.out.print("Sartu zenbaki oso postibo bat: ");
            zenb = in.nextInt();

        }
        if (zenb % 2 == 0 && zenb < 100) {
            System.out.println("Sartu duzun zenbakia txikia bikoitia da");

        } else if (zenb % 2 == 0 && zenb > 100) {
            System.out.println(" Sartu duzun zenbakia handia bikoitia da");

        } else if (zenb % 2 != 0 && zenb < 100) {
            System.out.println("Sartu duzun zenbakia txikia bakoitia da");

        } else {
            System.out.println("Sartu duzun zenbakia handia bakoitia da");

        }

    }
}
