class numero1al20{ // Se define la clase 
public static void main(String[] args){ // Se define el metodo principal
System.out.println("Numeros del 1 al 20"); // Titulo del ejercicio
for(int i = 1; i <=20; i++){ // for para iterar los numeros del 1 al 20
 if (i % 3 == 0 && i % 5 ==0){ // if para saber si es %3 o %5 que debe imprimir lo solicitado
System.out.println("Fizbuzz"); //Titulo de lo solicitado
 } else if (i % 3 == 0) { // Si i%3=0 se imprime fizz
  System.out.println("Fizz");
 } else if (i % 5 == 0) { // De otra manera si i%5=0 se imprime buzz
  System.out.println("buzz");
 } else {
  System.out.println(i); //Si las demas condiciones no se cumplen se imprime Fizbuzz
}
}
}
}
