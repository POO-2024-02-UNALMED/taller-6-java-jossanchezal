package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {

    private int puestos;
    public static ArrayList<Automovil> listaAutomovil = new ArrayList<>();

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.listaAutomovil.add(this);
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public int getPuestos() {
        return this.puestos;
    }
}
