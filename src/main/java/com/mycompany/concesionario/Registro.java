/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Steven
 */
public class Registro {
     
    int id=1;
    public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public String opcion;
    public ArrayList<Vehiculo> vehiculos;
    boolean disponible = true, accesorio;
    
    public Registro() {
        this.vehiculos = new ArrayList();
    }
    public void agregarVehiculoEstandar() throws IOException{
        
        do{
            System.out.println("Digite la marca");
            String marca = entradaDatos.readLine();
            System.out.println("Digite el modelo");
            String modelo = entradaDatos.readLine();
            System.out.println("Digite el color");
            String color = entradaDatos.readLine();
            System.out.println("Digite el Precio");
            int precio = Integer.parseInt(entradaDatos.readLine());
            System.out.println("Cuantos Automoviles Llegaron?");
            int cantidad = Integer.parseInt(entradaDatos.readLine());
            Estandar nuevoEstandar = new Estandar(id, marca, modelo, color, precio, "Familiar", cantidad, disponible);
            vehiculos.add(nuevoEstandar);
            System.out.println("Desea Ingresar otro Automovil?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
}
