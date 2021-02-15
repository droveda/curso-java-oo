package br.com.javaoo.app;

import br.com.javaoo.model.Gerente;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Joao");
        gerente.setNumeroDeFuncionariosGerenciados(10);
        gerente.setCpf("43434343");
        gerente.setSenha("445566");

        boolean result = gerente.autentica("senha123");
        System.out.println(result);
    }

}
