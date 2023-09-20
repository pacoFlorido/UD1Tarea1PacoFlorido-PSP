import java.io.IOException;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("The command to be executed is mandatory");
            System.exit(1);
        }
        ProcessBuilder pb = new ProcessBuilder(args);
        pb.inheritIO();
        try {
            Process p = pb.start();
            int codRet = p.waitFor();
            System.out.println("The execution command" + Arrays.toString(args) + " has generate the code " + ((codRet==0)? "success" : " with errors"));
        } catch (IOException e) {
            System.err.println("Error runing the process");
            e.printStackTrace();
            System.exit(2);
        } catch (InterruptedException e) {
            System.err.println("Interrupted process");
            System.exit(3);
        }
    }
}
