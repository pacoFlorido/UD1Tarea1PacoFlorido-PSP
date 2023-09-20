import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("ping", "-c20", "192.168.18.12" );
        try {
            Process p = pb.start();
            while (p.isAlive()){
                System.out.println("Proceso en ejecución.");
                Thread.sleep(3000);
            }
        } catch (IOException e) {
            System.out.println("Error, comando no encontrado");
            System.exit(1);
        } catch (InterruptedException e) {
            System.exit(2);
        }
        System.out.println("Fin del proceso.");

    }
}
