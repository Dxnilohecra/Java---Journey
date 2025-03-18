package aplication;

public class Allproducts {
    public String nomeTitular;
    public String numConta; 
    public double saldoConta = 0;

    public String toString() {
        return "Insira seu nome: " +
        nomeTitular + ", " + numConta + ", " +
        saldoConta;
    }

    public double deposito(double valor) {
        return saldoConta += valor - 5;
    }

    public double saque(double valor) {
        saldoConta -= valor;
        return saldoConta -= 5;
    }
}
