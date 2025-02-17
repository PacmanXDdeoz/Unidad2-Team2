// 5. Mostrar la tabla de multiplicar de los números del 1 al 9. Usaremos dos bucles anidados.
public class Tablas {//nombre de la clase 
    public static void main(String[] args) {//metodo principal
        // Bucle exterior para los números del 1 al 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabla de multiplicar del " + i + ": ");//impresion del mensaje
            
            // Bucle interior para las multiplicaciones del 1 al 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));//impresion del mensaje junto con la operacion
            }
            
            System.out.println();// impresion vacia para crear separacion de las tablas
        }
    }
}