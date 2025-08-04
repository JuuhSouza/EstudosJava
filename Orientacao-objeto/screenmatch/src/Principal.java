public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Wall-e";
        meuFilme.anoLancamento = 2008;
        meuFilme.duracaoMinutos = 200;

        meuFilme.fichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        System.out.println("Avaliações: " + meuFilme.avaliacao);
        System.out.println("Total de avaliações: " + meuFilme.totalAvaliacao);
        System.out.println("Média de avaliações: " + meuFilme.mediaAvaliacao());

        Filme meuFilme2 = new Filme();
        meuFilme2.nome = "up";
        meuFilme2.duracaoMinutos = 200;
        meuFilme2.anoLancamento = 2005;

        meuFilme2.fichaTecnica();
        meuFilme2.avalia(9);
        meuFilme2.avalia(6);
        meuFilme2.avalia(10);
        System.out.println("Avaliações: " + meuFilme2.avaliacao);
        System.out.println("Total de avaliações: " + meuFilme2.totalAvaliacao);
        System.out.println("Média de avaliações: " + meuFilme2.mediaAvaliacao());
    }
}
