package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //Ignorar oq n foi selecionado da api


public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
//@jsonAlias serve para selecionar o elemento na api para linkar com uma string


}
