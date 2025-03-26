package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Negatives;

public class BuscaN {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        Negatives[] vect = new Negatives[n];

        for (int i = 0; i < vect.length; i++) {
            inp.nextLine();
            double num = inp.nextDouble();
            vect[i] = new Negatives(num);
        }

        System.out.println();

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNum() < 0) {
                System.out.println("Seus numeros negativos: ");
                System.out.print(vect[i].getNum() + " ");
            }
        }

        inp.close();
    }
}