package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.source.tree.WhileLoopTree;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() // formatar o Filmes.json para ficar mais legivel a leitura
                .create(); // usamos para n precisar colocar letra miuscula na classe TituloOmdb para manter o pradrão

        while (!busca.equalsIgnoreCase("sair")){

        System.out.println("Digite o filme para busca: ");
        busca = leitura.nextLine();

        if (busca.equalsIgnoreCase("sair")){
            break;
        }

        try {
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=6faf77b1"; //replace serve para substituir um espaço em branco por sinal e +
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        //Titulo meuTitulo = gson.fromJson(json, Titulo.class); jeito antigo

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);

            //escrever em um arquivo / criar um arquivo txt
//            FileWriter escrita = new FileWriter("filmes.txt");
//            escrita.write(meuTitulo.toString());
//            escrita.close();

            titulos.add(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage()); //getMessage mostra a mensagem
        }catch (IllegalArgumentException e){
            System.out.println("Erro de argumento");
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("Filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("O programa finalizou com sucesso!");
    }
}
