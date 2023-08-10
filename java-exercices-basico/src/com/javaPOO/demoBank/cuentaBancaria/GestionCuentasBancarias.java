package com.javaPOO.demoBank.cuentaBancaria;

import com.company.cliente.Cliente;

import java.util.ArrayList;

public class GestionCuentasBancarias {

    public static CuentaBancaria crearCuenta(int tipoCuenta, Cliente titular, double saldo){
        if (tipoCuenta == 1){
            return new CuentaCorriente(titular, saldo);
        }else {
            return new CuentaAhorro(titular, saldo);
        }
    }

    public static void verCuentasBancarias(ArrayList<CuentaBancaria> cuentas){
        for (int i = 0; i < cuentas.size(); i++){
            System.out.println(
                    "id Cliente: " + cuentas.get(i).getTitular().getIdCliente() + "\n" +
                            "saldo: " + cuentas.get(i).getSaldo()
            );
        }
    }
}
