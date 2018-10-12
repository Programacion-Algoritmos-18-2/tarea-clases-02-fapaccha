package final_clase_2;
/**
 * @author user
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primer objeto sin parámetros, que agregue valores por defecto
        Equipo e = new Equipo();
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s", e.obtenerNombre(), e.obtenerJug(), e.obtenerCiudad());
        //Segundo objeto recibe un parámetro para asignar valor a nombre
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregarJug(20);
        e2.agregarCiudad("Loja");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e2.obtenerNombre(), e2.obtenerJug(), e2.obtenerCiudad());
        //Tercer objeto recibe dos parámetros para asignar valores a nombre y numero de jugadores
        Equipo e3 = new Equipo("Liga de portoviejo ",20);
        e2.agregarCiudad("Guayaquil");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e3.obtenerNombre(), e3.obtenerJug(), e3.obtenerCiudad());
        //Cuarto objeto recibe tres parámetros para asignar valores a nombre, numero de jugadores y ciudad
        Equipo e4 = new Equipo("Aucas",20,"Quito");
        System.out.printf("\nNombre %s - Jugadores %s - Ciudad %s", e4.obtenerNombre(), e4.obtenerJug(), e4.obtenerCiudad());
        
    }
    
}
