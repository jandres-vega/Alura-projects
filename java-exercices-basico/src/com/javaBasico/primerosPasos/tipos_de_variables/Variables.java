package com.javaBasico.primerosPasos.tipos_de_variables;

public class Variables {
    public static void main(String[] args) {

        int age = 13; //Numeros enteros
        System.out.println("edad " + age);

        double salario = 1250.50; //Numeros decimales
        System.out.println("El salarios es: " + salario);

        //Comversiones, parsear o casting

        double variable1 = 23.45;
        int variableEntero = (int) variable1; //Casting
        System.out.println(variableEntero);

        long numeroLargo = 2222222222L;

        short numeroPequeño = 234;

        byte numeroAunMasPequeño = 13;

        float numeroDecimalPequeño = 2.5F;

        //caracteres

        char letra = 'a';

        String palabra = "hola";
    }
}
