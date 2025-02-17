class Numeros3y5 { // Clase Numeros3y5
    public static void main(String[] args) { // Método main
        int a = 20; // Declaración y asignación
        for (int i = 0; i <= a; i++){ // Ciclo for
            if (i % 3 == 0 && i % 5 == 0){ // Condicional if
                System.out.println(i + "FizzBuzz"); // Impresión
            } else if (i % 5 == 0){ // Condicional if
                System.out.println(i + "Buzz"); // Impresión
            } else if (i % 3 == 0){ // Condicional if
                System.out.println(i + "Fizz"); // Impresión
            } else { // Sino
                System.out.println(i); // Impresión
            } // Cierre condicional if
        } // Cierre ciclo for
    } // Cierre método main
} // Cierre clase Numeros3y5