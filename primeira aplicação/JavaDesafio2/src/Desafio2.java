public class Desafio2 {
    public static void main(String[] args) {
        //1 - Média
        double n1 = 6;
        double n2 = 8;
        double media = (n1 + n2) / 2;
        System.out.println("Sua média foi de : " + media);

        //2 - double e int
        double nDouble = 9.8;
        int nInteiro = (int) nDouble;
        System.out.println("A troca do double para inteiro é : " + nInteiro);

        //3 - letra e palavra
        char letra = 'J';
        String palavra = "ovem";
        String mensagem = letra + palavra;
        System.out.println(mensagem);

        //4 - Preço produto
        double precoProduto = 659.90;
        int quantidade = 2;
        double precoTotal = precoProduto * quantidade;
        System.out.println("O produto original custa R$" + precoProduto + " e você comprou 2 desses produtos que no total deu : R$" + precoTotal);

        //5 - Conversor dolar
        double valorEmDolares = 10.00;
        double reais = 4.94;
        double conversaoDolar = valorEmDolares * reais;
        System.out.println("A conversão de " + valorEmDolares + "em reais é de :" + conversaoDolar);

        //6 - Preço com desconto
        double precoOriginal = 100.00;
        double desconto = 10;
        double valorDesconto = (desconto / 100.0) * precoOriginal;
        double total = precoOriginal - valorDesconto;
        System.out.println("Desconto de 10% no valor R$100.00 é : " + total);

    }
}
