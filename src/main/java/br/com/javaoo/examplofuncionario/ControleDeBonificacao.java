package br.com.javaoo.examplofuncionario;

import br.com.javaoo.examplofuncionario.Funcionario;

public class ControleDeBonificacao {

    private double totalDeBonificacao;

    public void registra(Funcionario funcionario) {
        this.totalDeBonificacao += funcionario.calculaBonificacao();
    }

    public double getTotalDeBonificacao() {
        return totalDeBonificacao;
    }
}
