package com.javaPOO.demoBank.persona;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){}

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
