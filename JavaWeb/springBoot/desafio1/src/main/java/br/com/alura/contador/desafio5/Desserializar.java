package br.com.alura.contador.desafio5;

import br.com.alura.contador.desafio4.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Desserializar {

    public void run(String... args) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Tarefa lerTarefa = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
        System.out.println("Tarefa lida com sucesso!");
        System.out.println(lerTarefa);
    }
}
