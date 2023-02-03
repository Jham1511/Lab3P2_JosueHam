/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josueham;

import java.util.ArrayList;


public class Cliente {
    private  String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private double id ,saldo;

    public Cliente() {
    }

    public Cliente(String nombre, int id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente" 
                + "\nID: " + id 
                + "\nNombre: " + nombre 
                + "\nVehiculos: " + vehiculos 
                + "\nSaldo: " + saldo;
    }
    
    
}
