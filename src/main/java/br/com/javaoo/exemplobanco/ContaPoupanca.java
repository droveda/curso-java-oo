package br.com.javaoo.exemplobanco;

public class ContaPoupanca extends Conta {
    @Override
    public void render() {
        double valorARender = getSaldo() * 0.05;
        setSaldo(getSaldo() + valorARender);
    }

    @Override
    public String getTipo() {
        return "CP";
    }
}
