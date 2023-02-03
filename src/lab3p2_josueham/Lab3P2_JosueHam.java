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
                            System.out.println("Concesionaria modificada exitosamente");
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

                    switch (resp) {
                        case 1: {
                            System.out.println("Ingrese el nombre del cliente: ");
                            String nombre = leer.next();

                            int id = 1 + clientes.size();

                            System.out.println("Ingrese el saldo del cliente");
                            double sal = leer.nextDouble();

                            clientes.add(new Cliente(nombre, id, sal));
                            System.out.println("Cliente agregado exitosamente");
                        }//Agregar Clientes 
                        break;

                        case 2: {
                            System.out.println(listarClientes());
                            System.out.println("Ingrese el cliente que desea eliminar: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= clientes.size()) {
                                if (clientes.get(pos) instanceof Cliente) {
                                    clientes.remove(pos);
                                } else {
                                    System.out.println("\nEl indice ingresado no es un cliente.\n");
                                }
                            } else {
                                System.out.println("\nIndice invalido.\n");
                            }
                            System.out.println("Cliente eliminado exitosamente");
                        }//Eliminar Clientes
                        break;

                        default:
                            System.out.println("Regresando...");
                    }//Fin switch CRUD Clientes
                }//CRUD Clientes
                break;

                case 3: {
                    System.out.println("--- Menu del programa ----"
                            + "\n1 -> Agregar Vehiculos"
                            + "\n2 -> Modificar Vehiculos"
                            + "\n3 -> Eliminar Vehiculos"
                            + "\n4 -> Menu Principal"
                            + "\nIngrese la opcion que desea: ");
                    int resp = leer.nextInt();

                    switch (resp) {
                        case 1: {
                            System.out.println("Ingrese el indice de la concesionaria: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {

                                    System.out.println("Ingrese la marca del vehiculo: ");
                                    String marca = leer.next();

                                    System.out.println("Ingrese el modelo del vehiculo: ");
                                    String modelo = leer.next();

                                    System.out.println("Ingrese el año de fabricacion");
                                    String anio = leer.next();

                                    System.out.println("Ingrese el color del vehiculo: ");
                                    String color = leer.next();

                                    System.out.println("Ingrese el precio del vehiculo");
                                    double precio = leer.nextDouble();

                                    System.out.println("Ingrese la cantidad de llantas: ");
                                    int cantLlant = leer.nextInt();

                                    if (cantLlant == 4) {
                                        System.out.println("--- Menu del programa ----"
                                                + "\n1 -> Agregar Carro"
                                                + "\n2 -> Agregar Camión de Carga"
                                                + "\n3 -> Agregar Bus"
                                                + "\n4 -> Menu Anterior"
                                                + "\nIngrese la opcion que desea: ");
                                        int ans = leer.nextInt();
                                        switch (ans) {
                                            case 1: {
                                                System.out.println("Ingrese la cantidad de puertas: ");
                                                int cantPuertas = leer.nextInt();

                                                System.out.println("Ingrese la velocidad maxima: ");
                                                int velMax = leer.nextInt();

                                                leer.nextLine();
                                                System.out.println("Ingrese la descripcion del motor: ");
                                                String descMotor = leer.next();

                                                vehiculos.add(new Carro(cantPuertas, velMax, descMotor, color, marca, modelo, anio, precio, cantLlant));
                                                concesionarias.get(pos).setVehiculos(vehiculos);
                                                System.out.println("Carro agregado correctamente");
                                            }//Agregar Carro
                                            break;

                                            case 2: {
                                                System.out.println("Ingrese el volumen maximo de carga: ");
                                                int volMax = leer.nextInt();

                                                System.out.println("Ingrese la altura del camion de carga: ");
                                                int altura = leer.nextInt();

                                                boolean contiene = false;
                                                System.out.println("¿Tiene retroexcavadora?"
                                                        + "\n1 -> SI"
                                                        + "\n2 -> NO"
                                                        + "\nIngrese su opcion: ");
                                                int resposta = leer.nextInt();
                                                if (resposta == 1) {
                                                    contiene = true;
                                                } else if (resposta == 2) {
                                                    contiene = false;
                                                }//Fin else para saber si tiene retroexcavadora

                                                vehiculos.add(new CamionCarga(volMax, altura, contiene, color, marca, modelo, anio, precio, cantLlant));
                                                concesionarias.get(pos).setVehiculos(vehiculos);
                                                System.out.println("Camion de Carga agregado correctamente");
                                            }//Agregar Camion de Carga
                                            break;

                                            case 3: {
                                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                                int cantPasaj = leer.nextInt();

                                                vehiculos.add(new Bus(cantPasaj, color, marca, modelo, anio, precio, cantLlant));
                                                concesionarias.get(pos).setVehiculos(vehiculos);
                                                System.out.println("Bus agregado correctamente");
                                            }//Agregar Bus
                                            break;

                                            default:
                                                System.out.println("Regresando...");
                                        }//Fin switch 4 llantas
                                    } else if (cantLlant == 2) {
                                        System.out.println("--- Menu del programa ----"
                                                + "\n1 -> Agregar Motocicleta"
                                                + "\n2 -> Agregar Bicicleta"
                                                + "\n3 -> Menu Anterior"
                                                + "\nIngrese la opcion que desea: ");
                                        int ans = leer.nextInt();

                                        switch (ans) {
                                            case 1: {
                                                leer.nextLine();
                                                System.out.println("Ingrese la descripcion del Motor: ");
                                                String descMotor = leer.next();

                                                System.out.println("¿Es electrica?"
                                                        + "\n1 -> SI"
                                                        + "\n2 -> NO"
                                                        + "\nIngrese la opcion que desea: ");
                                                int respo = leer.nextInt();

                                                boolean elec = false;
                                                if (respo == 1) {
                                                    elec = true;
                                                } else if (respo == 2) {
                                                    elec = false;
                                                }//Fin else para saber si es electrica

                                                vehiculos.add(new Motocicleta(descMotor, elec, marca, modelo, anio, color, precio, cantLlant));
                                                concesionarias.get(pos).setVehiculos(vehiculos);
                                                System.out.println("Motocicleta agregada correctamente");
                                            }//Agregar Motocicleta
                                            break;

                                            case 2: {
                                                leer.nextLine();
                                                System.out.println("Ingrese la descripcion: ");
                                                String desp = leer.next();

                                                System.out.println("Ingrese el tipo de bicicleta: "
                                                        + "\n1 -> BMX"
                                                        + "\n2 -> De Calle"
                                                        + "\n -> Seleccione el tipo: ");
                                                int answ = leer.nextInt();
                                                String type = null;
                                                if (answ == 1) {
                                                    type = "BMX";
                                                } else if (answ == 2) {
                                                    type = "De Calle";
                                                }//Fin else para saber el tipo

                                                System.out.println("Ingrese el radio de la rueda: ");
                                                int radio = leer.nextInt();

                                                vehiculos.add(new Bicicleta(desp, type, radio, color, marca, modelo, anio, precio, cantLlant));
                                                concesionarias.get(pos).setVehiculos(vehiculos);
                                                System.out.println("Bicicleta agregada correctamente");
                                            }//Agregar Bicicleta
                                            break;

                                            default:
                                                System.out.println("Regresando...");
                                        }//
                                    } else {
                                        System.out.println("Los vehiculos solo pueden tener 2 o 4 llantas");
                                    }

                                } else {
                                    System.out.println("No se pueden crear vehiculos sin concesionarias");
                                }
                            }

                        }//Agregar Vehiculos
                        break;

                        case 2: {

                        }//Modificar Vehiculos
                        break;

                        case 3: {
                            System.out.println(listarVehiculos());
                            System.out.println("Ingrese la posicion que desea eliminar: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= vehiculos.size()) {
                                if (vehiculos.get(pos) instanceof Vehiculo) {
                                    vehiculos.remove(pos);
                                } else {
                                    System.out.println("\nEl indice ingresado no es valido.\n");
                                }
                            } 
                            System.out.println("Nave eliminado exitosamente");
                        }//Eliminar Vehiculo
                        break;

                        default:
                            System.out.println("Regresando...");
                    }//Fin switch CRUD Vehiculos

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

    public static String listarClientes() {

        String cadena = "";
        for (Object o : clientes) {
            if (o instanceof Cliente) {
                cadena += clientes.indexOf(o) + "- " + o + "\n";
            }
        }
        return cadena;

    }//Fin metodo listar

    public static String listarVehiculos() {

        String cadena = "";
        for (Object o : vehiculos) {
            if (o instanceof Vehiculo) {
                cadena += vehiculos.indexOf(o) + "- " + o + "\n";
            }
        }
        return cadena;

    }//Fin metodo listar
}//Fin de la clase
