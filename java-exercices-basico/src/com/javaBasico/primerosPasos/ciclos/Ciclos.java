package com.javaBasico.primerosPasos.ciclos;

public class Ciclos {
    public static void main(String[] args) {

        int contador = 0;

        /*while (contador < 10){
            System.out.println(contador);
            contador++;
        }*/

        /*for (int i = 0; i<10;i++){
            System.out.println(i);
        }*/
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna <= 10; columna++) {
                if (columna > fila) {
                    break;
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
