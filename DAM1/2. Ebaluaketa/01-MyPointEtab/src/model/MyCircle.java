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
public class MyCircle {

    private MyPoint center;
    private double radius;

    public MyCircle() {
        this.center = new MyPoint();
        this.radius = 1.0;
    }

    public MyCircle(int x, int y, double radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    public boolean isInside(MyPoint p) {
        double sum, distance;
        sum = radius;
        if (radius > p.distance()) {
            return true;
        } else {
            return false;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

                                   
        public MyPoint getCenter() {
        return this.center;
    }
     
    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

  /*  public int[] getCenterXY() {
        return center.getXY();
    }*/

    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";  // invoke center.toString()
    }

}
