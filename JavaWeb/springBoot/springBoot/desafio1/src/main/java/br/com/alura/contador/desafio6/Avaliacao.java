package br.com.alura.contador.desafio6;

import java.util.List;

public class Avaliacao <T>{
    private T item;
    private double nota;
    private String comentario;

    public Avaliacao(T item,double nota, String comentario){
        if (nota < 0 || nota > 10){
            throw new IllegalArgumentException("Sua nota deve ser entre 0 e 10");
        }

        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static <T> double calcularMediaDeNotas(List<Avaliacao> avaliacaos){
        if (avaliacaos.isEmpty()){
            throw new IllegalArgumentException("Lista vazia!!");
        }

        double soma = 0;
        for (Avaliacao<T> avaliacao : avaliacaos){
            soma+= avaliacao.getNota();
        }
        return soma / avaliacaos.size();
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}

