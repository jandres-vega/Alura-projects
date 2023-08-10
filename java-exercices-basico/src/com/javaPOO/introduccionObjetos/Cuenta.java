package com.javaPOO.introduccionObjetos;

public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

    public Cuenta(){

    }
    public double getSaldo(){
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public double retirar(double valor){
        if (this.saldo >= valor){
            return this.saldo -= valor;
        }else {
            return valor;
        }
    }
    public boolean transferir (double valor, Cuenta cuneta2){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            cuneta2.depositar(valor);
            return true;
        }else {
            return false;
        }
    }
}
