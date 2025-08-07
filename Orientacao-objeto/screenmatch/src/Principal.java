
import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

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

    }
}
