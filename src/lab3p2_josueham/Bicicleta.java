package lab3p2_josueham;


public class Bicicleta  extends Vehiculo {
   private String desc, tipo;
   private int radio;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String desc, String tipo, int radio, String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        super(color, marca, modelo, anio, precio, CantLlantas);
        this.desc = desc;
        this.tipo = tipo;
        this.radio = radio;
    }

    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
   
   
}
