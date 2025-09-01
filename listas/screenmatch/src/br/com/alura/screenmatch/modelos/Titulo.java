package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Não iniciamos com o psvm e nem o sout.

    private String nome;
    private int anoLancamento;
    private boolean inlcuidoPlano;
    private int duracaoMinutos;
    private double avaliacao;
    private int totalAvaliacao;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    //nova maneira de escrever o codigo, utilizamos o atalho alt + Insert, para abrir uma janela de opçoes para escolher. o setters ou getters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInlcuidoPlano(boolean inlcuidoPlano) {
        this.inlcuidoPlano = inlcuidoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void fichaTecnica(){
        System.out.println("Nome da série: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    public double mediaAvaliacao(){
        return avaliacao / totalAvaliacao;
    }
}
