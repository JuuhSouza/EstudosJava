
import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        //nova maneira de escrever o codigo

        meuFilme.setNome("Wall-e");
        meuFilme.setAnoLancamento(2008);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.fichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        //System.out.println("Avaliações: " + meuFilme.avaliacao);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println("Média de avaliações: " + meuFilme.mediaAvaliacao());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());

        //jeito antigo de se fazer

        // Filme meuFilme2 = new Filme();
        // meuFilme2.nome = "up";
        // meuFilme2.duracaoMinutos = 200;
        // meuFilme2.anoLancamento = 2005;


        // meuFilme2.fichaTecnica();
        // meuFilme2.avalia(9);
        // meuFilme2.avalia(6);
        //  meuFilme2.avalia(10);
        //  System.out.println("Total de avaliações: " + meuFilme2.getTotalAvaliacao());
        //  System.out.println("Média de avaliações: " + meuFilme2.mediaAvaliacao());

        //Jeito antigo de se fazer

        //meuFilme2.avaliacao = 10;
        //meuFilme2.totalAvaliacao =1;
        //System.out.println(meuFilme2.mediaAvaliacao());

        Serie the100 = new Serie();
        the100.setNome("The 100");
        the100.setAnoLancamento(2015);
        the100.setEpisodiosTemporadas(10);
        the100.setTemporadas(7);
        the100.setMinutosPorEpisodio(42);
        the100.fichaTecnica();
        System.out.println("Duração para maratonar the 100 : " + the100.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(the100);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(the100);
        episodios.setTotalVisualizacoes(400);
        filtro.filtro(episodios);

        Filme filmeDaJulia = new Filme();
        filmeDaJulia.setNome("Os pecadores");
        filmeDaJulia.setAnoLancamento(2025);
        filmeDaJulia.setDuracaoMinutos(200);
        filmeDaJulia.avalia(8);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDaJulia);
        listaDeFilme.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilme.size()); //size -> quantos elementos adicionados
        System.out.println("Primeiro filme " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("ToString " + listaDeFilme.get(0).toString());
    }
}
