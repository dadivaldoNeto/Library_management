package model;
import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private Livro livro;
    private User usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    private State ativo;

    public Emprestimo(int id, Livro livro, User usuario, LocalDate dataDevolucaoPrevista) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.ativo = State.ACTIVE;
    }

}
