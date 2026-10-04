package SistemaBancario;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "João";
        cliente.cpf = "01234567890";

        Conta contaCliente = new Conta();
        contaCliente.titular = cliente;
        contaCliente.numero = 1000;
        contaCliente.saldo = 50;

        Banco sistemaBancario = new Banco();

        contaCliente.imprimirSaldo();

        System.out.println("depositando 100 reais! ");
        sistemaBancario.depositar(contaCliente, 100d);

        System.out.println("Saldo depois do deposito: ");
        contaCliente.imprimirSaldo();

        System.out.println("sacando o valor de 30,00 reais");
        sistemaBancario.sacar(contaCliente, 30d);

        contaCliente.imprimirSaldo();

        System.out.println("sacando o valor de 200,00 reais");
        sistemaBancario.sacar(contaCliente, 200d);

        contaCliente.imprimirSaldo();

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        cliente2.cpf = "98765432100";

        Conta contaCliente2 = new Conta();
        contaCliente2.titular = cliente2;
        contaCliente2.numero = 2000;
        contaCliente2.saldo = 0;

        System.out.println("Transferindo 120 reais para o cliente 2:");
        sistemaBancario.transferir(contaCliente, contaCliente2, 120d);

        contaCliente2.imprimirSaldo();
        contaCliente.imprimirSaldo();

        //estudar git.
    }
}