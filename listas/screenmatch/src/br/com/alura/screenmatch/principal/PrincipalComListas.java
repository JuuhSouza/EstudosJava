package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Wall-e", 2008);
        meuFilme.avalia(10);
        Serie the100 = new Serie("The 100", 2015);
//        the100.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);
        Filme filmeDaJulia = new Filme("Os pecadores",2025);
        filmeDaJulia.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaJulia);
        lista.add(meuFilme);
        lista.add(the100);

        for (Titulo item : lista){// intera a lista de um jeito mais simples
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){ // pergunta se o item é igual ao Filme e ja cria um new para ele
                System.out.println("Classficação: " + filme.getClassificacao());
            }
        }
    }
}
