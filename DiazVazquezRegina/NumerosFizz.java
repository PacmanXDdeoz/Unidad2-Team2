// 3. Imprimir los números del 1 al 20.
// Para números divisibles por 3, imprimir “Fizz”.
// Para números divisibles por 5, imprimir “Buzz”.
// Para números divisibles por 3 y 5, imprimir “FizzBuzz”.
// En cualquier otro caso, imprimir el número.
class NumerosFizz{ // Nombre de la clase se declara igual al archivo
    public static void main(String[] args) { // Metodo principal mas importante 
        for (int i = 1; i <= 20; i++) { // Utilizamos un bucle for que recorra los números del 1 al 20 
            // Utilizamos la condición if para verificar si el número es divisible por 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {// Si es divisible por 3 y 5 imprimimos FizzBuzz
                 System.out.println("FizzBuzz"); // Si es divisible por 3 pero no por 5 imprimimos Fizz
            } else if (i % 3 == 0) {// Si es divisible por 5 pero no por 3 imprimimos Buzz    
                System.out.println("Fizz");  // Si no es divisible por 3 ni 5 imprimimos el número
            } else if (i % 5 == 0) { 
                System.out.println("Buzz");
            } else {
               
                System.out.println(i);
            }
        }
    }
}
