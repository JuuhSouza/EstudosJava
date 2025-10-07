package Desafio4;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();

        carro.getModelo("Komb");
        carro.getAno(2000);
        carro.getCor("Azul");

        Gson gson = new Gson();
        String veiculojson = gson.toJson(carro);

        System.out.println("Veiculo: ");
        System.out.println(veiculojson);

    }
}
