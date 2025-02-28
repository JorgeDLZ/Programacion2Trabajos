import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 10, min = 1;
        int rondas, dado1, dado2;
        int cont1 = 0, cont2 = 0;

        Random ale = new Random();
        rondas = ale.nextInt(max - min + 1) + min;
        System.out.println("Cantidad de rondas: " + rondas);

        for (int i = 1; i <= rondas; i++) {
            dado1 = ale.nextInt(6) + 1;
            dado2 = ale.nextInt(6) + 1;

            cont1 += dado1;
            cont2 += dado2;

            System.out.println("Ronda " + i + ":");
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println();
        }

        System.out.println("Suma total Dado 1: " + cont1);
        System.out.println("Suma total Dado 2: " + cont2);

        if (cont1 > cont2) {
            System.out.println("Dado 1 gana");
        } else if (cont2 > cont1) {
            System.out.println("Dado 2 gana");
        } else {
            System.out.println("Es un empate");
        }
    }
}
