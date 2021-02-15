package br.com.javaoo.servico;

import br.com.javaoo.model.Funcionario;

public class ControleDeBonificacao {

    private double totalDeBonificacao;

    public void registra(Funcionario funcionario) {
        this.totalDeBonificacao += funcionario.calculaBonificacao();
    }

    public double getTotalDeBonificacao() {
        return totalDeBonificacao;
    }
}
