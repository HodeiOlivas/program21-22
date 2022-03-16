/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import model.Kutxa;
import model.Puntua;


public class Test4 {
      public static void main(String[] args) {
        
        Kutxa k1 = new Kutxa(new Puntua(20,20),new Puntua(26,24),5);
        Kutxa k2 = new Kutxa(new Puntua(20,20),new Puntua(26,24),6);
        
        System.out.println("1. Kutxaren bolumena: " + k1.getBolumena());
        System.out.println("2. Kutxaren bolumena: " + k2.getBolumena());
        
    }
}
