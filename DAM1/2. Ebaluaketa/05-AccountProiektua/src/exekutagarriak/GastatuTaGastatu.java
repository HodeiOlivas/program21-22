/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Account;

/**
 *
 * @author olivas.hodei
 */
public class GastatuTaGastatu {

    public static void main(String[] args) {

        Account kontuBerria = new Account("2095-03", "Ruben", 1000);
        int zenbat = 150;
        int zenbatetan = 0;

        while (kontuBerria.getBalance() >= zenbat) {

            kontuBerria.debit(zenbat);
            zenbatetan++;

        }
        System.out.println("Triste nago " + zenbat + " euro atera dut " + zenbatetan + " aldiz eta orain " + kontuBerria.getBalance() + " euro besterik ez zait geratzen kontuan. :-(");

    }
}
