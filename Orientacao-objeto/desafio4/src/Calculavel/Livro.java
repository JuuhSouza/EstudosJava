package Calculavel;

public class Livro  implements Calculavel{
    private String autor;
    private double preco;

    public double calcularPRecoFinal(){
        return preco * 0.9;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }
}
