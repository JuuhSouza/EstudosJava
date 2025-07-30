import java.util.Scanner;

public class DoisNumerosInteiros {
    public static void main(String[] args) {
        //2 - dois numeros inteiros

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        if(n1 == n2){
            System.out.println("Os numeros digitados são iguais");
        }else {
            System.out.println("Os numeros são diferentes");
        }
        if (n1 > n2){
            System.out.println("O primeiro numero é maior");
        }else{
            System.out.println("O segundo numero é maior");
        }
    }
}
