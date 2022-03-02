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
public class Zatikia {

    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia() {

        zenbakitzailea = (int) (Math.random() * 99) + 1;
        izendatzailea = (int) (Math.random() * 99) + 1;

    }

    public Zatikia(int zenbakitzailea, int izendatzailea) {

        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;

    }

    public int getZenbakitzailea() {

        return zenbakitzailea;
    }

    public int getIzendatzailea() {

        return izendatzailea;

    }

    public void setZenbakitzailea(int newZenbakitzailea) {

        zenbakitzailea = newZenbakitzailea;
    }

    public void setIzendatzailea(int newIzendatzailea) {

        izendatzailea = newIzendatzailea;
    }

    @Override
    public String toString() {

        return "Zatikia = " + zenbakitzailea + "/" + izendatzailea;

    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {

        Zatikia erantzuna = new Zatikia();
        erantzuna.zenbakitzailea = zat1.zenbakitzailea * zat2.zenbakitzailea;
        erantzuna.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
        erantzuna.sinplifikatu();
        return erantzuna;
    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia batuketa = new Zatikia();
        batuketa.zenbakitzailea = (zat1.zenbakitzailea * zat2.izendatzailea) + (zat2.zenbakitzailea * zat1.izendatzailea);
        batuketa.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
        batuketa.sinplifikatu();
        return batuketa;
    }

    public void batu(Zatikia besteZatBat) {
        Zatikia zat1 = new Zatikia();

        this.zenbakitzailea = (this.zenbakitzailea * besteZatBat.izendatzailea) + (besteZatBat.zenbakitzailea * this.izendatzailea);
        this.izendatzailea = this.izendatzailea * besteZatBat.izendatzailea;
        this.sinplifikatu();
    }

    public double hamartarBaliokidea() {

        return (double) this.zenbakitzailea / this.izendatzailea;

    }

    public boolean isBiggerThan(Zatikia besteZatBat) {
        boolean handiago = false;

        if (this.hamartarBaliokidea() > besteZatBat.hamartarBaliokidea()) {
            handiago = true;
        }

        return handiago;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.zenbakitzailea;
        hash = 59 * hash + this.izendatzailea;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zatikia other = (Zatikia) obj;
        if (this.zenbakitzailea != other.zenbakitzailea) {
            return false;
        }
        if (this.izendatzailea != other.izendatzailea) {
            return false;
        }
        return true;
    }

    public void sinplifikatu() {

        if (getIzendatzailea() > getZenbakitzailea()) {
            for (int i = getZenbakitzailea(); i > 0; i--) {
                if (getIzendatzailea() % i == 0 && getZenbakitzailea() % i == 0) {
                    setIzendatzailea(getIzendatzailea() / i);
                    setZenbakitzailea(getZenbakitzailea() / i);
                }
            }
        } else {
            for (int i = getIzendatzailea(); i > 0; i--) {
                if (getZenbakitzailea() % i == 0 && getIzendatzailea() % i == 0) {
                    setZenbakitzailea(getZenbakitzailea() / i);
                    setIzendatzailea(getIzendatzailea() / i);
                }
            }

        }
    }
    
    public Zatikia (String ZatIdatzia){
       
        int posBarra =  ZatIdatzia.indexOf('/');
        String Strgoikioa = ZatIdatzia.substring(0, posBarra);
        int zenbakitzailea = Integer.parseInt(Strgoikioa);
        String Strbehekoa = ZatIdatzia.substring(posBarra, ZatIdatzia.length());
        int izendatzailea = Integer.parseInt(Strbehekoa);
       
    }

    public void zatikiaOrdeantu(){
      
    
    
    
    
    }
}
