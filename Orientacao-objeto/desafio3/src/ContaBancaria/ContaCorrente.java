package ContaBancaria;

public class ContaCorrente extends ContaBancaria{
    private double cobrarTarifaMensal;

    public void cobrarTarifa(){
        saldo -= cobrarTarifaMensal;
        System.out.println("Tarifa mensal de : " + cobrarTarifaMensal + " cobrada. Saldo disponivel " + saldo);
    }
}
