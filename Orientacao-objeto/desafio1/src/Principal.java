public class Principal {
    public static void main(String[] args) {
        //1 - Pessoa
        Pessoa olaMundo = new Pessoa();
        olaMundo.olaMundo();

        //2 - Calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.NumeroCalcula(5);
        System.out.println(resultado);

        //3 - Musica
        Musica musica = new Musica();
        musica.titulo = "The Storm";
        musica.artista = "TheFatRat";
        musica.anoLancamento = 2020;

        musica.fichaTecnica();

        musica.avalia(9);
        musica.avalia(8.4);
        musica.avalia(8.9);

        double mediaAvaliacoes = musica.mediaAvaliacao();
        System.out.println("A média de avaliaçoes foi de : " + mediaAvaliacoes);

        //4 - Carro
        Carro modeloCarro = new Carro();
        modeloCarro.modelo = "Mustang";
        modeloCarro.ano = 1969;
        modeloCarro.cor = "Azul marinho";

        modeloCarro.fichaCarro();
        System.out.println("Seu carro tem " + modeloCarro.calculaIdadeCarro() + " Anos");

        //Aluno
        Aluno infoAluno = new Aluno();
        infoAluno.nome = "Júlia";
        infoAluno.idade = 20;

        infoAluno.informacoes();
    }
}
