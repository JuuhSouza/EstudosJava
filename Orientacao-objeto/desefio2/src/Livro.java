public class Livro {
    private String titulo;
    private String autor;

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Seu autor é " + autor);
    }
}
