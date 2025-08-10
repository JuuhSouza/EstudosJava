package Vendavel;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHoras;


    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHoras * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        precoHoras -= precoHoras * (desconto / 75.5);
    }
}
