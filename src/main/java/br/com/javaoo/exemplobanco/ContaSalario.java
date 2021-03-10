package br.com.javaoo.exemplobanco;

public class ContaSalario extends Conta {

    @Override
    public void render() {
        //nada, conta nao rende
    }

    @Override
    public String getTipo() {
        return "CS";
    }

}
