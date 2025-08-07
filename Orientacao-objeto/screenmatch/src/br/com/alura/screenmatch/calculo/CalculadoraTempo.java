package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de : " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
