public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaCarro(){
        System.out.println("Seu modelo de carro é " + modelo);
        System.out.println("O ano dele é " + ano);
        System.out.println("A cor é " + cor);
    }

    int calculaIdadeCarro(){
        return 2025 - ano;
    }
}
