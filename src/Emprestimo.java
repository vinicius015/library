import java.util.Date;

public class Emprestimo {

    private int idEmprestimo;
    private Usuario usario;
    private Livro livro;
    private Date data;
    private Date dataDevolucao;
    private boolean entregue;
    private boolean atrasado;

    public Emprestimo(int idEmprestimo, Usuario usario, Livro livro, Date data, Date dataDevolucao) {
        this.idEmprestimo = idEmprestimo;
        this.usario = usario;
        this.livro = livro;
        this.data = data;
        this.dataDevolucao = dataDevolucao;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Usuario getUsario() {
        return usario;
    }

    public void setUsario(Usuario usario) {
        this.usario = usario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }
}
