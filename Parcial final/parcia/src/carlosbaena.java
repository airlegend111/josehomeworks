import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class carlosbaena {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] diaSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        String[][] lunesdata, martesdata, miercolesdata, juevesdata, viernesdata, sabadodata,
                domingodata = new String[7][100];

        for (int i = 0; i < 7; i++) {
          String dia = diaSemana[i];
          String archivo = "C:\\Users\\ASUS\\Desktop\\Parcial final\\parcia\\" + dia + ".txt";

            try {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea = "id;monto;emisor;receptor;hora";
                linea.split(";");
                System.out.println("---- " + i + " ----");
                System.out.println("id\tmonto\temisor\treceptor\thora");
                int a=0;
          while ((linea = br.readLine()) != null) {
    (lunesdata, martesdata, miercolesdata, juevesdata, viernesdata, sabadodata, domingodata)[i][a] = linea;
    a++;
}
br.close();

            } catch (Exception e) {
                System.out.println("Error al leer el archivo de " + dia + ": " + e.getMessage());
            }
            } finally {

    }

}
    }
