class Num120{ //Iniciamos clase
 public static void main(String[] args){ //Iniciamos metodo
  System.out.println("Numeros del 1 al 20:\n"); //Titulo
   for ( int i = 0; i <= 20; i++){ //Bucle
    if ( i % 3 == 0 && i % 5 == 0){ //Primero condicion para 3 y 5, de lo con tario se ejecutaria un solo auque sea de ambos 
     System.out.println("FizzBuzz\n"); //Mensaje de condicion 
   } else if ( i % 3 == 0) { //Cierre de "if" y condicion para el 3
      System.out.println("Fizz\n"); //Mensaje de condicion 
   } else if (i % 5 == 0) { //cierre de " else if" y condicion para 5
      System.out.println("Buzz\n"); //Mensaje de condicion
   } else { // Cierre "else if" y condicon
      System.out.println(i); //Mensaje de condicion
   } //Cierre condicion
  } //Cierre for
 } //Cierre metodo
} //Cierre clase
