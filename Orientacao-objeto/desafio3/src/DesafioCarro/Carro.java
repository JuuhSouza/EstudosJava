package DesafioCarro;

public class Carro{
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void exibirFichaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano 1: " + preco1);
        System.out.println("Preço ano 2: " + preco2);
        System.out.println("Preço ano 3: " + preco3);
        System.out.println("Menor preço: " + menorPreco());
        System.out.println("Maior preço: " + maiorPreco());
    }

    private double menorPreco(){
        double menorPreco = preco1;

        if (preco2 < menorPreco){
            menorPreco = preco2;
        }
        if (preco3 < menorPreco){
            menorPreco = preco3;
        }

        return menorPreco;
    }

    private double maiorPreco(){
        double maiorPreco = preco1;

        if (preco2 > maiorPreco){
            maiorPreco = preco2;
        }
        if (preco3 > maiorPreco){
            maiorPreco = preco3;
        }

        return maiorPreco;
    }

}
