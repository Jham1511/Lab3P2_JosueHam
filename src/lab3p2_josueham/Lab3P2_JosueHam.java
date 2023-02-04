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
                            System.out.println(listarConce());
                            System.out.println("Ingrese la posicion que desea eliminar: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {
                                    for (int i = 0; i < concesionarias.get(pos).getVehiculos().size(); i++) {
                                        System.out.println(i + ".- " + concesionarias.get(pos).getClientes().get(i));
                                    }
                                    System.out.println("Ingrese el indice del vehiculo a eliminar: ");
                                    int pos2 = leer.nextInt();
                                    concesionarias.get(pos).getClientes().remove(pos2);
                                } else {
                                    System.out.println("\nEl indice ingresado no es valido.\n");
                                }
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
                                                concesionarias.get(pos).getVehiculos().add(new Carro(cantPuertas, velMax, descMotor, color, marca, modelo, anio, precio, cantLlant));
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
                                                concesionarias.get(pos).getVehiculos().add(new CamionCarga(volMax, altura, contiene, color, marca, modelo, anio, precio, cantLlant));
                                                System.out.println("Camion de Carga agregado correctamente");
                                            }//Agregar Camion de Carga
                                            break;

                                            case 3: {
                                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                                int cantPasaj = leer.nextInt();

                                                vehiculos.add(new Bus(cantPasaj, color, marca, modelo, anio, precio, cantLlant));
                                                concesionarias.get(pos).getVehiculos().add(new Bus(cantPasaj, color, marca, modelo, anio, precio, cantLlant));
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
                                                concesionarias.get(pos).getVehiculos().add(new Motocicleta(descMotor, elec, marca, modelo, anio, color, precio, cantLlant));
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
                                                concesionarias.get(pos).getVehiculos().add(new Bicicleta(desp, type, radio, color, marca, modelo, anio, precio, cantLlant));
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
                            System.out.println(listarConce());
                            System.out.println("Ingrese la posicion que desea modificar: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {
                                    for (int i = 0; i < concesionarias.get(pos).getVehiculos().size(); i++) {
                                        System.out.println(i + ".- " + concesionarias.get(pos).getVehiculos().get(i));
                                    }
                                    System.out.println("Ingrese el indice de vehiculo a modificar: ");
                                    int pos2 = leer.nextInt();
                                    int opResp = 0;

                                    if (concesionarias.get(pos).getVehiculos().get(pos2) instanceof Carro) {
                                        opResp = 1;
                                    }
                                    if (concesionarias.get(pos).getVehiculos().get(pos2) instanceof CamionCarga) {
                                        opResp = 2;
                                    }

                                    if (concesionarias.get(pos).getVehiculos().get(pos2) instanceof Bus) {
                                        opResp = 3;
                                    }
                                    if (concesionarias.get(pos).getVehiculos().get(pos2) instanceof Motocicleta) {
                                        opResp = 4;
                                    }
                                    if (concesionarias.get(pos).getVehiculos().get(pos2) instanceof Bicicleta) {
                                        opResp = 5;
                                    }

                                    switch (opResp) {
                                        case 1: {
                                            System.out.println("Modificar carro"
                                                    + "\n1 -> Modificar Cantidad de Puertas"
                                                    + "\n2 -> Modificar Velocidad Maxima"
                                                    + "\n3 -> Modificar Descripcion del motor"
                                                    + "\n4 -> Regresar"
                                                    + "\nIngrese la posicion que desea: ");
                                            int ap = leer.nextInt();

                                            switch (ap) {
                                                case 1: {
                                                    System.out.println("Ingrese la nueva cantidad de puertas: ");
                                                    int nuePuertas = leer.nextInt();

                                                    ((Carro) concesionarias.get(pos).getVehiculos().get(pos2)).setCantPuertas(nuePuertas);
                                                }//Puertas
                                                break;

                                                case 2: {
                                                    System.out.println("Ingrese la nueva velocidad maxima: ");
                                                    int nueVel = leer.nextInt();

                                                    ((Carro) concesionarias.get(pos).getVehiculos().get(pos2)).setVelMax(nueVel);
                                                }//Velocidad
                                                break;

                                                case 3: {
                                                    leer.nextLine();
                                                    System.out.println("Ingrese la nueva descripcion del carro: ");
                                                    String nueDesp = leer.next();

                                                    ((Carro) concesionarias.get(pos).getVehiculos().get(pos2)).setDescMotor(nueDesp);
                                                }//Descripcion
                                                break;

                                                default:
                                                    System.out.println("Regresando...");
                                            }//
                                        }//Carro
                                        break;

                                        case 2: {
                                            System.out.println("Modificar camion"
                                                    + "\n1 -> Modificar Volumen Maximo"
                                                    + "\n2 -> Modificar Altura"
                                                    + "\n3 -> Modificar Retroexcavadora"
                                                    + "\n4 -> Regresar"
                                                    + "\nIngrese la posicion que desea: ");
                                            int ap = leer.nextInt();

                                            switch (ap) {
                                                case 1: {
                                                    System.out.println("Ingrese el nuevo volumen maximo: ");
                                                    int nueVol = leer.nextInt();

                                                    ((CamionCarga) concesionarias.get(pos).getVehiculos().get(pos2)).setVolMax(nueVol);
                                                }//
                                                break;

                                                case 2: {
                                                    System.out.println("Ingrese la nueva altura: ");
                                                    int alt = leer.nextInt();

                                                    ((CamionCarga) concesionarias.get(pos).getVehiculos().get(pos2)).setAltura(alt);
                                                }//
                                                break;

                                                case 3: {
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

                                                    ((CamionCarga) concesionarias.get(pos).getVehiculos().get(pos2)).setRetroEx(contiene);

                                                }
                                                break;

                                                default:
                                                    System.out.println("...");
                                            }//Switch
                                        }//Camion
                                        break;

                                        case 3: {
                                            System.out.println("Modificar Bus"
                                                    + "\n1 -> Modificar Cantidad de pasajeros"
                                                    + "\n2 -> Regresar"
                                                    + "\nIngrese la posicion que desea: ");
                                            int ap = leer.nextInt();

                                            switch (ap) {
                                                case 1: {
                                                    System.out.println("Ingrese la cantidad de pasajeros: ");
                                                    int cantPasaj = leer.nextInt();

                                                    ((Bus) concesionarias.get(pos).getVehiculos().get(pos2)).setCantPasajeros(cantPasaj);
                                                }//Cantidad de pasajeros
                                                break;
                                                default:
                                                    System.out.println("...");
                                            }//Switch
                                        }//Bus
                                        break;

                                        case 4: {
                                            System.out.println("Modificar Motocicleta"
                                                    + "\n1 -> Modificar Descripcion del Motor"
                                                    + "\n2 -> Modificar si es electrica"
                                                    + "\n3 -> Regresar"
                                                    + "\nIngrese la posicion que desea: ");
                                            int ap = leer.nextInt();

                                            switch (ap) {
                                                case 1: {
                                                    leer.nextLine();
                                                    System.out.println("Ingrese la nueva descripcion del motor: ");
                                                    String desc = leer.next();

                                                    ((Motocicleta) concesionarias.get(pos).getVehiculos().get(pos2)).setDespMotor(desc);

                                                }//
                                                break;

                                                case 2: {
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

                                                    ((Motocicleta) concesionarias.get(pos).getVehiculos().get(pos2)).setElectrica(elec);

                                                }//
                                                break;
                                            }//Fin switch 
                                        }//Motocicleta
                                        break;

                                        case 5: {
                                            System.out.println("Modificar Bicicleta"
                                                    + "\n1 -> Modificar Descripcion del Motor"
                                                    + "\n2 -> Modificar Tipo"
                                                    + "\n3 -> Modificar Radio"
                                                    + "\n4 -> Regresar"
                                                    + "\nIngrese la posicion que desea: ");
                                            int ap = leer.nextInt();

                                            switch (ap) {
                                                case 1: {
                                                    leer.nextLine();
                                                    System.out.println("Ingrese la nueva descripcion del motor: ");
                                                    String desc = leer.next();

                                                    ((Bicicleta) concesionarias.get(pos).getVehiculos().get(pos2)).setDesc(desc);
                                                }//
                                                break;
                                                case 2: {
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

                                                    ((Bicicleta) concesionarias.get(pos).getVehiculos().get(pos2)).setTipo(type);

                                                }//
                                                break;

                                                case 3: {
                                                    System.out.println("Ingrese el nuevo radio: ");
                                                    int radio = leer.nextInt();

                                                    ((Bicicleta) concesionarias.get(pos).getVehiculos().get(pos2)).setRadio(radio);

                                                }//
                                                break;

                                                default:
                                                    System.out.println("...");
                                            }//Switch

                                        }//Bicicleta
                                        break;

                                        default:
                                            System.out.println("...");
                                    }//Fin switch
                                } else {
                                    System.out.println("\nEl indice ingresado no es valido.\n");
                                }
                            }
                            System.out.println("Vehiculo eliminado exitosamente");

                        }//Modificar Vehiculos
                        break;

                        case 3: {
                            System.out.println(listarConce());
                            System.out.println("Ingrese la posicion que desea eliminar: ");
                            int pos = leer.nextInt();

                            if (pos >= 0 && pos <= concesionarias.size()) {
                                if (concesionarias.get(pos) instanceof Concesionaria) {
                                    for (int i = 0; i < concesionarias.get(pos).getVehiculos().size(); i++) {
                                        System.out.println(i + ".- " + concesionarias.get(pos).getVehiculos().get(i));
                                    }
                                    System.out.println("Ingrese el indice de vehiculo a eliminar: ");
                                    int pos2 = leer.nextInt();
                                    concesionarias.get(pos).getVehiculos().remove(pos2);
                                } else {
                                    System.out.println("\nEl indice ingresado no es valido.\n");
                                }
                            }
                            System.out.println("Vehiculo eliminado exitosamente");
                        }//Eliminar Vehiculo
                        break;

                        default:
                            System.out.println("Regresando...");
                    }//Fin switch CRUD Vehiculos

                }//CRUD Vehiculos
                break;

                case 4: {
                    System.out.println("Compra/Venta"
                            + "\n1 -> Comprar"
                            + "\n2 -> Vender");
                    int respuesta = leer.nextInt();

                    switch (respuesta) {
                        case 1: {
                            System.out.println(listarConce());

                            System.out.println("Ingrese el indice de la concesionaria: ");
                            int pos = leer.nextInt();
                            for (int i = 0; i < concesionarias.size(); i++) {
                                System.out.println(i + ".- " + concesionarias.get(pos).getVehiculos().get(i));
                            }

                        }
                        break;

                        case 2: {
                            System.out.println(listarClientes());
                            System.out.println("Ingrese el indice del cliente: ");
                            int pos = leer.nextInt();
                            for (int i = 0; i < clientes.size(); i++) {
                                System.out.println(i + ".- " + clientes.get(pos).getVehiculos().get(i));
                            }
                        }//
                        default:

                    }
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
