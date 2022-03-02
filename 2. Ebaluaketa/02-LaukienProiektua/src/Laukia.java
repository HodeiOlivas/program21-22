/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class Laukia {

    private int width;
    private int height;

    public Laukia() {

        width = 5;
        height = 5;
    }

    public Laukia(int zab, int alt) {

        width = zab;
        height = alt;

    }

    public int getWidth() {

        return width;

    }

    public int getHeight() {

        return height;

    }

    public int getArea() {

        return width * height;

    }

    public int getPerimeter() {

        return width + height + width + height;
    }

    public void setWidth(int newWidth) {

        this.width = newWidth;
    }

    public void setHeight(int newHeight) {

        this.height = newHeight;

    }
@Override
    public String toString() {

        return "Laukia [" + width + "x" + height + "]";
    }

    public String getMota() {

        if (width > height) {
            return "Horizontala";
        }
        if (width < height) {

            return "Bertikala";
        }

        if (width == height) {

            return "Karratua";
        }
        return "=>";
    }

    public void marraztuBeteta() {

        for (int row = 1; row <= width; row++) {

            for (int col = 1; col <= height; col++) {

          System.out.print("* ");        }  System.out.println();

        }
    }
    public void marraztuHutsik(){
    
    for (int row = 1; row <= width; row++) {

            for (int col = 1; col <= height; col++) {

                if (width / width == row || height/height  == col ) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    
    }
    public boolean isBiggerThan(){
    
    
    }
    public Laukia getTheBiggest(){
    
    
    }
}
