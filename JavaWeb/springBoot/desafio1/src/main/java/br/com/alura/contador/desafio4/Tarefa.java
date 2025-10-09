package br.com.alura.contador.desafio4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

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

    public void run(String... args) throws Exception{
        Tarefa tarefa = new Tarefa("Aula 1",false,"Júlia");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("tarefas.json"), tarefa);
        System.out.println("Dados salvos com sucesso!");
    }


}
