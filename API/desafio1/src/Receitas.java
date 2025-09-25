import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Receitas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner receita = new Scanner(System.in);

        System.out.println("Insira o nome de uma receita: ");
        String nomeReceita = receita.nextLine();

        String busca = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(""))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}