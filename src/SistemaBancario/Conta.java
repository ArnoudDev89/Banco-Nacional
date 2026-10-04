package SistemaBancario;

public class Conta {

    Cliente Titular;
    int  numero;
    double saldo;

    void imprimirSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
}
