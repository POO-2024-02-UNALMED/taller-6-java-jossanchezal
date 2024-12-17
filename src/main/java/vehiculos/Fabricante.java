package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    private String nombre;
    private Pais pais;
    public ArrayList<Vehiculo> listaVehiculos;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.listaVehiculos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int ganador = 0;
        Fabricante fabricanteGanador = null;

        ArrayList<Fabricante> listaCantidadFabricantes = new ArrayList<>();

        for (Fabricante e : Vehiculo.listaFabricantes) {
            if (!listaCantidadFabricantes.contains(e)) {
                listaCantidadFabricantes.add(e);
            }
        }

        for (Fabricante e : listaCantidadFabricantes) {
            if (e.listaVehiculos.size() > ganador) {
                ganador = e.listaVehiculos.size();
                fabricanteGanador = e;
            }
        }

        return fabricanteGanador;
    }
}
