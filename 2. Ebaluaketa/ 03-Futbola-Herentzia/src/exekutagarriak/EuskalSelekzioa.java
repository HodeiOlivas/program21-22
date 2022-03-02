/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import model.Masajista;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

/**
 *
 * @author olivas.hodei
 */
public class EuskalSelekzioa {

    public static int azkenId = 1;

    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {
        int posicion = selekzioa.indexOf(selekzioa);
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {

        Futbolista f1 = new Futbolista(azkenId, "Asier", "Villalibre", 23, 11,
                Demarkazioa.DEL);

        System.out.println(f1.toString());

    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko
     * objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {

        Entrenador e1 = new Entrenador(++azkenId, "Javier", "Clemete", 26, "f1");
        Masajista m1 = new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 33, "Fisioterapeuta", 14);
        IntegranteSeleccion i1 = new IntegranteSeleccion(++azkenId, "Ander", "Etxeburu", 20);

        System.out.println(e1.toString());
        System.out.println(m1.toString());
        System.out.println(i1.toString());

    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "Balentziaga", 33, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Illarramendi", 31, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Lago", "Herrerin", 34, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        selekzioa.add(new Entrenador(++azkenId, "Francisco", "Padalino", 46, "f1"));
        selekzioa.add(new Entrenador(++azkenId, "Jose", "Nuñez", 50, "f1"));
        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 56, "f1"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 33, "Fisioterapeuta", 14));

        selekzioa.add(new IntegranteSeleccion(++azkenId + 3, "Ander", "Etxeburu", 20));

        /**
         * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false
         * itzuliko du
         *
         * @param id Ezabatu nahi den partaidearen ida
         * @return
         */
    }

    public static boolean partaideaEzabatu(int id) {

      

        for (int i = 0; i < selekzioa.size(); i++) {

            if (id == selekzioa.get(i).getId()) {

                selekzioa.remove(i);
                return true;
            }

        }

      
        return false;

    }

}
