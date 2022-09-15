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


public class NiLangile {
    public static void main(String[] args) {
        
        
    Langilea ni = new Langilea ( 1, "Hodei", "Olivas", 600);
            
        System.out.println(ni);
        
       int portzentaia= 50; 
       
       
        Langilea niberria = new Langilea ( 1, "Hodei", "Olivas",ni.soldataIgo(portzentaia) );
            
       ni.soldataIgo(portzentaia);
      
        System.out.println(niberria);
        
        
        
        
        
         Langilea langileBat = Langilea.bilatu(langileGuztiak, "Karmele");
        System.out.println(langileBat);
        langileBat = Langilea.bilatu(langileGuztiak, "Alain");
        System.out.println(langileBat);
        


  Langilea[] langileGuztiak;

}
    
    
    
}
