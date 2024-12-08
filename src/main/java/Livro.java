import java.util.Scanner;

public class Livro {
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private boolean estadoLocacao;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarLivro() {
        System.out.println("Cadastrando o livro...");
        System.out.println("Título do livro: ");
        titulo = scanner.nextLine();
        System.out.println("Gênero do livro: ");
        genero = scanner.nextLine();
        System.out.println("Autor do livro: ");
        autor = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Id= '" + id + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Gênero='" + genero + '\'' +
                ", Autor='" + autor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
