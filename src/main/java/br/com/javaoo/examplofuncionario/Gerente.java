package br.com.javaoo.examplofuncionario;

public class Gerente extends Funcionario {

    private String senha;
    private int numeroDeFuncionariosGerenciados;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public boolean autentica(String senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido...");
            return true;
        } else {
            System.out.println("Acesso Negado...");
            return false;
        }
    }

    @Override
    public double calculaBonificacao() {
        return getSalario() * 0.15;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | " + this.numeroDeFuncionariosGerenciados;
    }
}
