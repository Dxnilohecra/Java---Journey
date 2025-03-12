package principal;

import java.util.Locale;
import java.util.Scanner;

import storage.produtos;

public class aula4_poo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter with products data: ");

        produtos data = new produtos();

        System.out.print("Name: ");
        data.name = inp.nextLine();
        System.out.print("Price: ");
        data.price = inp.nextDouble();
        System.out.print("Quantity in Stock: ");
        data.quantity = inp.nextInt();

        System.out.println("Product Data: " + data);

        System.out.println("Enter the numbers of products to be added in stock: ");
        int quantity = inp.nextInt();
        data.addProducts(quantity);

        System.out.println();
        System.out.println("Update Data -> " + data);

        System.out.println("Enter the numbers of products to be remmoved from stock: ");
        quantity = inp.nextInt();
        data.removeProducts(quantity);

        System.out.println();
        System.out.println("Update Data -> " + data);

        inp.close();
    }
}
