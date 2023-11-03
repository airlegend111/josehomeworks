import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.*;

public class Final {
    public static int Doc
   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Stringc[] diaSemana = {"lunes", "martes"}
        for (int i = 0; i < 7; i ++) {
           archivo = new File("C:\\Users\\ASUS\\Desktop\\Parcial final\\parcia\\lunes.txt"+"C:\\Users\\ASUS\\Desktop\\Parcial final\\parcia\\martes.txt"+"C:\\Users\\ASUS\\Desktop\\Parcial final\\parcia\\miercoles.txt" + ""); 
        try {
            archivo = new File("prueba.txt");
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null){
               System.out.println(linea);
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
                System.out.println(e2.getMessage());;
            }
        }
    }
        
    }
        Scanner.close();
    }

