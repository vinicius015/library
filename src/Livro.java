public class Livro {

    private int idLivro;
    private String nome;
    private String categoria;
    private Autor autor;
    private Editora editora;
    private int numPaginas;

    public Livro(int idLivro, String nome, String categoria, Autor autor, Editora editora, int numPaginas) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.categoria = categoria;
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
