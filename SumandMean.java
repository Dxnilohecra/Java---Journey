package app;

import java.util.Locale;
import java.util.Scanner;

import entities.SimplesSum;

public class SumandMean {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        SimplesSum[] vect = new SimplesSum[n];

        for (int i = 0; i < vect.length; i++) {
            inp.nextLine();
            double num = inp.nextDouble();
            vect[i] = new SimplesSum(num);
        }

        System.out.println();
        
        double sum = 0;
        for (int j = 0; j < vect.length; j++) {
            sum += vect[j].getNum();
        }

        double mean = sum/n;

        System.out.print("Valores: ");
        for (int j = 0; j < vect.length; j++) {
            System.out.print(vect[j].getNum() + " ");
        }

        System.out.println();

        System.out.println("SOMA: " + sum);
        System.out.println("MEDIA: " + mean);

        inp.close();
    }
}