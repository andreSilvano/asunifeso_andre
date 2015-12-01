package br.com.biblioteca.model;

public class Emprestimo {
    
    private String dataEntrega;
    private Livro LIvro;
    private Funcionario funcionario;
    private Aluno aluno;

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the LIvro
     */
    public Livro getLIvro() {
        return LIvro;
    }

    /**
     * @param LIvro the LIvro to set
     */
    public void setLIvro(Livro LIvro) {
        this.LIvro = LIvro;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
