package recuperatorioparcial1;

import java.util.ArrayList;
import java.util.List;


public class SistemaGestionDeExpediciones {
    private List<Nave> listaNaves;

    public SistemaGestionDeExpediciones() {
        this.listaNaves = new ArrayList<>();
    }

    public void agregarNave(Nave nave) throws NaveDuplicadaException {
        for (Nave n : listaNaves) {
            if (n.getNombre().equals(nave.getNombre()) && n.getAnioLanzamiento() == nave.getAnioLanzamiento()) {
                throw new NaveDuplicadaException(nave.getNombre(), nave.getAnioLanzamiento());
            }
        }
        listaNaves.add(nave);
    }

    public void mostrarNaves() {
        for (Nave nave : listaNaves) {
            nave.mostrarDetalles();
        }
    }

    public void iniciarExploracion() {
        for (Nave nave : listaNaves) {
            if (nave instanceof Explorable) {
                ((Explorable) nave).explorar();
            } else {
                System.out.println(nave.getNombre() + " es un crucero estelar y no puede iniciar misiones de exploracion.");
            }
        }
    }
    
}
