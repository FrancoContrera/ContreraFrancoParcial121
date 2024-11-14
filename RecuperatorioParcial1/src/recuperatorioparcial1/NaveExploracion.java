package recuperatorioparcial1;


public class NaveExploracion extends Nave implements Explorable{
    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    public TipoMision getTipoMision() {
        return tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println(nombre + " esta iniciando la mision de " + tipoMision + ".");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nave de Exploracion: " + nombre +
                ", Capacidad de Tripulacion: " + capacidadTripulacion +
                ", Anio de Lanzamiento: " + anioLanzamiento +
                ", Tipo de Mision: " + tipoMision);
    }
    
}
