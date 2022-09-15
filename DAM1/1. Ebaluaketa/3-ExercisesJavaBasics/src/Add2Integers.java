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
public class Add2Integers {

    public static void main(String[] args) {

        int number1, number2, sum;
        

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu lehenengo zenbakia: ");
        number1 = in.nextInt();
        System.out.println("Sartu bigarren zenbakia: ");
        number2 = in.nextInt();
        in.close();

        sum = number1 + number2;

        System.out.println("The sum is: " + sum);
    }

}
