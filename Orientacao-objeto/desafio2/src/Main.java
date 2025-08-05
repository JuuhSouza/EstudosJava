//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Idade pessoa
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Júlia");
        idadePessoa.setIdade(20);

        System.out.println(idadePessoa.getNome() + " tem " + idadePessoa.getIdade() + " de idade.");
        idadePessoa.verificarIdade();

    }
}

