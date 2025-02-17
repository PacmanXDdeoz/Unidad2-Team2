public class Pares {//nombre de mi clase 
        public static void main(String[] args) {//método principal
        for (int i=0; i<=100; i++){//bucle
            if (i%2==0){//condicion
                System.out.println("Números pares: " + i);//impresion
            }
        }
        for (int i=0; i<=100; i+=1){//bucle
            if (i%2==1){//condicion
                System.out.println("Números impares: " +i);//imoresion
            }
        }
    }
}
