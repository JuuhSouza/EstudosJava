import br.com.alura.screenmatch.modelos.Filme;

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

    }
}

