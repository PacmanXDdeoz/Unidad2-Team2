// 2. Imprimir los números pares que hay dentro de los 100 primeros números enteros.
// Utilizaremos el operador % para separar los pares de los impares. El bucle avanzará de 1 en 1.
// Nota: El operador “%” nos da el resto de dividir un número entre otro.
// Ej: 7%2=1
import java.util.Scanner;//libreria para pedir datos al usuario

public class Pares {//nombre de mi clase 
    public static void main(String[] args) {//metodo principal
        Scanner op = new Scanner(System.in);// crear mi objeto Scanner que tiene la declaracion de "op"

        System.out.print("1:Numeros Pares\n");//opcion del menu para el usuario
        System.out.print("2:Numeros Impares");//opcion del menu para el usuario
        int num = op.nextInt();//declarar mi variable llamada num, y se alamcenara dentro de mi objeto Scanner
        
        switch (num) {//mi estructura de control que se llama de igual forma que la declaracion de mi variable
            case 1://primer caso que es la opcion numero 1 de mi menu 
                for (int i = 0; i <= 100; i++) {//bucle que itera del numero 0 al 100 e incrementa de 1 en 1
                    if (i % 2 == 0) {//condicion que evalua que se puede dividir entre 2 y no tener un residuo 
                        System.out.println("numeros pares: " + i);//impresion de mensaje 
                    }
                }
                break;//terminar bucle

            case 2://segundo caso que es la opcion numero 2 de mi menu
                for (int i = 0; i <= 100; i++) {//bucle que itera del numero 0 al 100 e incrementa de 1 en 1
                    if (i % 2 == 1) {//condicion que evalua que se puede dividir entre 2 y tener un residuo de 1 
                        System.out.println("numeros impares: " + i);//impresion de mensaje junto con la concatenacion del bucle 
                    }
                }
                break;//terminar bucle

            default:
                System.out.println("nadota");// por si escribe una opcion invalida, le aparecera ese mensaje al usuario
                break;//terminar bucle
        }
    }
}