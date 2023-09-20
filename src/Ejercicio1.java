import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {

            Process p = Runtime.getRuntime().exec(args);
            int cod = p.waitFor();
            System.out.println(cod);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
