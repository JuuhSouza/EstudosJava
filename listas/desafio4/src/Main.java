import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 - lista de numeros

        System.out.println("____ATIVIDADE 1 ____");

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(8);
        listaNumeros.add(7);
        listaNumeros.add(5);

        Collections.sort(listaNumeros);
        System.out.println("Lista em ordem: " + listaNumeros);

        //3 - exercio 2 ordenados

        System.out.println("____ATIVIDADE 3 ____");

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("estojo"));
        titulos.add(new Titulo("borracha"));
        titulos.add(new Titulo("mochila"));
        titulos.add(new Titulo("caderno"));

        Collections.sort(titulos);

        System.out.println("Lista em ordem alfabética:");
        for (Titulo titulo : titulos){
            System.out.println(titulo.nome);
        }

        //4 - interface list

        System.out.println("____ATIVIDADE 4 ____");

        List<String> listaInterfaceList = new ArrayList<>();
        listaInterfaceList.add("Capa");
        listaInterfaceList.add("Óculos");
        listaInterfaceList.add("Madeira");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Máquina de costura");
        listaLinkedList.add("Agulha");
        listaLinkedList.add("Bobina");

        System.out.println("Lista feita com arrayList: " + listaInterfaceList);
        System.out.println("Lista feita com linkedList: " + listaLinkedList);

        //5 - polimorfismo

        System.out.println("____ATIVIDADE 5 ____");

        List<String> listaPolimorfismo = new ArrayList<>();
        listaPolimorfismo.add("Herança");
        listaPolimorfismo.add("Polimorfismo");
        listaPolimorfismo.add("Abstração");
        System.out.println("Lista com ArrayList: " + listaPolimorfismo);

        listaPolimorfismo = new LinkedList<>();
        listaPolimorfismo.add("ArrayList");
        listaPolimorfismo.add("List");
        listaPolimorfismo.add("LinkedList");
        System.out.println("Lista de LinkedList: " + listaPolimorfismo);


    }
}
