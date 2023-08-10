package com.javaPOO.demoBank.cuentaBancaria;

import com.company.cliente.Cliente;

public class CuentaAhorro extends CuentaBancaria{

    private static final double interesFijo = 4;
    public CuentaAhorro(Cliente titular, double saldo){
        super(titular, saldo);
    }
}
