import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Júlia", 20);
        Pessoa pessoa2 = new Pessoa("Eduarda", 20);
        Pessoa pessoa3 = new Pessoa("Meg",13);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
        System.out.println("A primeira é: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);


    }
}