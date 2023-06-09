/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colabnaco;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author leona
 */
public class GestorClientes {

    private Queue<Cliente> cola;

    public void gestorCliente() {
        cola = new LinkedList<>();
    }

    public void llegadaCliente(Cliente c) {
        cola.add(c);
    }

    public void atenderCliente() {
        System.out.println(cola.element().toString());
        cola.poll();
    }

    public int clientesPendientes() {

        return cola.size();
    }

    public void tiempo(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            double numeroAleatorio = Math.random();
            double umbral = 0.5;
        }

    }
}
