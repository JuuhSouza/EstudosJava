import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        //lista de Produtos
        ArrayList<Product> listOfProduct = new ArrayList<>();

        Product produto1 = new Product("Caneta", 2.00);
        Product produto2 = new Product("Lápis", 1.00);
        Product produto3 = new Product("Borracha", 4.00);

        listOfProduct.add(produto1);
        listOfProduct.add(produto2);
        listOfProduct.add(produto3);

        System.out.println("Temos o total de : " + listOfProduct.size() + " produtos");

        Product moreExpensive = listOfProduct.get(0);

        for (Product produto : listOfProduct){
            if (produto.price > moreExpensive.price){
                moreExpensive = produto;
            }
        }
        System.out.println("E o produto mais caro é " + moreExpensive.name);

        //Lista de livros
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Book book1 = new Book("Lady Killers", "tori Telfer", 2017);
        Book book2 = new Book("Diario de um banana", "Jeff Kinney", 2007);
        Book book3 = new Book("DemonSlayer", "Koyoharu", 2016);

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        System.out.println("Indicações de livros " + listOfBooks.toString());

        System.out.println("OS livros lançados depois de 2010 são: ");
        for (Book books : listOfBooks){
            if (books.releaseYear > 2010){
                System.out.println(" - " + books);
            }
        }

      // Lista de alunos
        ArrayList<Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student("Julia", 6.5);
        Student student2 = new Student("Eduarda", 8);
        Student student3 = new Student("Rodrigo", 4);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        for (Student studentsNotes : listOfStudents){
            return (student1 + student2 + student3) / 3;
        }

        System.out.println("Alunos que precisarão fazer a recuperação são: ");
        for (Student students : listOfStudents){
            if (students.notice < 7){
                System.out.println("- " + students.toString());
            }
        }



    }
}