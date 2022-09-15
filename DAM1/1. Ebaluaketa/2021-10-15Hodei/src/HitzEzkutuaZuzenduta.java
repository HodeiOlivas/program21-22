
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
public class HitzEzkutuaZuzenduta {

    public static void main(String[] args) {

        String hitza = "udazkena";

        char hizkia;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu karaktere bat? ");
        hizkia = in.next().charAt(0);
        
        for(int i = 0; i<hitza.length();++i){
        
            if (hizkia == hitza.charAt(i)){
                
                
                System.out.print(hizkia);
            }else{
            
                System.out.print("-");
            
            
            
            }
            
            
            
            
        }
        System.out.println();
    }

}
