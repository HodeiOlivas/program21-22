/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olivas.hodei
 */
public class CylinderComputation {

    public static void main(String[] args) {
        double erradioa, altuera, oinarriarenazalera, albokoazalera, azaleraosoa, bolumen;
        final double PI = 3.14;
        erradioa = 1;
        altuera = 2;
        oinarriarenazalera = erradioa * erradioa * PI;
        albokoazalera = 2 * erradioa * PI * altuera;
        azaleraosoa = 2 * oinarriarenazalera + albokoazalera;
        bolumen = oinarriarenazalera * altuera;
        System.out.print("oinarriarenazalera ");
        System.out.println(oinarriarenazalera);
        System.out.print(" albokoazalera ");
        System.out.println(albokoazalera);
        System.out.print("azaleraosoa ");
        System.out.println(azaleraosoa);
        System.out.print(" bolumen ");
        System.out.println(bolumen);

    }
}
