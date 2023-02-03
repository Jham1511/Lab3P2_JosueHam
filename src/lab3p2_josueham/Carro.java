
package lab3p2_josueham;


public class Carro extends Vehiculo {
private int CantPuertas, velMax;
private String descMotor;

    public Carro() {
        super();
    }

    public Carro(int CantPuertas, int velMax, String descMotor, String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        super(color, marca, modelo, anio, precio, CantLlantas);
        this.CantPuertas = CantPuertas;
        this.velMax = velMax;
        this.descMotor = descMotor;
    }

    public int getCantPuertas() {
        return CantPuertas;
    }

    public void setCantPuertas(int CantPuertas) {
        this.CantPuertas = CantPuertas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public String getDescMotor() {
        return descMotor;
    }

    public void setDescMotor(String descMotor) {
        this.descMotor = descMotor;
    }

    @Override
    public String toString() {
        return "Carro" 
                + "\nCantida de Puertas: " + CantPuertas 
                + "\nVelocida Max: " + velMax 
                + "\nDescripcion del Motor: " + descMotor;
    }

    


}