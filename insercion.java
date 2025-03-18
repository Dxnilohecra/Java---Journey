package user;
import java.util.Scanner;

import aplication.Allproducts;

public class insercion extends Allproducts {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Allproducts x = new Allproducts();

        System.out.println("Digite seus dados para cadastro ?");
        x.numConta = inp.nextLine();
        x.nomeTitular = inp.nextLine();

        System.out.println("Você tem deposito inicial ? y para sim e n para não.");
        String n = inp.nextLine();

        if (n.equals("y")) {
            System.out.println("Insira o valor inicial de deposito: ");
            x.saldoConta = inp.nextDouble();
        } else if (n.equals("n")) {
            System.out.println("OK");
        }

        System.out.println("Seus dados: " + x);
        System.out.println();
        System.out.println("CADASTRO FEITO!!!");
        System.out.println();

        System.out.println("Se deseja fazer um deposito digite 1 se deseja fazer um saque digite 2");
        int anwser = inp.nextInt();

        if (anwser == 1) {
            System.out.println("Digite o valor a ser depositado na sua conta");
            double valor = inp.nextDouble();
            x.deposito(valor);

            System.out.println("Seus dados Atualizados: " + x);
        } else if (anwser == 2) {
            System.out.println("Digite o valor a ser sacado na sua conta");
            double valor = inp.nextDouble();
            x.saque(valor);

            System.out.println("Seus dados Atualizados: " + x);
        }
        inp.close();
    }
}
