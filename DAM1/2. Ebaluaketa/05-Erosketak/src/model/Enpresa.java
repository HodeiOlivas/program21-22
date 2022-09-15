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
public class Enpresa implements Bezeroa {

    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private String[] kontaktoenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] kontaktoenEmailak) {
        this.kodea = kodea;
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.helbidea = helbidea;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

   
    
    

    @Override
    public String getIzena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmaila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getKodea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHelbidea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Enpresa{" + "kodea=" + kodea + ", izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala + ", helbidea=" + helbidea + ", kontaktoenEmailak=" + kontaktoenEmailak + '}';
    }

}