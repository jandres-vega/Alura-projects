package com.javaPOO.demoBank.Empleado;

import com.company.persona.Persona;

public class Empleado extends Persona {

    private int idEmpleado;
    public Empleado(String nombre, int edad, String direccion, int idEmpleado){
        super(nombre, edad, direccion);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
