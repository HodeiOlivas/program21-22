

import java.util.Scanner;


public class Ultimodigitodelfactorial {

    public static Scanner in;
    private static Object java;

    public static int faktoriala(int number) {

        Scanner on = new Scanner(System.in);
        number = on.nextInt();

        int faktoriala = 1;
        for (int i = 1; i <= number; ++i) {
            faktoriala = faktoriala * i;

        }
        return faktoriala;

    }

    public static void casoDePrueba() {
        int n;
        n = in.nextInt();
        if (n >= 5) {
            System.out.println(0);
        } else {
            System.out.println(faktoriala(n) % 10);
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos;
        numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            

        }

    }
}
