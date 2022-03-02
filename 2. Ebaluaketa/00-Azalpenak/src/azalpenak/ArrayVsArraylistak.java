/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azalpenak;

import java.util.ArrayList;

/**
 *
 * @author olivas.hodei
 */
public class ArrayVsArraylistak {

    public static void main(String[] args) {

        // Arraya deklaratu eta sortu
        String[] izenenArraya = new String[3];
        // Arrya betetzeko
        izenenArraya[0] = "Jaimito";
        izenenArraya[1] = "Juanito";
        izenenArraya[2] = "Pepito";

        // Arrayan daukagun balio bat irakurri, adibidez bigarrena:
        System.out.println("Bigarren izena:" + izenenArraya[2]);

        // Arraya nabigatu for  normalerekin
        System.out.println("Izenen zerrenda osoa: ");
        for (int i = 0; i < izenenArraya.length; i++) {

            System.out.println(izenenArraya[i]);

        }

        // Arraya nabigatu for-each sententziarekin
        for (String izena : izenenArraya) {

            System.out.println("Mr. " + izena);

        }

        // Arrayaren lehen elementua hutsitu
        izenenArraya[0] = null;
        
        
        // Array baten datu primitiboak gorde daitezke
        
        int[] zenbakienArraya = new int [4];
        zenbakienArraya[0]= 7;
       zenbakienArraya[1]=4;
       zenbakienArraya[2]=9;
                
                
        

        ///////////////////////////////////////////////////////////////////////////////////////
        //ArrayListak deklaratu eta sortu
        ArrayList <String>ikasleenArrayLista = new ArrayList();

        // ArrayList- a betetzeko
        
        ikasleenArrayLista.add("Jon");
        ikasleenArrayLista.add("Hodei");
        ikasleenArrayLista.add("Karmele");
        ikasleenArrayLista.add("Markel");
        ikasleenArrayLista.add(1, "Joseba");
        //ikasleenArrayLista.add(56,"Alain"); Error

        // Arraylistean daukagu balio bat irakurri, adibidez, bigarrena:
        System.out.println("Bigarren ikaslea: " + ikasleenArrayLista.get(1));

        // ArrayLIsta nabigatu for normalarekin
        System.out.println("Ikasleen zerrenda osoa: ");

        for (int i = 0; i < ikasleenArrayLista.size(); i++) {
            System.out.println(ikasleenArrayLista.get(i));

        }

        // ArrayListen nabigatu for-each arekin (enhanced for-arekin)
        System.out.println("Ikasleen zerrenda osoa adjetiboarekin: ");

        for(String ikaslea : ikasleenArrayLista) {

            System.out.println(ikaslea + " estimatua");

        }
        // ArrayListaren lehen elementua hutsitu
        
       ikasleenArrayLista.remove(0);
      
       int markelenPosizioa = ikasleenArrayLista.indexOf("Markel");// Parametro bezala objetu bat eskatzen du. equals metdoarekin konparatuko ditu parametro hori array lista objetuarekin
        
        // Array lista baten datu primitiboak gorde daitezke
        
        
        ArrayList <Integer> zenbakienArrayLista = new ArrayList();
        
        
    }

}
