public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String toString(){
        return "Livro " + this.titulo + " de " + this.autor + " " + this.anoPublicacao;
    }
}
