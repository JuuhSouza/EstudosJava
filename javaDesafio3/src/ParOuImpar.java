import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int nInteiro = scanner.nextInt();

        if(nInteiro % 2 == 0 ){
            System.out.println("Este numero é par");
        }else {
            System.out.println("Este numero é impar");
        }
    }
}
