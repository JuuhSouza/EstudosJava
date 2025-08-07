
import Carro.Carro;
import ModeloCarro.ModeloCarro;

public class Principal {
    public static void main(String[] args) {

        //1 - Carro
        Carro carro1 = new Carro();
        carro1.definirModelo("Opala");
        carro1.definirPrecos(12.626, 19.403,  20.727);
        carro1.exibirFichaCarro();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setAnoModelo1(1987);
        modeloCarro.setGetAnoModelo2(1988);
        modeloCarro.setGetAnoModelo3(1989);

        System.out.println("Este modelo é de: " + modeloCarro.getAnoModelo1());
        System.out.println("Este modelo é de: " + modeloCarro.getGetAnoModelo2());
        System.out.println("Este modelo é de: " + modeloCarro.getGetAnoModelo3());
    }
}
