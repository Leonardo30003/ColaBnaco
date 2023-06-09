/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colabnaco;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class ColaBnaco {

    public static void main(String[] args) {
        GestorClientes cliente = new GestorClientes();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa tu nombre");
            String nombre=entrada.next();
            System.out.println("Ingresa tu correo");
            String correo = entrada.next();
            System.out.println("Ingresa el motivo de tu consulta");
            String solicitud =entrada.next();
            cliente.llegadaCliente(new Cliente(nombre,correo,solicitud));
        }
        System.out.println("Existen"+ cliente.clientesPendientes()+" consultas pendientes");
        while(cliente.clientesPendientes()>0){
            System.out.println("Si desea antender la colsulta precione 1");
            String bandera=entrada.next();
            if(bandera.equals("1")){
            cliente.atenderCliente();
            System.out.println("Existen "+ cliente.clientesPendientes()+" consultas pendientes");
            }
        }
    }
}
