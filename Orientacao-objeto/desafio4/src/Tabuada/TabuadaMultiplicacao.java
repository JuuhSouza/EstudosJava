package Tabuada;

public class TabuadaMultiplicacao {

    public void mostrarTabuada(int numero){
        System.out.println("Tabuada da multiplicação do " + numero + " : ");
        for (int i = 1; i < 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
