package lab3p2_josueham;


public class CamionCarga extends Vehiculo {
    private int volMax, altura;
    private boolean retroEx;

    public CamionCarga() {
        super();
    }

    public CamionCarga(int volMax, int altura, boolean retroEx, String color, String marca, String modelo, String anio, double precio, int CantLlantas) {
        super(color, marca, modelo, anio, precio, CantLlantas);
        this.volMax = volMax;
        this.altura = altura;
        this.retroEx = retroEx;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroEx() {
        return retroEx;
    }

    public void setRetroEx(boolean retroEx) {
        this.retroEx = retroEx;
    }

    @Override
    public String toString() {
        return "CamionCarga" 
                + "\nVolumen Max: " + volMax + "\nAltura: " + altura + "\nRetroexvadora:" + retroEx;
    }
    
    
}
