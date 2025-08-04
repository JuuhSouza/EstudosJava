public class Filme {
//Não iniciamos com o psvm e nem o sout.

    String nome;
    int anoLancamento;
    boolean inlcuidoPlano;
    int duracaoMinutos;
    double avaliacao;
    int totalAvaliacao;

    void fichaTecnica(){
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacao(){
        return avaliacao / totalAvaliacao;
    }
}
