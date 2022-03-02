
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author olivas.hodei
 */
public class GurutzeaZuzenduta {

    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Zein neurritsko gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)? ");
        size = in.nextInt();
        in.close();

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {

                if (size / 2 + 1 == row || size / 2 + 1 == col) {

                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
