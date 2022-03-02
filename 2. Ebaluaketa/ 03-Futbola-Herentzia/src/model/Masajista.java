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
public class Masajista extends IntegranteSeleccion {

    private String titulacion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        
       this.titulacion = titulacion;
       this.añosExperiencia = añosExperiencia;
    }

    public String getTitulación() {
        return titulacion;
    }

    public void setTitulación(String titulación) {
        this.titulacion = titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void darMaje() {

        System.out.println("Estoy dando un masaje");

    }
    
    @Override
    public String toString() {
        return "Masajista(" + "id= " + super.id + ", Nombre= " + super.nombre + ", Apellidos= " + super.apellidos + ", Edad= " + super.edad + ", titulación= " +titulacion +  ", añosExperiencia= " + añosExperiencia + ')';
    }

}
