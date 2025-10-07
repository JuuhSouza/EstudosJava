package Desafio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero para começar a divisão: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = scanner.nextInt();

        try{
            int resultado = numero / denominador;
            System.out.println("A divisão de " + numero + " por " + denominador + " é: " +resultado);
        } catch (ArithmeticException e ){
            System.out.println("Erro: numero inválido");
        }

    }
}