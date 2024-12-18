import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados {
    private List<Livro> books;
    private List<Funcionario> employees;
    private List<Usuario> users;

    private String pesquisaDeLocacao = "error";

    private int bookIdCounter = 1;

    Scanner scan = new Scanner(System.in);

    public BancoDeDados(){
        books = new ArrayList<>();
        employees = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void postBook(Livro livro){
        livro.setId(bookIdCounter);
        books.add(livro);
        bookIdCounter ++;
    }
    public void getBook(){
        for (Livro livro : books){
            System.out.println(livro);
        }
    }
    public void getBookAvailable(){
        for (Livro livro : books){
            if (livro.isEstadoLocacao()){
                System.out.println(livro);
            }
            System.out.println();
        }
    }

    public void locandoLivro(){
        System.out.println("Digite o titulo do livro que sera locado");
        pesquisaDeLocacao = scan.nextLine();
        for (Livro livro : books){
            if(livro.getTitulo().equals(pesquisaDeLocacao)){
                System.out.println(livro);

                if (livro.isEstadoLocacao()){
                    System.out.println("Livro disponivel");
                    livro.setEstadoLocacao(false);
                    System.out.println("locado com sucesso!");
                }else {
                    System.out.println("O livro já foi locado");
                }

            }else {

                System.out.println("Livro nao encontrado");
                break;
            }
        }

    }


    @Override
    public String toString() {
        return "BancoDeDados{" +
                "pesquisaDeLocacao='" + pesquisaDeLocacao + '\'' +
                '}';
    }

    public String getPesquisaDeLocacao() {
        return pesquisaDeLocacao;
    }

    public void setPesquisaDeLocacao(String pesquisaDeLocacao) {
        this.pesquisaDeLocacao = pesquisaDeLocacao;
    }
}
