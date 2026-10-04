package SistemaBancario;

public class Banco {

    void depositar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual + valor;
        conta.saldo = novoSaldo;
    }

    void sacar(Conta conta, double valor){
        double saldoAtual = conta.saldo;
        double novoSaldo = saldoAtual - valor;

        if (novoSaldo <0){
            System.out.println("Não foi possivel sacar! Saldo insuficiente!");
        } else {
            conta.saldo = novoSaldo;
        }
    }

    void transferir(Conta origem, Conta destino, double valor){
        double saldoAtualOrigem = origem.saldo;
        double NovosaldoOrigem = saldoAtualOrigem - valor;

        if (NovosaldoOrigem > 0){
            System.out.println("Transferencia não realizada! Saldo insuficiente!");
        } else {
            origem.saldo = NovosaldoOrigem;
            double novoSaldoDestino = destino.saldo + valor;
            destino.saldo = novoSaldoDestino;
        }
    }
}
