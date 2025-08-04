public class Condicional {
    public static void main(String[] args) {
        int anoDelancamento = 2008;
        boolean incluidoNoFilme = true;
        double notaFilme = 9.5;
        String tipoPlano = "plus";

        if (anoDelancamento >= 2008 ){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoFilme == true && tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        }else {
            System.out.println("deve pagar a locação");
        }
    }
}
