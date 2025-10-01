package Atividade_3;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String livro = "{\"titulo\":\"Lady Killers\",\"autor\":\" Tori Telfer\",\"editora\":{\"nome\":\"Darkside Books\",\"cidade\":\"Rio de Janeiro\"}}";

        Gson gson = new Gson();
        Livro livro1 = gson.fromJson(livro, Livro.class);

        System.out.println("Informações: " + livro1);

    }
}
