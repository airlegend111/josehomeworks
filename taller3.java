import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * calculoNotas
 */
public class taller3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // Se inicia el scanner

        System.out.println("porfavor ingrese la cantidad de materias"); // Le pide la usuario la cantiadad 
        int cantidad = scanner.nextInt();

        double[][] materias = new double[cantidad][];   // Aqui empieza la Matriz tomando los valores de la cantiadad de materias dadas
        double[] notaFinal = new double[Array.getLength(materias)]; 
        String[] nombreAreas = new String[Array.getLength(materias)];
        //se crean 2 arraigos = a la cantidad de materias, el de las notas finales y el de los nombre la materia de cada una

        for (int n = 0; Array.getLength(materias) > n; n++) { 
                                                                    
            System.out.println("ingrese el nombre de la materia");
            nombreAreas[n] = scanner.next();

            System.out.println("ingrese cantidad de notas de " + nombreAreas[n]);
            int size = scanner.nextInt();

            double[] notas = new double[size];
            double[] porcentajes = new double[Array.getLength(notas)];
            //ciclo 1 hace: Pide al usuario el nombre de la materia y la cantidad de notas a operar (en minusculas la materia)

            for (int i = 0; Array.getLength(notas) > i; i++) {  
                System.out.println("ingrese nota numero " + (i + 1) + " de " + nombreAreas[n]);
                notas[i] = scanner.nextDouble();
                System.out.println("ingrese el porcentaje de la nota numero " + (i + 1) + " de " + nombreAreas[n]);
                porcentajes[i] = scanner.nextDouble();
                //ciclo 2 hace: Pide las notas y su porcentaje al usuario dependiendo la cantidad de notas que dijimos en el ciclo 1  por cada materia

            }

            for (int i = 0; Array.getLength(notas) > i; i++) {  
                notaFinal[i] = notaFinal[i] + (notas[i] * (porcentajes[i] / 100));
                
                //ciclo 3 hace el calculo de promedio de cada materia
            }

        }

        for (int n = 0; Array.getLength(notaFinal) > n; n++) {  

            System.out.println("la nota de la materia " + nombreAreas[n] + " es " + notaFinal[n]);
            //ciclo 4 imprime el promedio deg cada materia

        }

        scanner.close();

    }

}