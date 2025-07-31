import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        String senha = "java";
        Scanner scanner = new Scanner(System.in);
        String tentativa = "";

        while(!tentativa.equals(senha) ){
            System.out.println("----- Digite sua senha ----- ");
            String digiteSenha = scanner.nextLine();

            if (senha.equals(digiteSenha)){
                System.out.println(" *** senha correta ***");
            }else {
                System.out.println("*** senha incorreta ***");
            }
        }
    }
}
