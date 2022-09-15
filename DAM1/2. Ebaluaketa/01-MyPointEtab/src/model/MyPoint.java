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
public class MyPoint {

    private int x;
    private int y;

    MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

   

    public double distance() {

        return (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));

    }

    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);

    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*  public int[] getXY() {

       return
        
    }*/
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
