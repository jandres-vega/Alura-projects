package com.javaPOO.projectPooBankOracle;

public class TestReferencia {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNombre("andres");

        Gerente gerente1 = new Gerente();
        gerente1.setNombre("maria");

        funcionario1.setSalario(2.000);

        gerente1.setSalario(3.000);
    }
}
