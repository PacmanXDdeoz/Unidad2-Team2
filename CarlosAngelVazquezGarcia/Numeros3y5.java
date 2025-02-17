class Numeros3y5 {
    public static void main(String[] args) {
        int a = 20;
        for (int i = 0; i <= a; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + "FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println(i + "Buzz");
            } else if (i % 3 == 0){
                System.out.println(i + "Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}