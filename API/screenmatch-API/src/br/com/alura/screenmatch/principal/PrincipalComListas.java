package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(8);
        Filme filmeDaJulia = new Filme("Familia Addams",2024);
        filmeDaJulia.avalia(10);
        Serie lost = new Serie("Lost",2000);
        lost.avalia(7);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDaJulia);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //jeito novo serve para a idea escolha se a classe filme ou serie ira aparecer utilizando o instanceof
        for (Titulo item : lista){
            System.out.println(item.getNome() + " ano de lançamento " + item.getAnoDeLancamento());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
            //jeito antigo
            // Filme filme = (Filme) item; //declaração para mostrar a classificação
            // System.out.println("Classificação " + filme.getClassificacao());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ivete Sangalo");
        buscaPorArtista.add("Paulo Gustavo");
        buscaPorArtista.add("Angelina Jollie");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); //ele ordena em ordem alfabética
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // ordenar por ano de lançamento
        System.out.println("Ordenado por ano:");
        System.out.println(lista);



        
    }
}
