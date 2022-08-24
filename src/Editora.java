import java.util.ArrayList;

public class Editora {

    private int idEditora;
    private String nome;
    private ArrayList<Livro> livros;

    public Editora(int idEditora, String nome) {
        this.idEditora = idEditora;
        this.nome = nome;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
