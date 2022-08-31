import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Editora> editoras;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo>  emprestimos;
    private ArrayList<Autor> autores;

    public Biblioteca(ArrayList<Livro> livros, ArrayList<Editora> editoras, ArrayList<Cliente> usuarios, ArrayList<Emprestimo> emprestimos, ArrayList<Autor> autores) {
        this.livros = livros;
        this.editoras = editoras;
        this.clientes = usuarios;
        this.emprestimos = emprestimos;
        this.autores = autores;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(ArrayList<Editora> editoras) {
        this.editoras = editoras;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
