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
    
    public Kutxa(Puntua erpinBat, Puntua kontrakoErpina,int altuera) {
        super(erpinBat, kontrakoErpina);
        this.altuera = altuera;
        
    }

    public int getAltuera() {
        return altuera;
    }
    public boolean isHandiagoa(Kutxa besteKutxaBat){
        
        
      // int nireBolumena =( erpinBat.getX() - kontrakoErpina.getX()) * (erpinBat.getX() - kontrakoErpina.getY()) * ( erpinBat.getY() - kontrakoErpina.getX());
        return false;
    
    
    }

    @Override
    public String toString() {
        return "Kutxa{" + "altuera=" + altuera + '}';
    }
    
    
      @Override
    public void marraztu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
