package Atividade_1_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertendoGsonParaJson {
    public static void main(String[] args) {

        // 1 - convertendo gson em json
       /* String pessoa = "{\"nome\":\"Júlia\",\"idade\":20,\"cidade\":\"Porto Alegre\"}";
        Gson gson = new Gson();
        Pessoa pessoa1 = gson.fromJson(pessoa, Pessoa.class);

        System.out.println("Informações: " + pessoa1);

        */

        //2 - Modificando o exercicio anterior - não compreendi muito sobre este desafio

        String pessoa = "{\"nome\":\"Júlia\",\"idade\":20,\"cidade\":\"Porto Alegre\"}";
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa1 = gson.fromJson(pessoa, Pessoa.class);

        System.out.println("Informações: " + pessoa1);


    }
}
