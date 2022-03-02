/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class ExtractDigits {

    public static void main(String[] args) {

        int n = 4238;
        int digit;

        while (n > 0) {
            digit = n % 10;

            System.out.print(" " + digit);
            n = n / 10;
        }
    }

}
