package br.com.javaoo.exemplobanco;

public class ContaCorrente extends Conta {
    @Override
    public void render() {
        double valorARender = getSaldo() * 0.02;
        setSaldo(getSaldo() + valorARender);
    }

    @Override
    public void depositar(double valor) {
        valor = valor - (valor * 0.10);
        super.depositar(valor);
    }

    @Override
    public String getTipo() {
        return "DD";
    }
}
