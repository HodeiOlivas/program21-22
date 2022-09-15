/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.zirkuluenproiektua;

/**
 *
 * @author olivas.hodei
 */
/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle {    // Save as "TestCircle.java"

    public static void main(String[] args) {   // Program entry point
        // Declare and Construct an instance of the Circle class called c1

        Circle c1 = new Circle(2.0, "blue");
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle();
        Circle c4 = new Circle(5.0, "blue");

        System.out.printf("%-8s %15s %15s %15s \n", "Zirkulua", "Erradioa", "Kolorea", "Azalera");

        System.out.println("========================================================================");
        System.out.printf("%-8s %15.2f %15s %15.2f \n", "c1", c1.getRadius(), c1.getColor(), c1.getArea());
        System.out.printf("%-8s %15.2f %15s %15.2f \n", "c2", c2.getRadius(), c2.getColor(), c2.getArea());
        System.out.printf("%-8s %15.2f %15s %15.2f \n", "c3", c3.getRadius(), c3.getColor(), c3.getArea());
        System.out.printf("%-8s %15.2f %15s %15.2f \n", "c4", c4.getRadius(), c4.getColor(), c4.getArea());

        System.out.println("ToString erabiliz:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //10 aldiz handitzeko
        for (int i = 0; i < 10; ++i) {
            System.out.println(c1);
            c1.setRadius(c1.getRadius() + 1);
            if (i == 5) {
            }
        }

    }
}
