package com.javaPOO.demoBank.cuentaBancaria;

import com.company.cliente.Cliente;

public class CuentaBancaria {

    private Cliente titular;
    private double saldo;

    public CuentaBancaria(Cliente titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    public void retirar(double retiro){
        this.saldo -= retiro;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
