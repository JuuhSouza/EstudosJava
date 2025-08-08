package ContaBancaria;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositarSaldo(1100);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositarSaldo(100);
        contaCorrente.cobrarTarifa();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(200);
        contaCorrente.consultarSaldo();

    }
}
