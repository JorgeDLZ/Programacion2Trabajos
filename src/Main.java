import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 50, min = 1;
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numAleatorio = aleatorio.nextInt(max - min + 1) + min;
        int intentos = 3;

        System.out.println("Adivina el número entre " + min + " y " + max + " en " + intentos + " intentos.");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            int user = teclado.nextInt();

            if (user == numAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;

            } else {
                if (user < numAleatorio) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
                if (i == intentos) {
                    System.out.println("Perdiste, el número era: " + numAleatorio);
                }
            }
        }



    }
}
