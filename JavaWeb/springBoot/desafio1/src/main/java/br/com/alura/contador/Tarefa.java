package br.com.alura.contador;

public class Tarefa {

    private String descricao;
    private boolean concluido;
    private String pessoaResponsavel;

    public String getDescricao() {
        return descricao;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public boolean isConcluido(){
        return concluido;
    }

    public Tarefa(String descricao, boolean concluido, String pessoaResponsavel){
        this.descricao = descricao;
        this.pessoaResponsavel = pessoaResponsavel;
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa " + ", descroção: " + descricao + ", concluida: " + concluido + ", pessoaRespnsável: " + pessoaResponsavel;
    }


}
