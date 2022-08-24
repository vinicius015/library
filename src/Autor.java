import java.util.ArrayList;

public class Autor {

    private int idAutor;
    private String nome;
    private ArrayList<Livro> livros;

    public Autor(int idAutor, String nome) {
        this.idAutor = idAutor;
        this.nome = nome;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
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
