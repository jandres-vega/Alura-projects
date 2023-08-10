package com.javaPOO.projectPooBankOracle;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario andres = new Funcionario();

        andres.setNombre("Andres");
        andres.setDocumento("23123213213");
        andres.setSalario(2000);
        System.out.println(andres.getBonificacion());
        System.out.println(andres.getSalario());
    }
}
