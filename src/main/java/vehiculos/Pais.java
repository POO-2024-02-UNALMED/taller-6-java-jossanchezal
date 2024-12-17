package vehiculos;

import java.util.ArrayList;

public class Pais {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static Pais paisMasVendedor() {
        int ganador = 0;
        Pais paisGanador = null;

        ArrayList<Fabricante> listaCantidadFabricantes = new ArrayList<>();

        for (Fabricante e : Vehiculo.listaFabricantes) {
            if (!listaCantidadFabricantes.contains(e)) {
                listaCantidadFabricantes.add(e);
            }
        }

        for (Fabricante e : listaCantidadFabricantes) {
            if (e.listaVehiculos.size() > ganador) {
                ganador = e.listaVehiculos.size();
                paisGanador = e.getPais();
            }
        }

        return paisGanador;
    }
}
