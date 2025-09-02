public class ProdutoPerecivel extends Produto{

    int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Pão",5.00,1, 5/9/2025);
        System.out.println(produtoPerecivel);
    }
}
