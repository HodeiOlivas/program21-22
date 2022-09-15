/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author olivas.hodei
 */
public class Seigarrena {

    public static void main(String[] args) {

        Langilea[] langileak;
        double soldataBerria;

        langileak = Langilea.nireHamarLagunLangile();

        System.out.printf("%-8s %15s %15s %15s  \n", "Id", "Izena", "Abizena", "Soldata");
        System.out.println("=========================================================================================================");

        for (int i = 0; i < langileak.length; ++i) {

            System.out.printf("%-8s %15s %15s %15s  \n", langileak[i].getId(), langileak[i].getIzena(), langileak[i].getAbizena(), langileak[i].getSoldata());

        }

        String izena;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.print("Sartu bilatu nahi duzun langilearen izena: ");
        izena = in.next();

        Langilea langileak_1;

        langileak_1 = Langilea.bilatu(langileak, izena);
        System.out.println(langileak_1);

        System.out.print("Sartu soldatari igon nahi diozun portzentaia: ");
        int portzentaia = in.nextInt();

        soldataBerria = langileak_1.soldataIgo(portzentaia);
        langileak_1.setSoldata(soldataBerria);

        System.out.println(soldataBerria);
        
        for (int i = 0; i < langileak.length; i++) {
            System.out.println(langileak[i]);
        }
        int urtekoSoldataGuztiak = 0;

        for (int i = 0; i < langileak.length; i++) {

            urtekoSoldataGuztiak += langileak[i].getUrtekoSoldata();

        }

        System.out.println("Hau gaztatuko du empresak urtean soldatetan: " + urtekoSoldataGuztiak);

        
        
        
       Langilea soldataHaundiena = langileak[0];//Momenturarte soldata handiena duen langilea
       
        for (int i = 1; i < langileak.length; i++){
           
            if(soldataHaundiena.getSoldata() < langileak[i].getSoldata()){
                soldataHaundiena = langileak[i];
            }
           
        }
       
        System.out.println("Soldata handiena: "+soldataHaundiena);

            
            
           

        }

    }


