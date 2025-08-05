public class ContaBancaria {
    private int numeroConta;
    private int saldo;
    public String titular;

    //Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
}
