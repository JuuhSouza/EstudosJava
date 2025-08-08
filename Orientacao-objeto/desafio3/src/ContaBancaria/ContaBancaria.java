package ContaBancaria;

public class ContaBancaria {
    public double saldo;

    public void depositarSaldo(double valor){
        saldo += valor;
        System.out.println("Depósito de " + valor + " saldo total : " + saldo);
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo disponível: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo disponivel " + saldo);
    }
}
