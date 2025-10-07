package Desafio2;

public class SenhaInvalidaException extends Throwable {
    public SenhaInvalidaException(String mensagem){
        System.out.println(mensagem);
    }
}
