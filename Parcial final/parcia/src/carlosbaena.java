import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class carlosbaena {
    public static void laMejorHora(String[][] valor) {
        double maxHorasValor = Double.MIN_VALUE;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < valor[i].length; j++) {
                if (valor[i][j] != null) {
                    String[] parts = valor[i][j].split(";");
                    if (parts.length >= 5) {
                        try {
                            double valorHoras  = Double.parseDouble(parts[4]);
                            if (valorHoras > maxHorasValor) {
                                maxHorasValor = valorHoras;
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
        }

        System.out.println("La hora es: " + maxHorasValor);
    }



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] diaSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        String[][] datos = new String[7][100];

        for (int i = 0; i < 7; i++) {
          String dia = diaSemana[i];
          String archivo = "C:\\Users\\ASUS\\Desktop\\Parcial final\\parcia\\" + dia + ".txt";

            try {
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                int a=0;
            while ((linea = br.readLine()) != null) {
                    datos[i][a] = linea;
                    a++;
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Error al leer el archivo de " + dia + ": " + e.getMessage());
            }
            } 
            while (true) {
                System.out.println("Bienvenido, ¿qué deseas hacer?");
                System.out.println("1. Día de la semana en que más se movió el dinero");
                System.out.println("2. Hora del día en que más se movió el dinero");
                System.out.println("3. Encontrar información por el ID");
                System.out.println("4. Para ver datos");
                System.out.println("5. Salir");
                
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1:
                        double maxValor = Double.MIN_VALUE;
                        String diaMaxValor = "";
    
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < datos[i].length; j++) {
                                if (datos[i][j] != null) {
                                    String[] parts = datos[i][j].split(";");
                                    if (parts.length >= 2) {
                                        double valor = Double.parseDouble(parts[1]);
                                        if (valor > maxValor) {
                                            maxValor = valor;
                                            diaMaxValor = diaSemana[i];
                                        }
                                    }
                                }
                            }
                        }
    
                        if (!diaMaxValor.isEmpty()) {
                            System.out.println("El día de la semana con el mayor valor de transacción es " + diaMaxValor);
                            System.out.println("El valor máximo es: " + maxValor);
                        }
                        break;
                    case 2:
                    laMejorHora(datos);
                    break;
                    
        }
    }
}
}

  