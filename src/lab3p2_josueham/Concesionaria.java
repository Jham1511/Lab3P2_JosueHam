package lab3p2_josueham;

import java.util.*;

public class Concesionaria {
    private String nombre, direccion;
    private int ID;
    private double saldo;
    private ArrayList <Cliente> clientes = new ArrayList();private ArrayList <Vehiculo> vehiculos = new ArrayList();

    public Concesionaria(String nombre, String direccion, int ID, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ID = ID;
        this.saldo = saldo;
    }

    public Concesionaria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Concesionaria" 
                + "\nNombre: " + nombre 
                + "\nDireccion: " + direccion 
                + "\nID: " + ID 
                + "\nSaldo: " + saldo 
                + "\nClientes: " + clientes 
                + "\nVehiculos=" + vehiculos;
    }

    
}