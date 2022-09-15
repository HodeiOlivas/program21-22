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
public class Kutxa extends Laukizuzena {

    private int altuera;

    public Kutxa(Puntua erpinBat, Puntua kontrakoErpina, int altuera) {
        super(erpinBat, kontrakoErpina);
        this.altuera = altuera;

    }

    public int getAltuera() {
        return altuera;
    }

    public boolean isHandiagoa(Kutxa besteKutxaBat) {

        double bolumena1, bolumena2;

        bolumena1 = this.getBolumena();
        bolumena2 = besteKutxaBat.getBolumena();

        if (bolumena1 > bolumena2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Kutxa{" + "altuera=" + altuera + '}';
    }

    @Override
    public void marraztu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getBolumena() {
        double bolumena, a, b;
        a = Math.abs(this.getKontrakoErpina().getY() - this.getErpinBat().getY());
        b = Math.abs(this.getKontrakoErpina().getX() - this.getErpinBat().getX());
        bolumena = a * b * this.getAltuera();
        return bolumena;

    }

    public int getErtzenLuzera() {
        int x, y;
        x = this.getErpinBat().getX() - this.getKontrakoErpina().getX();
        y = this.getErpinBat().getY() - this.getKontrakoErpina().getY();
        
        return x*4+y*4+altuera*4;

        
    }

    
   public double handina(){
   
   
   
   
   }
}



