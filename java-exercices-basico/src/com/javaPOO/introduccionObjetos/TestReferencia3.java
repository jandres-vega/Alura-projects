package com.javaPOO.introduccionObjetos;

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaCliente1 = new Cuenta();
        Cliente cliente = new Cliente();
        cuentaCliente1.titular = cliente;

        cuentaCliente1.titular.titular = "Andres";
        System.out.println(cuentaCliente1.titular.titular);
    }
}
