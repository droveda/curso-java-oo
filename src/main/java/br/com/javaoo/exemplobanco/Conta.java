package br.com.javaoo.exemplobanco;

public abstract class Conta {

    private String agencia;
    private String numero;
    private double saldo;
    private String titular;


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void transferir(double valor, Conta conta) {
        saldo -= valor;
        conta.saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public abstract void render();

    public void depositar(double valor) {
        saldo += valor;
    }

    public String getInfo() {
        return titular + "," + saldo;
    }

    public abstract String getTipo();
}
