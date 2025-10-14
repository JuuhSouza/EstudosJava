package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6faf77b1";
    //utilizamos o final para dizer a ide q n vamos mudar essa varivel q ela será fixa e sempre tem q ter um valor atribuido, sempre colocaremos em capslock


    public void exibirMenu(){
        System.out.println("Digite o nome da série para busca: ");
        String nomeSerie = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY );  //replace é para mostrar a ide quando a serie tiver espaço entre o nome e ira trocar o espaso por +


    }

}
