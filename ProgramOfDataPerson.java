package app;

import java.util.Locale;
import java.util.Scanner;

import entities.ListAge;
import entities.NameArray;
import entities.SimplesSum;

public class SumandMean {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        SimplesSum[] vect = new SimplesSum[n];
        ListAge[] list = new ListAge[n];
        NameArray[] array = new NameArray[n];

        for (int i = 0; i < vect.length; i++) {
            int ind = i;
            System.out.println("Dados da pessoa " + (ind + 1));
            inp.nextLine();
            String name = inp.nextLine();
            int years = inp.nextInt();
            double num = inp.nextDouble();
            array[i] = new NameArray(name);
            list[i] = new ListAge(years);
            vect[i] = new SimplesSum(num);
        }

        System.out.println();
        
        double sum = 0;
        for (int j = 0; j < vect.length; j++) {
            sum += vect[j].getNum();
        }

        double mean = sum/n;

        int sumYears = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getYears() < 16) {
                sumYears++;
            }
        }

        double percent = ((double) sumYears / n) * 100;

        System.out.print("Altura media: ");
        System.out.println(mean);
        System.out.print("Porcentagem de idade: ");
        System.out.println(percent);

        for (int i = 0; i < list.length; i++) {
            if (list[i].getYears() < 16) {
                System.out.println(array[i].getName());
            }
        }

        inp.close();
    }
}