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
public class Langilea {

    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    //private Zatikia lanaldia = new Zatikia("1/1");

    public Langilea(int id, String izena, String abizena, double soldata) {

        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;

    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {

        return soldata * 12;

    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    public double soldataIgo(int portzentaia) {

        double soldataBerria = getSoldata() * (portzentaia + 100) / 100;
        return soldataBerria;
    }

    @Override
    public String toString() {
        return id + " Langilea = " + izena + " " + abizena + ", soldata = " + soldata;
    }

    public static Langilea[] nireHamarLagunLangile() {
        Langilea[] langile = new Langilea[10];

        langile[0] = new Langilea(2, "Jon", "Alberdi", 100);
        langile[1] = new Langilea(3, "Karmele", "Elorza", 200);
        langile[2] = new Langilea(4, "Markel", "Solaguren", 300);
        langile[3] = new Langilea(5, "Erlantz", "Garate", 500);
        langile[4] = new Langilea(6, "Telmo", "Roldan", 50);
        langile[5] = new Langilea(7, "Markel", "Lomana", 600);
        langile[6] = new Langilea(8, "Joseba", "Arginzoniz", 700);
        langile[7] = new Langilea(9, "Leire", "Renedo", 800);
        langile[8] = new Langilea(10, "Alain", "Basterra", 900);
        langile[9] = new Langilea(11, "Peru", "Aguirrezabala", 400);

        return langile;
    }

    public static Langilea bilatu(Langilea[] langileak, String izena) {

        int i = 0, aurkitua = 0;
        while (i < langileak.length && aurkitua == 0) {
            if (langileak[i].getIzena().equals(izena)) {
                aurkitua = 1;  //break;
            }
            i++;
        }
        if (aurkitua == 1) {
            return langileak[i - 1];
        } else {
            return null;
        }

    }

}
