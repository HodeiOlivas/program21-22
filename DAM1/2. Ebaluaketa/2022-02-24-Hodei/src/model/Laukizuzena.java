/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author olivas.hodei
 */
public class Laukizuzena extends Puntua implements Marrazgarria {

    private Puntua erpinBat;
    private Puntua kontrakoErpina;

    public Laukizuzena(Puntua erpinBat, Puntua kontrakoErpina) {
        this.erpinBat = erpinBat;
        this.kontrakoErpina = kontrakoErpina;
    }

    public Laukizuzena(int x1, int y1, int x2, int y2) {
        this.erpinBat = new Puntua(x1, y1);
        this.kontrakoErpina = new Puntua(x2, y2);
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }

    public Puntua[] getLauErpinenArraya() {
        Puntua[] erpinak = new Puntua[4];
        erpinak[0] = erpinBat;
        erpinak[1] = new Puntua(kontrakoErpina.getX(), erpinBat.getY());
        erpinak[2] = kontrakoErpina;
        erpinak[3] = new Puntua(erpinBat.getX(), kontrakoErpina.getY());
        return erpinak;

    }
public ArrayList<Puntua> getLauErpinenArrayLista() {
            ArrayList arraya = new ArrayList<Puntua>();
            
            arraya.add(this.getErpinBat());
            arraya.add(new Puntua(this.getKontrakoErpina().getX(),this.getErpinBat().getY()));
            arraya.add(this.getKontrakoErpina());
            arraya.add(new Puntua(this.getErpinBat().getX(), this.getKontrakoErpina().getY()));
            
            return arraya;
}
  
    @Override
    public String toString() {
        return Arrays.toString(getLauErpinenArraya());
    }

    @Override
    public void marraztu() {

    }

    public boolean isInside(Puntua puntuBat) {
        
        boolean barruan = false;
        
        if((puntuBat.getX()>= erpinBat.getX() && puntuBat.getX()<= kontrakoErpina.getX())&&(puntuBat.getY()>= erpinBat.getY() && puntuBat.getY()<= kontrakoErpina.getY()) ){
        
        barruan = true;
        }
        
        
        
        
        
        return false;
        

    }

}
