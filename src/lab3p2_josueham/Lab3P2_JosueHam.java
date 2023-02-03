package lab3p2_josueham;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JColorChooser;

public class Lab3P2_JosueHam {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("--- Menu del programa ----"
                    + "\n1 -> CRUD Concesionaria"
                    + "\n2 -> CRUD Clientes"
                    + "\n3 -> CRUD Vehículos"
                    + "\n4 -> Compra/Venta de vehiculos por parte de un cliente"
                    + "\n5 -> Salir"
                    + "\nIngrese la opcion que desea: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {

                }//CRUD Concesionaria
                break;

                case 2: {

                }//CRUD Clientes
                break;
                
                case 3: {
                    
                }//CRUD Vehiculos
                break;
                
                case 4: {
                    
                }//Compra/Venta
                break;
                
                default: 
                    System.out.println("...");
            }//Fin switch menu principal 
        } while (opcion != 5);
    }

}
