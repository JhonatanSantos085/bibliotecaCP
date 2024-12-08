import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Livro> books;
    private List<Funcionario> employees;
    private List<Usuario> users;

    public BancoDeDados(){
        books = new ArrayList<>();
        employees = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void postBook(Livro livro){
        books.add(livro);
    }
    public void getBook(){
        for (Livro livro : books){
            System.out.println(livro);
        }
    }


}
