package lab3p2_josueham;


public class Motocicleta extends Vehiculo {
    private String despMotor;
    private boolean electrica;
    
    public Motocicleta() {
        super();
    }

    public Motocicleta(String despMotor, boolean electrica, String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        super(color, marca, modelo, anio, precio, CantLlantas);
        this.despMotor = despMotor;
        this.electrica = electrica;
    }

    public String getDespMotor() {
        return despMotor;
    }

    public void setDespMotor(String despMotor) {
        this.despMotor = despMotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Motocicleta" 
                + "\nDescripcion del Motor: " + despMotor 
                + "\nElectrica: " + electrica;
    }
    
    
}
