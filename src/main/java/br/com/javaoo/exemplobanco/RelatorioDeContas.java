package br.com.javaoo.exemplobanco;

import java.util.List;

public class RelatorioDeContas {

    public void gerarRelatorio(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta.getInfo());
        }
    }

}
