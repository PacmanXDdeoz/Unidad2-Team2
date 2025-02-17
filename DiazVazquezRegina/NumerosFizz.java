// 3. Imprimir los números del 1 al 20.
// Para números divisibles por 3, imprimir “Fizz”.
// Para números divisibles por 5, imprimir “Buzz”.
// Para números divisibles por 3 y 5, imprimir “FizzBuzz”.
// En cualquier otro caso, imprimir el número.
public class NumerosFizz {//nombre de mi clase
    public static void main(String[] args) {//metodo principal
        for (int i = 0; i <=20;i++) {//bucle que itera del numero 0 al 20 y su incremento es de uno en uno 
            if (i % 3 == 0) {//condicion que evalua que los numeros divisibles entre 3, imprima la palabara fizz
                System.out.println("Fizz " + i);//impresion de mensaje 
            }
        }
        for (int i = 0; i <=20;i++) {//bucle que itera del numero 0 al 20 y su incremento es de uno en uno 
            if (i % 5 == 0) {//condicion que evalua que los numeros divisibles entre 5, imprima la palabara buzz
                System.out.println("Buzz " + i);//impresion de mensaje
            }
        }
        for (int i = 0; i <=20;i++) {//bucle que itera del numero 0 al 20 y su incremento es de uno en uno 
            if (i % 5 == i % 3) {//condicion que evalua que los numeros divisibles entre 3 y 5, imprima la palabara FizzBuzz
                System.out.println("FizzBuzz " + i);//impresion del mensaje
            }
        }
    }
}