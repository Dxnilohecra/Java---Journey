package retangulo;

import java.util.Scanner;

import area.calculus;

public class poligono {
    public static void main(String[] args) {

        calculus x;
        x = new calculus();

        Scanner inp = new Scanner(System.in);

        System.out.println("Digite a altura e a largura do retangulo: ");
        x.width= inp.nextDouble();
        x.height = inp.nextDouble();

        inp.close();
        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("Sua area: %,2f%n", area);
        System.out.printf("Seu perimetro: %,2f%n", perimeter);
        System.out.printf("Sua diagonal: %,2f%n", diagonal);

    }
}
