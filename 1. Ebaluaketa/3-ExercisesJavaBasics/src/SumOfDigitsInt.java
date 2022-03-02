
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
public class SumOfDigitsInt {

    public static void main(String[] args) {

        int inNumber;
        int inDigit;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu zenbakia: ");
        inNumber = in.nextInt();

        while (inNumber > 0) {
            inDigit = inNumber % 10;
            sum = sum + inDigit;
            
            inNumber /= 10;
           
        }
                
        System.out.println("" + sum);
    }
}
