package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodios;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { //implementa o elemento CommandLineRunner para começar a aplicação

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        ConsumoAPI consumoAPI = new ConsumoAPI();
        String json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6faf77b1");
//        System.out.println(json);
//        json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
        System.out.println(json);

        ConverterDados converterDados = new ConverterDados();
        DadosSerie dados = converterDados.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        //dados dos episodios / escolha um episodio e a temporadasa desejada para aparecer
        json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=2&episode=10&apikey=6faf77b1");
        DadosEpisodios dadosEpisodios = converterDados.obterDados(json, DadosEpisodios.class);
        System.out.println(dadosEpisodios);

        List<DadosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6faf77b1");
            DadosTemporadas dadosTemporadas = converterDados.obterDados(json, DadosTemporadas.class);
            temporadas.add(dadosTemporadas);
        }
        temporadas.forEach(System.out::println); //aparecer as temporadas um sout

    }
}
