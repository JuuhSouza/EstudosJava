package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.runtime.ObjectMethods;

public class ConverterDados implements IConverteDados {

    private ObjectMapper mapper = new ObjectMapper(); //objeto do jackson q fornece funcionalizadades para conversão entre objetos Java e JSON, e vice-versa

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe); //readValue : ler algo, neste caso é o json.
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
