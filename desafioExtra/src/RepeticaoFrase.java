import java.util.Enumeration;
import java.util.Scanner;

public class RepeticaoFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Digite uma frase : -----");
        String frase = scanner.nextLine();

        System.out.println(" Digite a quantidade de vezes que a frase irá se repetir : ");
        int numeroRepeticao = scanner.nextInt();
        int contador = 0;

        while (contador < numeroRepeticao){
            System.out.println(frase);
            contador++;

        }
    }
}
