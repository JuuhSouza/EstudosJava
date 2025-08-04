import java.util.Scanner;

public class SomaLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (soma <= 100){
            System.out.println("Digite um numero para começar a contagem");
            int usuarioNumero = scanner.nextInt();
            soma = soma + usuarioNumero;
        }
        System.out.println("Sua soma chegou á : " + soma);
    }
}
