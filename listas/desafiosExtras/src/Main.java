import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        //lista de Produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Caneta", 2.00);
        Produto produto2 = new Produto("Lápis", 1.00);
        Produto produto3 = new Produto("Borracha", 4.00);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Temos o total de : " + listaProdutos.size() + " produtos");
        System.out.println("E o produto mais caro é " + listaProdutos.get(2).nome);

        //Lista de livros
        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        Livro livro1 = new Livro("Lady Killers", "tori Telfer", 2017);
        Livro livro2 = new Livro("Diario de um banana", "Jeff Kinney", 2007);
        Livro livro3 = new Livro("DemonSlayer", "Koyoharu", 2016);


        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);

        System.out.println("Indicações de livros " + listaDeLivros.toString());
        System.out.println("Os lançamentos depois de 2010 são: " + listaDeLivros.get(2).titulo + " e " + listaDeLivros.get(0).titulo);

//        for (Livro livros : listaDeLivros){
//            if (listaDeLivros => 2010){
//                System.out.println(listaDeLivros);
//            }
//        }

      // Lista de alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Julia", 8.5);
        Aluno aluno2 = new Aluno("Eduarda", 8);
        Aluno aluno3 = new Aluno("Rodrigo", 8.2);

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        

    }
}