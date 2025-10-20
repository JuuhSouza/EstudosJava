package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodios;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverterDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverterDados conversor = new ConverterDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6faf77b1";
    //utilizamos o final para dizer a ide q n vamos mudar essa varivel q ela será fixa e sempre tem q ter um valor atribuido, sempre colocaremos em capslock

    public void exibirMenu(){
        System.out.println("Digite o nome da série para busca: ");
        String nomeSerie = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY );  //replace é para mostrar a ide quando a serie tiver espaço entre o nome e ira trocar o espaso por +
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporadas> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6faf77b1");
            DadosTemporadas dadosTemporadas = conversor.obterDados(json, DadosTemporadas.class);
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY );
            temporadas.add(dadosTemporadas);
        }
        temporadas.forEach(System.out::println); //aparecer as temporadas um sout

         //formatar todos os nomes dos episodios em uma lista

        //JEITO ANTIGO DE SE FAZER
        for (int i = 0; i < dados.totalTemporadas(); i++) {
            List<DadosEpisodios> episodiosTemporada = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporada.size(); j++) {
                System.out.println(episodiosTemporada.get(j).titulo());
            }
        }

        //JEITO CERTO E NOVO DE SE FAZER UTILIZANDO LAMBDA

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        //-> é o lambida usada para simplificar um código q antes era feito em 5 linhas de código agr podemos fazer com uma linha só.
        //forEach percorrer a lista inteira com todos os dados.

        List<DadosEpisodios> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())// puxar todas as listas juntas
                .collect(Collectors.toList()); // coletar para a lista e tmbm ele pode adicionar manualmente uma informação diferete do toList q n pode ser alerado nem adicionar algo novo

        System.out.println("Top 5 episodios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A")) //ignorar as avaliaçoes q tem N/A
                .sorted(Comparator.comparing(DadosEpisodios::avaliacao).reversed()) // ordenar do maior para o menor
                .limit(5) //limite de 5 episodios
                .forEach(System.out::println);












        // EXEMPLOS DE COMO USAR O LAMBDA
//        List<String> nomes = Arrays.asList("Júlia", "Eduarda", "Alguem aleatório", "Outra pessoa aletória");
//
//        nomes.stream()
//                .sorted() //ordenar em ordem alfabetica
//                .limit(3) //limitar aos primeiros da lista
//                .filter(e -> e.startsWith("E")) //filtra o nome com a letra E para só ela aparecer
//                .map(n -> n.toUpperCase()) //deixa o nome com E em letras maiusculas
//                .forEach(System.out::println); //imprimir


    }

}
