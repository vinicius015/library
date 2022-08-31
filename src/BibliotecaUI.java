import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaUI {

    private final int IN_MENU_PRINCIPAL = 1;
    private final int IN_MENU_LIVROS = 2;
    private final int IN_MENU_EDITORAS = 3;
    private final int IN_MENU_EMRPESTIMOS = 4;
    private final int IN_MENU_CLIENTES = 5;
    private final int IN_MENU_FUNCIONARIOS = 6;

    int opcaoMenu = 0;

    public static void abrirMenu() {

        System.out.println("------------------------------------------");
        System.out.println("|      BEM VINDO A BIBLIOTECA AMARAL     |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Gerenciar Livros                 |");
        System.out.println("|   (2) Gerenciar Editoras               |");
        System.out.println("|   (3) Gerenciar Emprestimos            |");
        System.out.println("|   (4) Gerenciar Clientes               |");
        System.out.println("|   (5) Gerenciar Funcionarios           |");
        System.out.println("|   (6) Sair do programa                 |");
        System.out.println("|                                        |");
        System.out.println("------------------------------------------");

    }

    public static void mudarMenu () {
        int opcao = 0;

        try {
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();
        input.close();
        } catch (Exception e) {
            System.out.println("Digite uma opcao valida");
        }

        switch (opcao) {
            case 1: abrirMenuLivros();
                break;
            case 2: abrirMenuEditoras();
                break;
            case 3: abrirMenuEmprestimos();
                break;
            case 4: abrirMenuClientes();
                break;
            case 5: abrirMenuFuncionarios();
                break;
            case 6: System.out.println("Até logo!");
                    System.exit(0);
                break;
        }
    }

    private static void abrirMenuFuncionarios() {
        System.out.println("------------------------------------------");
        System.out.println("|     GERENCIAMENTO DE FUNCIONARIOS      |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar Funcionarios           |");
        System.out.println("|   (2) Alterar Funcionarios             |");
        System.out.println("|   (3) Deletar Funcionarios             |");
        System.out.println("|   (4) Consultar Funcionarios           |");
        System.out.println("|   (5) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }

    private static void abrirMenuClientes() {
        System.out.println("------------------------------------------");
        System.out.println("|        GERENCIAMENTO DE CLIENTES       |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar Cliente                |");
        System.out.println("|   (2) Alterar Cliente                  |");
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
        System.out.println("|        GERENCIAMENTO DE LIVROS         |");
        System.out.println("|                                        |");
        System.out.println("| Selecione uma opcao:                   |");
        System.out.println("|                                        |");
        System.out.println("|   (1) Adicionar novo livro             |");
        System.out.println("|   (2) Alterar livro                    |");
        System.out.println("|   (3) Deletar livro                    |");
        System.out.println("|   (4) Voltar ao menu                   |");
        System.out.println("------------------------------------------");
    }

    public static void selecionaOpcao(int opcao) {
        switch (opcao) {
            case 1:
        }
    }




    public static void main(String[] args) {

        abrirMenu();
        mudarMenu();

    }
}