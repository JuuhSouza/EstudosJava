public class Produto {
    String nome;
    double preco;
    int quantidade;

    public String toString(){
        return "Resumo do produto " + this.getNome();
    }

    public static void main(String[] args) {
        //3 - nov produto
        Produto novoProduto = new Produto("Lápis",2.00,5);
        System.out.println("Novo produto adicionado " + novoProduto);
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
