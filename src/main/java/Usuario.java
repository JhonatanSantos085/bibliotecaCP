public class Usuario {

    private String nome;
    private long codigo;
    private long cpf;
    private Endereco endereco;
    private String email;
    private String senha;
    private UserType tipoDeUsuario;


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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UserType getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(UserType tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
