package com.javaPOO.demoBank.cuentaBancaria;

import com.company.cliente.Cliente;

public class CuentaCorriente extends CuentaBancaria{
    private static final double comisionFija = 8;
    public CuentaCorriente(Cliente titular, double saldo){
        super(titular, saldo);
    }

}
