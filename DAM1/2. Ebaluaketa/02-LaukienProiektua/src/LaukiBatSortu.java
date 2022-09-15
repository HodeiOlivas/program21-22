
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
public class LaukiBatSortu {

    public static void main(String[] args) {

        int width;
        int height;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width os the square: ");
        width = in.nextInt();

        System.out.print("Enter the height of the square: ");
        height = in.nextInt();

         Laukia l1 = new Laukia(width, height);
        
        System.out.println("Lauki " + l1.getMota()+ " sortu duzu: ==> " + l1.toString());

        System.out.println("Hona marrazkia beteta: " );
      
       l1.marraztuBeteta();
       
       
       System.out.println("Hona marrazkia beteta: " );
       
       l1.marraztuHutsik();
    }
    
}
