/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static exekutagarriak.EuskalSelekzioa.azkenId;
import static exekutagarriak.EuskalSelekzioa.selekzioa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import model.Masajista;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

/**
 *
 * @author olivas.hodei
 */
public class EuskalSelekzioaMenua {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        selekzioOsoaSortu();
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("EUSKAL SELEKZIOA");
            System.out.println("====================================");
            System.out.println("1.- Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) ");
            System.out.println("2.- Partaideen datuak ikusi taldekatuta");
            System.out.println("3.- Futbolariak alfabetikoki inprimatu");
            System.out.println("4.- Aldaketa  ");
            System.out.println("5.- Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)");
            System.out.println("6.- Partaideak alfabetikoki inprimatu ");
            System.out.println("7.- Irten ");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    System.out.println("Lehen aukera aukeratu duzu.");
                    partaideakIkusi();
                    break;
                case 2:
                    System.out.println("Bigarren aukera aukeratu duzu.");
                    partaideakIkusiTaldekatuta();
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    futbolariakAlfabetikokiIkusi();
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    aldaketa();
                    break;
                case 5:
                    System.out.println("Bostgarren aukera aukeratu duzu.");
                    bilatu();
                    break;
                case 6:
                    System.out.println("Seigarren aukera aukeratu duzu.");
                    partaideakAlfabetikokiIkusi();
                    break;
                case 7:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 7);
    }

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
    }

    public static void partaideakIkusi() {

        int futbolariak = 0;
        int entrenatzaileak = 0;
        int masajistak = 0;
        int besteak = 0;

        for (int i = 0; i < selekzioa.size(); i++) {

            System.out.println(selekzioa.get(i).toString());

            Object partaidea = selekzioa.get(i);

            if (partaidea instanceof Futbolista) {
                ++futbolariak;

            } else if (partaidea instanceof Entrenador) {
                ++entrenatzaileak;
            } else if (partaidea instanceof Masajista) {
                ++masajistak;

            } else {
                ++besteak;
            }

        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("Futbolistak: %d, Entrenatzaileak: %d, Masajistak: %d, Beste partaideak: %d\n", futbolariak, entrenatzaileak, masajistak, besteak);
    }

    public static void partaideakIkusiTaldekatuta() {
        System.out.printf("%15s %15s %15s %15s\n", "ID", "IZENA", "ABIZENA", "URTEAK");
        System.out.printf("---------------------------------------------------------------------------\n");

        System.out.printf("FUTBOLARIAK: \n");

        for (int i = 0; i < selekzioa.size(); i++) {

            Object futbolistak = selekzioa.get(i);

            if (futbolistak instanceof Futbolista) {

                System.out.println(futbolistak.toString());
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("ENTRENATZAILEAK: \n");

        for (int i = 0; i < selekzioa.size(); i++) {

            Object entrenatzaileak = selekzioa.get(i);

            if (entrenatzaileak instanceof Entrenador) {

                System.out.println(entrenatzaileak.toString());
            }

        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("MASAJISTAK: \n");
        for (int i = 0; i < selekzioa.size(); i++) {

            Object masajistak = selekzioa.get(i);

            if (masajistak instanceof Masajista) {

                System.out.println(masajistak.toString());

            }

        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("BESTE PARTAIDEAK: \n");
        for (int i = 0; i < selekzioa.size(); i++) {

            Object besteak = selekzioa.get(i);

            if (besteak instanceof IntegranteSeleccion && !(besteak instanceof Futbolista) && !(besteak instanceof Entrenador) && !(besteak instanceof Masajista)) {

                System.out.println(besteak.toString());

            }
        }
    }

    public static void partaideakAlfabetikokiIkusi() {

        Collections.sort(selekzioa, new Comparator<IntegranteSeleccion>() {  // Ya que el selekzioa tiene diferentes clases(Futbolista, entrenador, masajista...) Con el comparator podemos traformar tdos esas clases en integrantes selección, y asi si que se pueden comparar sus apellidos entre ellos.

            @Override
            public int compare(IntegranteSeleccion o1, IntegranteSeleccion o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });

        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i));
        }

    }

    public static void futbolariakAlfabetikokiIkusi() {
        ArrayList<IntegranteSeleccion> futbolistak = new ArrayList<>();
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getClass() == Futbolista.class) {
                futbolistak.add(selekzioa.get(i));
            }
        }

        Collections.sort(futbolistak, new Comparator<IntegranteSeleccion>() {
            @Override
            public int compare(IntegranteSeleccion o1, IntegranteSeleccion o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });

        for (int i = 0; i < futbolistak.size(); i++) {
            System.out.println(futbolistak.get(i));
        }
    }

    public static void bilatu() {

        Scanner in = new Scanner(System.in);
        System.out.println("Zein abizen bilatu nahi duzu?");
        String abizena = in.next();

        for (int i = 0; i < selekzioa.size(); i++) {

            if (selekzioa.get(i).getApellidos().startsWith(abizena)) {

                System.out.println("Partaidearen datuak: " + selekzioa.get(i));

            }

        }

    }

    public static void aldaketa() {

        Scanner in = new Scanner(System.in);
        System.out.println("Nor aldatu nahi duzu postuz? (idatzi id-a)");
        String id = in.next();
        int idea = Integer.parseInt(id);

        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getId() == idea) {
                System.out.println("Aukeratutako "+ idea +" duena hau da: " + selekzioa.get(i)); // Ez dut bukatu
               

            }
        }
    }
}
