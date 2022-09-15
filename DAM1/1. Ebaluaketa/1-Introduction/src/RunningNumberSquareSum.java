/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class RunningNumberSquareSum {

public static void main(String[] args){
    int num = 1;
    int square;
    int sum = 0;
    while(num <= 100){
        square = (num * num);
        sum = sum + square;
        num++;
    }
    System.out.println(sum);

}
}

