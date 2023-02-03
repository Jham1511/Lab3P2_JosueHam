package lab3p2_josueham;




public class Vehiculo {
    
    protected String marca, modelo, anio, color;
    protected double precio;
    protected int CantLlantas;

    public Vehiculo(String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.CantLlantas = CantLlantas;
    }

    public Vehiculo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantLlantas() {
        return CantLlantas;
    }

    public void setCantLlantas(int CantLlantas) {
        this.CantLlantas = CantLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculo" 
                + "\nColor: " + color 
                + "\nMarca: " + marca 
                + "\nModelo: " + modelo 
                + "\nAño de fabricación: " + anio 
                + "\nPrecio: " + precio 
                + "\nCantidad de Llantas: " + CantLlantas;
    }

}