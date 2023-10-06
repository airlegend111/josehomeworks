import javax.swing.JOptionPane;

/**
 * Hoteles
 */
public class Hoteles { // declaramos una clase publica llamada hoteles

    public static void main(String[] args) {
        int cantidadHoteles = (int) ((Math.random() * 7) + 1); // la variable cantidadHoteles genera aleatoriamentem la
                                                               // cantidad de hoteles del 1 al 7

        double hoteles[][] = new double[cantidadHoteles][4]; // La matriz hoteles en la primera posicionde va tomar el
                                                             // valor generado por cantidadHoteles para crear n listas
                                                             // de listas
                                                             // En el segundo parametro de la matriz dicta que cada
                                                             // lista va a tener 4 slots de espacios para alojar la
                                                             // informacion
        for (int x = 0; x < cantidadHoteles; x++) { // el for se repite n cantidad de veces dependiendo la
                                                    // cantiadadHoteles y se va a repetir mientras x sea menor a
                                                    // cantiadadHoteles
            hoteles[x][0] = (int) ((Math.random() * 14) + 3); // en hoteles[x][0] se genera aleotariamente la cantidad
                                                              // de pisos
            hoteles[x][1] = (int) ((Math.random() * 3) + 1); // en hoteles[x][1] se genera aleatoriamente el tipo de
                                                             // luces
            hoteles[x][2] = (int) ((Math.random() * 24) + 0);// en hoteles[x][2] se genera aleatoriamente las horas de
                                                             // uso

            if (hoteles[x][1] == 1) { // el if dice si el tipo de luces es == n va a multiplicar por el respectivo
                                      // precio el total de horas en las que todas las luces estaban encendidad entre
                                      // todos los pisos
                hoteles[x][3] = hoteles[x][2] * 0.50;

            }
            if (hoteles[x][1] == 2) {
                hoteles[x][3] = hoteles[x][2] * 0.25;

            }
            if (hoteles[x][1] == 3) {
                hoteles[x][3] = hoteles[x][2] * 1;
            }
        }

        for (int y = 0; y < cantidadHoteles; y++) { // Este ultimo siclo se encarga de imprimir todos los datos
                                                    // requeridos
            JOptionPane.showMessageDialog(null, "para el hotel # " + (y + 1) + " hubo luces por " + hoteles[y][2]
                    + " y el gasto fue $ " + hoteles[y][3]);

        }

    }
}
