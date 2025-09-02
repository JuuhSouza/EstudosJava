import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 - Produto
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Caneta", 2.00, 4);
        Produto produto2 = new Produto("Caderno",10.00,3);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Quantidade de produtos da lista " + listaProdutos.size());
        System.out.println("Primeiro Produto " + listaProdutos.get(0).getNome());

        //2 - toString
        System.out.println(listaProdutos.toString());

    }
}