package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {

    private boolean volco;
    public static ArrayList<Camioneta> listaCamioneta = new ArrayList<>();

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.listaCamioneta.add(this);
    }

    public void setVolco(Boolean volco) {
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }
}
