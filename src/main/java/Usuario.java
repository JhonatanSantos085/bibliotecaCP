import java.util.Scanner;

public class Usuario {

    private String nome;
    private long codigo;
    private long cpf;
    private Endereco endereco;
    private String email;
    private UserType tipoDeUsuario;

    Scanner scan = new Scanner(System.in);
    public void cadastrarUsuario() {
        System.out.println("Digite o nome do usuario");
        setNome(scan.nextLine());
        System.out.println("Digite o codigo do usuario");
        setCodigo(scan.nextLong());
        System.out.println("Digite o cpf do usuario");
        setCpf(scan.nextLong());
        System.out.println("Digite o endereco do usuario");
        var endereco = new Endereco();
        endereco.local();
        System.out.println("Digite o email do usuario");
        setEmail(scan.next());

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(UserType tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
