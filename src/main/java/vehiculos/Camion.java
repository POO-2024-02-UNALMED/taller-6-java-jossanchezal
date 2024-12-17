package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {

    private int ejes;
    public static ArrayList<Camion> listaCamion = new ArrayList<>();

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.listaCamion.add(this);
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getEjes() {
        return this.ejes;
    }
}
