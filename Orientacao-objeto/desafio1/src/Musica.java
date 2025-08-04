public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numeroAvaliacao;

    void fichaTecnica(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Lançamento da música: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Total de avaliações: " + numeroAvaliacao);
    }

    double mediaAvaliacao(){
        return avaliacao / numeroAvaliacao;
    }
}
