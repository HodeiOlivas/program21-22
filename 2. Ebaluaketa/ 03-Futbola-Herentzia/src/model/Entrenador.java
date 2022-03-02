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
public class Entrenador extends IntegranteSeleccion {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederación() {
        return idFederacion;
    }

    public void setIdFederación(String idFederación) {
        this.idFederacion = idFederación;
    }

    public void dirigirEntrenamineto() {

        System.out.println("Estoy dirigiendo el entrenamiento");

    }

    public void dirigirPartido() {

        System.out.println("Estoy dirigiendo el partido");

    }

    @Override
    public String toString() {
        return "Entrenador(" + "id= " + super.id + ", Nombre= " + super.nombre + ", Apellidos= " + super.apellidos + ", Edad= " + super.edad +  ", idFederación= " + idFederacion + ')';
    }
    
    

}
