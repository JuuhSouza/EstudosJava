package Desafio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

    String mensagem = "Conteudo a ser gravado!";

    FileWriter escrever = new FileWriter("arquivo.txt");
    escrever.write(mensagem);
    escrever.close();

    }
}