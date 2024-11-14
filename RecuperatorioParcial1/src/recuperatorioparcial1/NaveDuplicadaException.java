package recuperatorioparcial1;


public class NaveDuplicadaException extends Exception{
    public NaveDuplicadaException(String nombre, int anioLanzamiento) {
        super("La nave '" + nombre + "' del anio " + anioLanzamiento + " ya esta registrada.");
    }
    
}
