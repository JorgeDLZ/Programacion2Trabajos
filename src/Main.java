import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 50, min = 1;
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numAleatorio = aleatorio.nextInt(max - min + 1) + min;
        int intentos = 3;

        System.out.println("Adivina el numero entre " + min + " y " + max + " en " + intentos + " intentos.");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            int user = teclado.nextInt();

            if (user == numAleatorio) {
                System.out.println("Has adivinado el numero.");
                break;

            } else {
                if (user < numAleatorio) {
                    System.out.println("El numero es mayor.");
                } else {
                    System.out.println("El numero es menor.");
                }
                if (i == intentos) {
                    System.out.println("Perdiste, el numero era: " + numAleatorio);
                }
            }
        }



    }
}
