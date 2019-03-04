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
public class menu {
     public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public void Menu()throws IOException{
        String opcionMenu;
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|              CONCESIONARIO                |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Agregar Automovil.                   |");
            System.out.println("|   3. Ver Stock.                           |");
            System.out.println("|   4. Reportes                             |");
            System.out.println("|   5. Comprar Automovil.                   |");
            System.out.println("|   5. modificar Automovil.                 |");
            System.out.println("|   0. Salir.                               |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");

            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    subMenuAutomovil();
                    break;
                case "2":
                   
                    break;
                case "3":
                    subMenuStock();
                    break;
                case "5":
                 
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu != "0");
}
     public void subMenuAutomovil()throws IOException{
        String opcionMenu;
        Registro agregar = new Registro();
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Agregar Automovil Deportivo.         |");
            System.out.println("|   2. Agregar Automovil Estandar.          |");
            System.out.println("|   3. Agregar maquinaria.                  |");
            System.out.println("|   4. Agregar personalizado                |");
            System.out.println("|   0. Atras.                               |");
            System.out.println("|                                           |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    
                    break;
                case "2":
                    agregar.agregarVehiculoEstandar();
                    break;
                case "3":
                    
                    break;
                case "4":
                  
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu == "0");
}
      public void subMenuStock()throws IOException{
        String opcionMenu;
        Registro buscar = new Registro();
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Estandar.                            |");
            System.out.println("|   2. Deportivo.                           |");
            System.out.println("|   3. Maquinaria.                          |");
            System.out.println("|   4. Personalizados.                      |");
            System.out.println("|   0. Atras.                               |");
            System.out.println("|                                           |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                   
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu == "0");
    }
       
}

