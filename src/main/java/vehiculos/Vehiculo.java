package vehiculos;

import java.util.ArrayList;

public class Vehiculo {

    static int CantidadVehiculos;
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private String traccion;
    private int peso;
    private Fabricante fabricante;
    public static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        CantidadVehiculos += 1;
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.listaFabricantes.add(fabricante);
        this.fabricante.listaVehiculos.add(this);
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTraccion() {
        return traccion;
    }

    public int getPeso() {
        return peso;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static void setCantidadVehiculos(int numero) {
        Vehiculo.CantidadVehiculos = numero;
    }

    public static int getCantidadVehiculos() {
        return Vehiculo.CantidadVehiculos;
    }

    public static String vehiculosPorTipo() {
        int cantidadCamioneta = Camioneta.listaCamioneta.size();
        int cantidadCamion = Camion.listaCamion.size();
        int cantidadAutomovil = Automovil.listaAutomovil.size();
        return String.format("Automoviles: %d \nCamionetas: %d \nCamiones: %d", cantidadAutomovil, cantidadCamioneta, cantidadCamion);
    }
}
