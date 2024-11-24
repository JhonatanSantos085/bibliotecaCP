public class Livro {

    private String titulo;
    private String genero;
    private String autor;


    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + titulo + '\'' +
                ", Gênero='" + genero + '\'' +
                ", Autor='" + autor + '\'' +
                '}';
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

}
