
package recuperatorioparcial1;


public class Main {
    public static void main(String[] args) {
        SistemaGestionDeExpediciones sistema = new SistemaGestionDeExpediciones();

        try {
            Nave carguero1 = new Carguero("Galactica", 8, 2001, 300);
            sistema.agregarNave(carguero1);

            Nave cargueroDuplicado = new Carguero("Galactica", 8, 2001, 400);
            sistema.agregarNave(cargueroDuplicado);

        } catch (NaveDuplicadaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Nave exploracion1 = new NaveExploracion("OdiseaEspacio", 5, 2001, TipoMision.INVESTIGACION);
            Nave crucero1 = new CruceroEstelar("Tardini", 100, 3200, 1200);
            sistema.agregarNave(exploracion1);
            sistema.agregarNave(crucero1);
        } catch (NaveDuplicadaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nListado de naves:");
        sistema.mostrarNaves();

        System.out.println("\nIniciando exploracion:");
        sistema.iniciarExploracion();
    }
}