import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.*;

public class carlosbaena {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] diaSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        String[][] lunesdata, martesdata, miercolesdata, juevesdata, viernesdata, sabadodata,
                domingodata = new String[100][5];

        for (int i = 0; i < 100; i++) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                 br = new BufferedReader(new FileReader(diaSemana[i] + ".txt"));
                String linea = "id;monto;emisor;receptor;hora";
                linea.split(";");
                System.out.println("---- " + i + " ----");
                System.out.println("id\tmonto\temisor\treceptor\thora");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea.replace(";", "\t"));
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                    ;
                }
            }
        }
      
    }

}
