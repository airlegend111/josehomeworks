/**
 * Hoteles
 */
public class Hoteles {
public static int [] altura(int [] pisos){
    pisos[0] = (int)((Math.random()* 15)+3);
    
    return pisos;
}
public static int [] cadena(int [] hoteles){
    hoteles[0] = (int)((Math.random()* 7)+1);
    return hoteles;

}
public static int [] time(int []horas){
    horas[0] = (int)((Math.random()* 24)+0);
    return horas;
    
}
public static int[] luz(int [] tipo){
    tipo[0]= (int)((Math.random()*3)+1);
    return tipo;

}

}