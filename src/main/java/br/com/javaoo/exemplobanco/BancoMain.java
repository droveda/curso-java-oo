package br.com.javaoo.exemplobanco;

import java.util.ArrayList;
import java.util.List;

public class BancoMain {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(100);
        contaCorrente.setAgencia("123");
        contaCorrente.setNumero("111");
        contaCorrente.setTitular("Fulano");

        contaCorrente.render();

        System.out.println(contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(100);
        contaPoupanca.setAgencia("123");
        contaPoupanca.setNumero("111");
        contaPoupanca.setTitular("Beltrano");

        contaPoupanca.transferir(20, contaCorrente);


        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca: " + contaPoupanca.getSaldo());

        System.out.println("----------------");

        RelatorioDeContas relatorioDeContas = new RelatorioDeContas();
        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        relatorioDeContas.gerarRelatorio(contas);

        System.out.println("----------------");
        System.out.println(contaCorrente.getTipo());

    }
}
