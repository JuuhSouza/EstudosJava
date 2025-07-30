import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //4 - Tabuada

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite um numero para começar a tabuada");
        int tabuada = scanner2.nextInt();

        System.out.println("Tabuado do " + tabuada + ":");
        for (int i = 1; i < 10 ; i++) {
            System.out.println(tabuada +" x " + i + " = 2" + (tabuada * i));
        }
    }
}
