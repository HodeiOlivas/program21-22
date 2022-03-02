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
public class CircleComputation {

    public static void main(String[] args) {

        double radioa, diametroa, zirkunferentzia, area;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu radioa: ");
        radioa = in.nextDouble();

        diametroa = 2.0 * radioa;
        area = Math.PI * radioa * radioa;
        zirkunferentzia = 2.0 * Math.PI * radioa;
        System.out.println("---------------------------------------------");
        System.out.println("Zirkunferentzia da: " + zirkunferentzia);
        System.out.println("Area da: " + area);
        System.out.println("Diametroa da: " + diametroa);
        System.out.println("--------------------------------------------");
        System.out.printf("Circunference is: %.2f%n", zirkunferentzia);
        System.out.printf("Area is: %.2f\n", area);
        System.out.printf("Diameter is: %.2f\r\n", diametroa);
    }
}
