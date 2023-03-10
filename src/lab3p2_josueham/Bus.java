
package lab3p2_josueham;


public class Bus extends Vehiculo {
    private int CantPasajeros;
    private String tipo;
    
    
    public Bus() {
        super();
    }

    public Bus(int CantPasajeros, String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        super(color, marca, modelo, anio, precio, CantLlantas);
        this.CantPasajeros = CantPasajeros;
        if(CantPasajeros <= 50){
            this.tipo = "Rapidito";
        } else {
            this.tipo = "De Ruta";
        }
        
    }

    public int getCantPasajeros() {
        return CantPasajeros;
    }

    public void setCantPasajeros(int CantPasajeros) {
        this.CantPasajeros = CantPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bus" 
                + "\nCantidad de Pasajeros: " + CantPasajeros 
                + "\nTipo: " + tipo;
    }
    
   
}
