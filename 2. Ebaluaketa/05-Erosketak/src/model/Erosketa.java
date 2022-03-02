/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author olivas.hodei
 */
public class Erosketa {

    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;

    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {

        this.kodea = kodea.toCharArray();
        this.data = LocalDate.of(Integer.parseInt(data.substring(0,4)), Integer.parseInt(data.substring(5, 7 )), Integer.parseInt(data.substring(8, 10)));
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    
    
    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + getKodeaStr() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }

    public boolean guztiraEgiaztatu() {
        int zenbatekoa = 0;
        for (int i = 0; i < produktuak.size(); i++) {
            zenbatekoa += produktuak.get(i).getPrezioa() * unitateak.get(i);
        }

        if (zenbatekoa == guztira) {
            return true;
        } else {
            return false;
        }
    }

    public String toStringLuzea() {
        return "EROSKETA \n" 
                + "\n Kodea: " + getKodeaStr() 
                + "\n Data: " + data 
                + "\n Bezeroa: " + bezeroa.getKodea() 
                + "\n Izena: " + bezeroa.getIzena() 
                + "\n Helbidea: " + bezeroa.getHelbidea() 
                + "\n Emaila: " + bezeroa.getEmaila() ;

    }

    public char[] getKodea() {
        return kodea;
    }

    public String getKodeaStr() {
        return String.valueOf(kodea);
    }

    
       public static double guztiraKalkulatu(ArrayList<Produktua> erositakoProduktuak, ArrayList<Integer> erositakoUnitateak) {
        double erosketaGuztira = 0;
        for (int i = 0; i < erositakoProduktuak.size(); i++) {
            erosketaGuztira = erositakoProduktuak.get(i).getPrezioa() * erositakoUnitateak.get(i);
        }
        return erosketaGuztira;
    }

   
    
  

    public double getGuztira() {
        return guztira;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public LocalDate getData() {
        return data;
    }

}

