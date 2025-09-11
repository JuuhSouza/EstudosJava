import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        // 2- lista de Produtos
        ArrayList<Product> listOfProduct = new ArrayList<>();

        Product produto1 = new Product("Caneta", 2.00);
        Product produto2 = new Product("Lápis", 1.00);
        Product produto3 = new Product("Borracha", 4.00);

        listOfProduct.add(produto1);
        listOfProduct.add(produto2);
        listOfProduct.add(produto3);

        System.out.println("Temos o total de : " + listOfProduct.size() + " produtos");

        Product moreExpensive = listOfProduct.get(0);

        for (Product product : listOfProduct){
            if (product.price > moreExpensive.price){
                moreExpensive = product;
            }
        }
        System.out.println("E o produto mais caro é " + moreExpensive.name);

        //3 -Lista de livros
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

      //4 - Lista de alunos
        ArrayList<Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student("Julia", 6.5);
        Student student2 = new Student("Eduarda", 8);
        Student student3 = new Student("Rodrigo", 4);

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);

        double sum = 0;

        System.out.println("Alunos que precisarão fazer a recuperação são: ");
        for (Student students : listOfStudents){
            //nota menos que 7
            if (students.notice < 7){
                System.out.println("- " + students.toString());
            }
            //Media de notas
            sum += students.getNotice();
        }

        double average = sum / listOfStudents.size();
        System.out.println("A media de todos os alunos são de " + sum);

        //5 - Lista de carro

        ArrayList<Car> listOfCars = new ArrayList<>();
        Car car1 = new Car("Komb", 1947,"preto");
        Car car2 = new Car("Mustang",1969,"vermelho");
        Car car3 = new Car("Opala",1989,"vermelho");

        listOfCars.add(car1);
        listOfCars.add(car2);
        listOfCars.add(car3);

        System.out.println("Temos 2 modelos com a cor vermelha que são: ");
        for (Car cars : listOfCars){
            if (cars.color.equals("vermelho")){
                System.out.println(cars.model);
            }
        }

        //6 - Lista animal

        ArrayList<Animals> listOfAnimals = new ArrayList<>();
        Animals animal1 = new Animals("Dogão","Dog");
        Animals animal2 = new Animals("Aisha","cat");
        Animals animal3 = new Animals("Blancka","cat");

        listOfAnimals.add(animal1);
        listOfAnimals.add(animal2);
        listOfAnimals.add(animal3);

        System.out.println("Temos os gatos: ");
        for (Animals animalCat : listOfAnimals){
            if (animalCat.species.equals("cat")){
                System.out.println(animalCat.name);
            }
        }

        //7 - Lista viagens
        ArrayList<Trip> tripList = new ArrayList<>();
        Trip trip1 = new Trip("Brasil",3);
        Trip trip2 = new Trip("Australia",7);
        Trip trip3 = new Trip("Amsterdam",12);
        Trip trip4 = new Trip("Inglaterra",10);

        tripList.add(trip1);
        tripList.add(trip2);
        tripList.add(trip3);
        tripList.add(trip4);

        System.out.println("As viagens que durarão mais que 7 dias são ");
        for (Trip trip : tripList){
            if (trip.durationOfDays > 7){
                System.out.println(trip.destination + " Ficará " + trip.durationOfDays + " dias");
            }
        }

        //8 - Lista de receitas
        ArrayList<Revenue> listOfRecipes = new ArrayList<>();
        Revenue revenue1 = new Revenue("Brigadeiro",30);
        Revenue revenue2 = new Revenue("Ovo",5);
        Revenue revenue3 = new Revenue("Fricasse",60);

        listOfRecipes.add(revenue1);
        listOfRecipes.add(revenue2);
        listOfRecipes.add(revenue3);

        System.out.println("Receitas que demoram menos que 30 minutos: ");
        for (Revenue revenue : listOfRecipes){
            if (revenue.preparationTime < 30){
                System.out.println(revenue.name + " - " + revenue.preparationTime + " minutos ");
            }
        }

        //9 - lista de filmes
        ArrayList<Film> listFilms = new ArrayList<>();
        Film film1 = new Film("Oito mulheres e um só segredo", 9,"Comédia");
        Film film2 = new Film("Avatar o caminho da água", 7.5,"Ação");
        Film film3 = new Film("A herdeira", 7,"aventura");
        Film film4 = new Film("Invocação do mal", 6,"Terror");
        Film film5 = new Film("Harry potter", 8,"Aventura");

        listFilms.add(film1);
        listFilms.add(film2);
        listFilms.add(film3);
        listFilms.add(film4);
        listFilms.add(film5);

        System.out.println("Veja alguns filmes com melhores avaliações: ");
        for (Film film : listFilms){
            if (film.assessment >= 8){
                System.out.println(film.title + " Gênero - " + film.gender);
            }
        }

        //10 - Lista de atletas

        ArrayList<Athlete> listOfAthlets = new ArrayList<>();
        Athlete athlete1 = new Athlete("Sabrina","Corrida",7);
        Athlete athlete2 = new Athlete("Yasmin","Salto",4);
        Athlete athlete3 = new Athlete("Nina","Salto com vara",8.8);

        listOfAthlets.add(athlete1);
        listOfAthlets.add(athlete2);
        listOfAthlets.add(athlete3);

        Athlete champion = listOfAthlets.get(0);

        System.out.println("O campeão é: ");

        for (Athlete athlete : listOfAthlets){
            if (athlete.score > champion.score){
                champion = athlete;
            }
            System.out.println(champion.name);
        }
        
    }
}