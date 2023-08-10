package com.javaPOO.introduccionObjetos;

public class TestReferencia {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();

        cuenta1.saldo = 200;

        Cuenta cuenta2 = cuenta1;

        cuenta2.saldo = 500;
        System.out.println("saldo primer cuenta: " + cuenta1.saldo);
        System.out.println("saldo seunda cuenta: " + cuenta2.saldo);

        cuenta2.saldo += 400;

        System.out.println("saldo primera " + "cuneta " + cuenta1.saldo);
    }


}
