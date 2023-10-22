import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

public class taller4 {

    static Random random = new Random();

    static String getNombreDeCasa() {
        String[] prefijos = { "la", "una" };
        String[] mid = { "cueva", "casa", "mansión" };
        String[] suf = {
            "de la montaña", "del bosque", "del pantano",
            "del desierto", "de Drácula", "de la bruja", "del vampiro",
        };

        return prefijos[random.nextInt(prefijos.length)] + " " 
             + mid[random.nextInt(mid.length)] + " " 
             + suf[random.nextInt(suf.length)];
    }

    static int getPrice() {
        return random.nextInt(1000000);
    }

    public static void main(String[] args) {
        String[] nombreBarrios = { "Floresta", "Aranjuez", "Manrique", "Carlos E", "Robledo" };
        HashMap<String, Integer> ventas = new HashMap<>();
        HashMap<String, Integer> cantidadVentas = new HashMap<>();
        HashMap<String, Integer> pesos = new HashMap<>();

        // Inicializamos los mapas.
        for (String barrio : nombreBarrios) {
            ventas.put(barrio, 0);
            cantidadVentas.put(barrio, 0);
            pesos.put(barrio, random.nextInt(10) + 1);  // Suponiendo un peso aleatorio entre 1 y 10.
        }

        Scanner scanner = new Scanner(System.in);
        int userEntry;

        System.out.println("¡Hola! Te doy la bienvenida a Tinder House.");
        System.out.println("El juego consiste en hacer match con cada casa que te guste.");
        System.out.println("Presiona 0 para descartar, 1 para comprar y 2 para terminar el juego.");
        do {
            String casa = getNombreDeCasa();
            String barrio = nombreBarrios[random.nextInt(nombreBarrios.length)];
            int precio = getPrice() * pesos.get(barrio);

            System.out.println("------*-------");
            System.out.println(casa);
            System.out.println(barrio);
            System.out.println(precio + " Bolívares");
            System.out.println("------*-------");

            try {
                userEntry = Integer.parseInt(scanner.nextLine());

                if (userEntry == 1) {
                    ventas.put(barrio, ventas.get(barrio) + precio);
                    cantidadVentas.put(barrio, cantidadVentas.get(barrio) + 1);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intenta de nuevo.");
                userEntry = -1;
            }

        } while (userEntry != 2);

        System.out.println("Reporte de ventas:");

        for (String barrio : ventas.keySet()) {
            System.out.println(barrio + " vendió " + ventas.get(barrio) + " Bolívares y " + cantidadVentas.get(barrio) + " casas.");
        }

        // Reportes finales.
        System.out.println("\nResumen:");

        Entry<String, Integer> maxEntry = null;
        for (Entry<String, Integer> entry : ventas.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0 
                || (entry.getValue().compareTo(maxEntry.getValue()) == 0 && pesos.get(entry.getKey()) < pesos.get(maxEntry.getKey()))) {
                maxEntry = entry;
            }
        }
        System.out.println("Barrio que más dinero ganó: " + maxEntry.getKey());

        Entry<String, Integer> minEntry = null;
        for (Entry<String, Integer> entry : ventas.entrySet()) {
            if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0
                || (entry.getValue().compareTo(minEntry.getValue()) == 0 && pesos.get(entry.getKey()) > pesos.get(minEntry.getKey()))) {
                minEntry = entry;
            }
        }
        System.out.println("Barrio que menos dinero ganó: " + minEntry.getKey());

        maxEntry = null;
        for (Entry<String, Integer> entry : cantidadVentas.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0 
                || (entry.getValue().compareTo(maxEntry.getValue()) == 0 && pesos.get(entry.getKey()) > pesos.get(maxEntry.getKey()))) {
                maxEntry = entry;
            }
        }
        System.out.println("Barrio que más casas vendió: " + maxEntry.getKey());
    }
}