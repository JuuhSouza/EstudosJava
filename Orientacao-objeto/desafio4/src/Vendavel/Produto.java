package Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        precoUnitario -= precoUnitario * (desconto / 100);
    }
}
