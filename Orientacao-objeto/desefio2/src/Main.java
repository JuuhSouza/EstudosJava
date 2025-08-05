//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //2 - Idade pessoa
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Júlia");
        idadePessoa.setIdade(20);

        System.out.println(idadePessoa.getNome() + " tem " + idadePessoa.getIdade() + " de idade.");
        idadePessoa.verificarIdade();

        //3 - Produto
        Produto produto = new Produto();
        produto.setNome("Caneta");
        produto.setPreco(2.50);

        System.out.println("Nome do produto : " + produto.getNome());
        System.out.println("Preço : " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Com desconto seu produto ficou: " + produto.getPreco());

        //4 - Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Karine");
        aluno.setNota1(7.4);
        aluno.setNota2(8);
        aluno.setNota3(6.5);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Sua média de notas foi de " + aluno.calcularMedia());

        //5 - Livro
        Livro livro = new Livro();
        livro.setAutor("Tori Telfer");
        livro.setTitulo("Lady killers");

        livro.exibirDetalhes();
    }
}