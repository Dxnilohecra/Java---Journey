package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class aula2_poo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas dos lados dos Triangulo x: ");
        x.a = inp.nextDouble();
        x.b = inp.nextDouble();
        x.c = inp.nextDouble();

        System.out.println("Digite as medidas dos lados dos Triangulo y: ");
        y.a = inp.nextDouble();
        y.b = inp.nextDouble();
        y.c = inp.nextDouble();

        inp.close();

        double px = (x.a + x.b + x.c) / 2;
        double py = (y.a + y.b + y.c) / 2;

        double areaX = Math.sqrt(px*(px - x.a)*(px - x.b)*(px - x.c));
        double areaY = Math.sqrt(py*(py - y.a)*(py - y.b)*(py - y.c));

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O área do triangulo X é maior que a do triandulo Y");
        } else {
            System.out.println("O área do triangulo Y é maior que a do triandulo X");
        }
    }
}

