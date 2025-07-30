import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner numeroUsuario = new Scanner (System.in);
        System.out.println("Digite um número");
        int numero = numeroUsuario.nextInt();

        if (numero > 0){
            System.out.println("Seu numero é positivo");
        }else{
            System.out.println("Este numero é negativo");
        }
    }
}
