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
public class Komikia extends Book {

    private boolean kolorea;

    public Komikia() {
    }

    public Komikia(boolean kolorea, String name, Author author, double price, int pages) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }

    public boolean isKolorea() {
        return kolorea;
    }

    @Override
    public String getNolakoa() {
        String nolakoa;
        if (kolorea) { //true
            nolakoa = "koloretakoa";
        } else {       //false
            nolakoa = "zuribeltza";
        }
        return nolakoa;

    }

    @Override
    public String toString() {
        return "[Komikia] " + super.toString();
    }

}
