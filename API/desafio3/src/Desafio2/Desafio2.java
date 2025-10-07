package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        int senha = scanner.nextInt();
        String digitarSenha = "";

        try{
            validarSenha(String.valueOf(senha));
            System.out.println("Senha válida");
        }catch(SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha dverá ter 8 digitos");
        }
    }

}
