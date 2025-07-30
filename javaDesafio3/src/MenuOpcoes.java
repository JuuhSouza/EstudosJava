import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        //3 - menu de opções - feito com ajuda das anotações do professor
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("------Menu------");
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do círculo");
            System.out.println("3 - sair");
            System.out.println("Selecione uma da opções acima : ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado");
                double lado = scanner.nextInt();
                double areaQadrado = lado * lado;
                System.out.println("Àrea do quadrado:" + areaQadrado);
            } else if(escolha == 2){
                System.out.println("Digite o raio do circulo");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Àrea do circulo " + areaCirculo);
            }
            if(escolha == 3){
                System.out.println("Saindo do programa");
            }
        }
    }
}
