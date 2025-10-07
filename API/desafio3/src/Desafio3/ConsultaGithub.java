package Desafio3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaGithub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de usúario para consultar: ");
        String nomeUsuario = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + nomeUsuario;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsutaGithub("Usuário não encontrado! tente novamente");
            }

            String json = response.body();
            System.out.println(json);
        }
        catch (IOException | InterruptedException consulta){
            System.out.println("Eita... Houve um erro!");
            consulta.printStackTrace();
        }catch (ErroConsutaGithub mensagem){
            System.out.println(mensagem.getMessage());
        }



    }



}
