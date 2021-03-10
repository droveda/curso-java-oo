package br.com.javaoo.examplofuncionario;

public class AppMain {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Joao");
        gerente.setNumeroDeFuncionariosGerenciados(10);
        gerente.setCpf("43434343");
        gerente.setSenha("445566");

        boolean result = gerente.autentica("senha123");
        System.out.println(result);


        Funcionario fulano = new FuncionarioRH();
        fulano.setNome("Fulano");
        fulano.setCpf("5566");
        fulano.setSalario(1000);
        System.out.println(fulano.calculaBonificacao());

        Gerente ciclano = new Gerente();
        ciclano.setNumeroDeFuncionariosGerenciados(15);
        ciclano.setNome("Ciclano");
        ciclano.setCpf("6677");
        ciclano.setSalario(1000);
        System.out.println(ciclano.calculaBonificacao());

        ControleDeBonificacao controleDeBonificacao = new ControleDeBonificacao();
        controleDeBonificacao.registra(fulano);
        controleDeBonificacao.registra(ciclano);

        System.out.println(controleDeBonificacao.getTotalDeBonificacao());

        System.out.println("------------------------------");
        System.out.println(fulano.getInfo());
        System.out.println(ciclano.getInfo());
    }



}
