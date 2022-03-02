/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import model.MyPoint;

/**
 *
 * @author olivas.hodei
 */
public class TextMyPoint {

    public static void main(String[] args) {
        System.out.println("a) Hiru  puntu sortu:");
        MyPoint p0 = new MyPoint(0, 0);
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);

        System.out.println("p0" + " => " + p0.toString());
        System.out.println("p1" + " => " + p1.toString());
        System.out.println("p2" + " => " + p2.toString());

        System.out.println();

        System.out.println("b) Distantziak koordenatu-jatorriarekiko:");

        System.out.println("p0" + " => " + p0.distance());
        System.out.println("p1" + " => " + p1.distance());
        System.out.println("p2" + " => " + p2.distance());

        System.out.println();

        System.out.println("c) Distantziak euren artean:");

        System.out.println("p0 tik p1ra =>" + p0.distance(2, 1));
        System.out.println("p0 tik p2ra =>" + p0.distance(4, 0));
        System.out.println("p1 tik p2ra =>" + p1.distance(4, 0));

        System.out.println();

        System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint((i + 1), (i + 1));
            System.out.println(points[i]);

        }

        System.out.println();
        System.out.println("e) Sortu 100 puntuko arrayLista:");
        MyPoint[] ehunpoints = new MyPoint[100];
        for (int i = 0; i < ehunpoints.length; i++) {
            ehunpoints[i] = new MyPoint((i + 1), (i + 1));
            System.out.println(ehunpoints[i]);

        }

        System.out.println();

        System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean)");

        MyPoint[] fivepoints = new MyPoint[5];
        for (int i = 0; i < fivepoints.length; i++) {
            fivepoints[i] = new MyPoint((int) (Math.random() * 9 + 0), (int) (Math.random() * 9 + 0));
            System.out.println(fivepoints[i]);
        }
    }

}
