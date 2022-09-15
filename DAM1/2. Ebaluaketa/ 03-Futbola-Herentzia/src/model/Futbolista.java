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
public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private Demarkazioa demarcación;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, Demarkazioa demarcación) {
        super(id, nombre, apellidos, edad);
        
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(Demarkazioa demarcación) {
        this.demarcación = demarcación;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void entrenar() {

        System.out.println("Estoy entrenando");
    }

    public void jugarPartido() {

        System.out.println("Estoy jugando un partido");

    }

    @Override
    public String toString() {
        return "Futbolista( id= " + super.id + ", Nombre= " + super.nombre + ", Apellidos= " + super.apellidos + ", Edad= " + super.edad + ", Dorsal= " + this.dorsal + ", Demarcación= " + this.demarcación + ')';
    }

}
