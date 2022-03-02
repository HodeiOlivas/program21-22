/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class RunningNumberMod7Sum {

    public static void main(String[] args) {
        final int LOWERBOUND = 7;
        final int UPPERBOUND = 1000;
        int sum = 0;

        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {

            sum = sum + number;
            number = number + 7;
        }

        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}
