package entities;

import java.util.Scanner;

import aplication.Allproducts;


public class Especificproducts extends Allproducts {
    private String category;
    private double ph;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Allproducts x = new Allproducts();
        System.out.println("Digite 1 para saber os dados acerca o produto: ");
        int num = inp.nextInt();
        if (num == 1) {
            System.out.println("Os dados do produto -> " + x);
        }
    }
}
