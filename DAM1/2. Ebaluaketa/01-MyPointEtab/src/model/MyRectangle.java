/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author olivas.hodei
 */
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getAzalera() {
        double altuera, zabalera;
        altuera = topLeft.getY() - bottomRight.getY();
        altuera = Math.abs(altuera);

        zabalera = topLeft.getX() - bottomRight.getX();
        zabalera = Math.abs(zabalera);
        return altuera * zabalera;
    }

    public double getPerimetroa() {
        double altuera, zabalera;
        altuera = topLeft.getY() - bottomRight.getY();
        altuera = Math.abs(altuera);

        zabalera = topLeft.getX() - bottomRight.getX();
        zabalera = Math.abs(zabalera);
        return (altuera * 2) + (zabalera * 2);
    }

    @Override
    public String toString() {
        return "MyRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

}


