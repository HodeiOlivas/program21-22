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
public class Swap2Integers {

    public static void main(String[] args) {

        int number1, number2;
        int temp;
        
        

        Scanner in = new Scanner(System.in);
        System.out.print("Lehenengo zenbakia: ");
        number1 = in.nextInt();

        System.out.print("Bigarren zenbakia: ");
        number2 = in.nextInt();
        
        temp = number2;
        number2 = number1;
        number2 = temp;
        System.out.println("  "+number2);
        System.out.println(" "+number1);
       
    }
}
