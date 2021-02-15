package br.com.javaoo.model;

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

}
