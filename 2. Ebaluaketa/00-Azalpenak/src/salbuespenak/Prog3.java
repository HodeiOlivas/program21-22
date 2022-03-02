/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salbuespenak;

import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Prog3 {
    
    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner sc = new Scanner(System.in);
        int zenbatgarren;
        try {
            System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarren = sc.nextInt();
            System.out.println(zenbakiak[zenbatgarren]);
        } catch (Exception ex) {
            System.out.println("Ez duzu balio egokia sartu.");
        }
    }
    
}
