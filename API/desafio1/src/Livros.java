import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Livros {
    public static void main(String[] args) throws IOException, InterruptedException {

        // 1- livros
        Scanner livro = new Scanner(System.in);
        System.out.println("Digite o titúlo de um livro para a busca: ");
        String leitura = livro.nextLine();

        String busca = "https://www.googleapis.com/books/v1/volumes?q=" + leitura + "&apikey=6faf77b1";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}