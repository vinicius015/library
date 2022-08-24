import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaUI {

    private ArrayList<Livro> livros;
    private ArrayList<Editora> editoras;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo>  emprestimos;
    private ArrayList<Autor> autores;

    public BibliotecaUI(ArrayList<Livro> livros, ArrayList<Editora> editoras, ArrayList<Usuario> usuarios, ArrayList<Emprestimo> emprestimos, ArrayList<Autor> autores) {
        this.livros = livros;
        this.editoras = editoras;
        this.usuarios = usuarios;
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

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
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

    public static void abrirMenu() {
        System.out.println("------------------------------------------");
        System.out.println("|      BEM VINDO A BIBLIOTECA MINHAO     |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Gerenciar Livros                 |");
        System.out.println("|   (2) Gerenciar Editoras               |");
        System.out.println("|   (3) Gerenciar Emprestimos            |");
        System.out.println("|   (4) Gerenciar Usuarios               |");
        System.out.println("|   (5) Sair do programa                 |");
        System.out.println("|                                        |");
        System.out.println("------------------------------------------");
    }

    public static void mudarMenu (int opcao) {

        switch (opcao) {
            case 1: abrirMenuLivros();
                break;
            case 2: abrirMenuEditoras();
                break;
            case 3: abrirMenuEmprestimos();
                break;
            case 4: abrirMenuUsuarios();
                break;
            case 5: System.out.println("Até logo!");
                    System.exit(0);
                break;
        }
    }

    private static void abrirMenuUsuarios() {
        System.out.println("------------------------------------------");
        System.out.println("|      GERENCIAMENTO DE USUARIOS         |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar Usuario                |");
        System.out.println("|   (2) Alterar Usuario                  |");
        System.out.println("|   (3) Deletar emprestimo               |");
        System.out.println("|   (4) Consultar multas                 |");
        System.out.println("|   (5) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }

    private static void abrirMenuEmprestimos() {
        System.out.println("------------------------------------------");
        System.out.println("|      GERENCIAMENTO DE EMPRESTIMOS      |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar emprestimo             |");
        System.out.println("|   (2) Alterar emprestimo               |");
        System.out.println("|   (3) Encerrar emprestimo              |");
        System.out.println("|   (4) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }

    private static void abrirMenuEditoras() {
        System.out.println("------------------------------------------");
        System.out.println("|        GERENCIAMENTO DE EDITORAS       |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar uma nova editora       |");
        System.out.println("|   (2) Alterar editora                  |");
        System.out.println("|   (3) Deletar editora                  |");
        System.out.println("|   (4) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }

    private static void abrirMenuLivros() {
        System.out.println("------------------------------------------");
        System.out.println("|         GERENCIAMENTO DE LIVROS        |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar novo livro             |");
        System.out.println("|   (2) Alterar livro                    |");
        System.out.println("|   (3) Deletar livro                    |");
        System.out.println("|   (4) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        abrirMenu();
        int opcao = input.nextInt();

        mudarMenu(opcao);

    }
}