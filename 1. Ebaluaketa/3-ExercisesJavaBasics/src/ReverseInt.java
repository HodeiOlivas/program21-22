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
public class ReverseInt {

    public static void main(String[] args) {

        int inNumber;
        int inDigit;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbakia: ");
        inNumber = in.nextInt();

        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print("" + inDigit);
            inNumber /= 10;
        }
        System.out.println("");
    }
}
