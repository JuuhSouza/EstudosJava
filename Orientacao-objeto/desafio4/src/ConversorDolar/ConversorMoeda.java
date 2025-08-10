package ConversorDolar;

public class ConversorMoeda implements ConversaoFinanceira {
   @Override
    public void converterDolarReal(double valorDolar){
       double cotacao = 4.80;
       double valorReal = valorDolar * cotacao;
       System.out.println("O valor em reais é: R$" + valorReal);
   }
}