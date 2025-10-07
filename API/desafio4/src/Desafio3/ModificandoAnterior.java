package Desafio3;

import Desafio2.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ModificandoAnterior {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
