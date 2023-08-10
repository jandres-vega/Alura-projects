package com.javaPOO.introduccionObjetos;

public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.titular = "Andres";
        cliente.documento = "12313233";
        cliente.telefono = "3203453443";

        Cuenta cuentaCliente = new Cuenta();

        cuentaCliente.agencia = 1;
        cuentaCliente.titular = cliente;

        System.out.println(cuentaCliente.titular.titular);
        System.out.println(cuentaCliente.titular);
        System.out.println(cliente);
    }
}
