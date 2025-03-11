//Essa aula não utiliza POO, pois é parte de uma comparação, em que se resolve o msm problema utilizando programação sem POO e a outra com POO:

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas dos lados dos Triangulo x: ");
        xA = inp.nextDouble();
        xB = inp.nextDouble();
        xC = inp.nextDouble();

        System.out.println("Digite as medidas dos lados dos Triangulo y: ");
        yA = inp.nextDouble();
        yB = inp.nextDouble();
        yC = inp.nextDouble();

        inp.close();

        double px = (xA + xB + xC) / 2;
        double py = (yA + yB + yC) / 2;

        double areaX = Math.sqrt(px*(px - xA)*(px - xB)*(px - xC));
        double areaY = Math.sqrt(py*(py - yA)*(py - yB)*(py - yC));

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O área do triangulo X é maior que a do triandulo Y");
        } else {
            System.out.println("O área do triangulo Y é maior que a do triandulo X");
        }

    }
}
