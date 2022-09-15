
import java.util.Scanner;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author olivas.hodei
 */
public class GradesStatistics {

    public static void main(String[] args) {

        int ikaszenb;
        int[] notak;
         int[] bins = new int[10];

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu ikaslearen zenbakia: ");
        ikaszenb = in.nextInt();

        notak = new int[ikaszenb];

        for (int i = 0; i < notak.length; ++i) {

            System.out.println("Sartu ikaslearen nota" + (i + 1));
            System.out.println(": ");
            notak[i] = in.nextInt();
        }
        in.close();
        
        
        System.out.println(Arrays.toString(notak));
        
        for (int notak : notak){
            if(grade == 100){
                ++bins[9];
            }else {
                ++bins[notak/10];
                
                
            }
        }

        System.out.print(Arrays.toString(bins));
        
        for (int binIdx = 0; binIdx < bins.length;++binIdx){
            
        }

    }
}
