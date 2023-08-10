package com.javaPOO.demoBank.cliente;


import com.javaPOO.demoBank.persona.Persona;

public class Cliente extends Persona {

    private int idCliente;
    public Cliente(int idCliente){
        super();
        this.idCliente = idCliente;
    }
    public Cliente(String nombre, int edad, String direccion, int idCliente){
        super(nombre, edad, direccion);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
