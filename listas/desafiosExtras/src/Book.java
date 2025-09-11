public class Book {
    public String tittle;
    public String author;
    public int releaseYear;

    public Book(String tittle, String author, int releaseYear) {
        this.tittle = tittle;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String toString(){
        return "Livro " + this.tittle + " de " + this.author + " " + this.releaseYear;
    }
}
