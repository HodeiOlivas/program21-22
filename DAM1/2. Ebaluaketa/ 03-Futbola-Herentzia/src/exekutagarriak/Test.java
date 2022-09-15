/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Masajista;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;

/**
 *
 * @author olivas.hodei
 */
public class Test {

    public static void main(String[] args) {

        Futbolista f1 = new Futbolista(835, "Mikel", "Wlliams", 18, 1,
                Demarkazioa.MED);
        Entrenador e1 = new Entrenador(235, "Eduardi", "Garcia", 67, "ert5");
        Masajista m1 = new Masajista(935, "Jose", "Luis", 28, "Masajista", 7);
    }

}
