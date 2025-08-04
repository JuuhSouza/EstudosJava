public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacoes;
    int numeroAvaliacao;

    void fichaTecnica(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Lançamento da música: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacoes += nota;
        numeroAvaliacao++;
    }

    double mediaAvaliacao(){
        return avaliacoes / numeroAvaliacao;
    }
}
