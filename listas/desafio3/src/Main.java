import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 - lista
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Caneta");
        lista.add("Lápis");
        lista.add("Borraca");

        for (String algo: lista){
            System.out.println(algo);
        }

        //2 - animal
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        //3 -modificando 2
        Animal animal1 = new Cachorro();

        if (animal1 instanceof Cachorro){
            Cachorro cachorro1 = (Cachorro) animal1;
        }else {
            System.out.println("Isso não pe um cachorro");
        }

        //4 -produtos
        Produto produto1 = new Produto("Caderno", 10.00);
        Produto produto2 = new Produto("Borracha", 2.00);
        Produto produto3 = new Produto("Estojo", 8.00);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double totalPecos = 0;

        for (Produto produto : listaProdutos){
            totalPecos += produto.preco;
        }

        double mediaPrecos = totalPecos / listaProdutos.size();
        System.out.println("O preço nédio dos produtos escolhidos foi: " + mediaPrecos);

        //5 - Circulo e quadrado, n compreendi direito

        Circulo circulo = new Circulo();
        circulo.raio = 9;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;

        ArrayList<Forma> listaArea = new ArrayList<>();
        listaArea.add(circulo);
        listaArea.add(quadrado);

        for (Forma forma : listaArea){
            System.out.println("A área é " + forma.calcularArea());
        }

        //6 - conta bancaria, n funcionou
        ContaBancaria contaBancaria = new ContaBancaria(12345,23.000);
        ContaBancaria contaBancaria2 = new ContaBancaria(6789,1.00);

        ArrayList<ContaBancaria> infoConta = new ArrayList<>();
        infoConta.add(contaBancaria);
        infoConta.add(contaBancaria2);

        ContaBancaria contaMiorSaldo = infoConta.get(0);

        for ( ContaBancaria conta : infoConta){
            if (conta.saldo > contaMiorSaldo.saldo){
                contaMiorSaldo = conta;
            }
        }

        System.out.println("A conta com maior saldo - Número " + contaMiorSaldo.numeroConta + " Com o saldo de " + contaMiorSaldo.saldo);
    }
}