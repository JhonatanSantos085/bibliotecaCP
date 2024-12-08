import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Livro> books;
    private List<Funcionario> employees;
    private List<Usuario> users;

    private int bookIdCounter = 1;

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


}
