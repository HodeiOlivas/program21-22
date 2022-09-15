/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class Product1ToN {

    public static void main(String[] args) {

        int sum = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {

            sum *= number;

        }

        System.out.println("Product is:" + sum);

    }
}
