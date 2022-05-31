/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author olivas.hodei
 */
public class TestArrayListera {
    
    
      public static void main(String[] args) {
        Model model = new Model();
        
        for(Terminoa t: model.terminoakArrayListera()){
            System.out.println(t);
        }
    }
}

