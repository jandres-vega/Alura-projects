package com.javaBasico.primerosPasos;

public class Casting {
    public static void main(String[] args) {
        double mounthDogs =30.0 / 12.0;

        System.out.println(mounthDogs);

        //COMVERTIRLO A UN ENTERO
        int estimation = (int) mounthDogs;
        System.out.println(estimation);

        int a = 30;
        int b = 12;

        System.out.println((double)a/b);
    }
}
