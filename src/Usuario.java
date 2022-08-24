import java.util.ArrayList;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(int idUsuario, String nome, String telefone, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

}
