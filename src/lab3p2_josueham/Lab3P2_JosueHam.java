package lab3p2_josueham;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JColorChooser;

public class Lab3P2_JosueHam {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Concesionaria> concesionarias = new ArrayList();
    static ArrayList<Cliente> clientes = new ArrayList();
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

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
                    System.out.println("--- Menu del programa ----"
                            + "\n1 -> Agregar Concesionaria"
                            + "\n2 -> Modificar Concesionaria"
                            + "\n3 -> Eliminar Concesionaria"
                            + "\n4 -> Menu Principal"
                            + "\nIngrese la opcion que desea: ");
                    int resp = leer.nextInt();

                    switch (resp) {
                        case 1: {
                            System.out.println("Ingrese el nombre de la concesionaria: ");
                            String nombre = leer.next();

                            System.out.println("Ingrese la direccion de la concesionaria: ");
                            String direc = leer.next();

                            int id = 1 + concesionarias.size();

                            System.out.println("Ingrese el saldo de la concesionaria: ");
                            double saldo = leer.nextDouble();

                            concesionarias.add(new Concesionaria(nombre, direc, id, saldo));
                            System.out.println("Concesionaria agregada exitosamente");
                        }//Agregar Concesionaria
                        break;

                        case 2: {
                            System.out.println(listarConce());
                            System.out.println("Ingrese la concesionaria que desea modificar la direccion: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {
                                    System.out.println("Ingrese la nueva direccion: ");
                                    String nueDirec = leer.next();
                                    
                                    concesionarias.get(pos).setDireccion(nueDirec);
                                } else {
                                    System.out.println("\nEl indice ingresado no es una concesionaria.\n");
                                }
                            } else {
                                System.out.println("\nIndice invalido.\n");
                            }
                            System.out.println("Concesionaria eliminada exitosamente");
                        }//Modificar Concesionaria
                        break;

                        case 3: {
                            System.out.println(listarConce());
                            System.out.println("Ingrese la concesionaria que desea modificar la direccion: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {
                                    concesionarias.remove(pos);
                                } else {
                                    System.out.println("\nEl indice ingresado no es una concesionaria.\n");
                                }
                            } else {
                                System.out.println("\nIndice invalido.\n");
                            }
                            System.out.println("Concesionaria eliminada exitosamente");
                        }//Eliminar Concesionaria
                        default:
                            System.out.println("Regresando...");
                    }//Fin del switch del crud 
                }//CRUD Concesionaria
                break;

                case 2: {
                    System.out.println("--- Menu del programa ----"
                            + "\n1 -> Agregar Clientes"
                            + "\n2 -> Eliminar Clientes"
                            + "\n3 -> Menu Principal"
                            + "\nIngrese la opcion que desea: ");
                    int resp = leer.nextInt();
                    
                    switch(resp) {
                        
                    }//Fin switch CRUD Clientes
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
    }//Fin del main 

    public static String listarConce() {

        String cadena = "";
        for (Object o : concesionarias) {
            if (o instanceof Concesionaria) {
                cadena += concesionarias.indexOf(o) + "- " + o + "\n";
            }
        }
        return cadena;

    }//Fin metodo listar
}//Fin de la clase
