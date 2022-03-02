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
public class SumProductMinMax3 {

    public static void main(String[] args) {

        int number1, number2, number3, sum;
        int product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.println("Lehenengo zenbakia: ");
        number1 = in.nextInt();

        System.out.println("Bigarren zenbakia: ");
        number2 = in.nextInt();
        System.out.println("Hirugarren zenbakia: ");
        number3 = in.nextInt();
        sum = number1 + number2 + number3;

        System.out.println("The sum is: " + sum);
        product = number1 * number2 * number3;
        System.out.println("The product is: " + product);

        {
            min = number1;

            if (number2 < min) {
                min = number2;
            }
            if (number3 < min) {
                min = number3;
            }

            max = number1;

            if (number2 > max) {
                max = number2;
            }
            if (number3 > max) {
                max = number3;
            }

            System.out.println("min: " + min);
            System.out.println("max: " + max);

            in.close();

        }
    }

}
