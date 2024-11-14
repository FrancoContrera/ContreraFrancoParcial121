package recuperatorioparcial1;


public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Crucero Estelar: " + nombre +
                ", Capacidad de Tripulacion: " + capacidadTripulacion +
                ", Anio de Lanzamiento: " + anioLanzamiento +
                ", Capacidad de Pasajeros: " + cantidadPasajeros);
    }
    
}
