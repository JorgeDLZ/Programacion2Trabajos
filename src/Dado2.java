import java.util.Random;

public class Dado2 {
    public static void main(String[] args) {
        Random random = new Random();
        int vidas = 5;
        int puntos = 0;
        int ronda = 1;

        while (puntos < 10 && vidas > 0) {
            int numeroAleatorio = random.nextInt(6) + 1;
            System.out.println("Sacaste un " + numeroAleatorio);

            if (numeroAleatorio == 1) {
                vidas--;
                System.out.println("Ronda "+ ronda);
                System.out.println("Usted ha perdido 1 vida. Le quedan " + vidas + " vidas y tiene " + puntos + " puntos.");
                ronda++;

            } else if (numeroAleatorio == 6) {
                puntos += 3;
                System.out.println("Ronda "+ ronda);
                System.out.println("Usted ha ganado 3 puntos y tiene " + puntos + " puntos.");
                ronda++;
            } else if (numeroAleatorio == 2 || numeroAleatorio == 4) {
                puntos += 1;
                System.out.println("Ronda "+ ronda);
                System.out.println("Usted ha ganado 1 punto y tiene " + puntos + " puntos.");
                ronda++;
            } else if (numeroAleatorio == 3 || numeroAleatorio == 5) {
                System.out.println("Ronda "+ ronda);
                System.out.println("Usted no gana puntos y tiene " + puntos + " puntos.");
                ronda++;
            }


            if (puntos >= 10) {
                System.out.println("Usted ha ganado.");
                break;
            }


            if (vidas == 0) {
                System.out.println("Se quedó sin vidas. Fin del juego.");
                break;
            }
        }
    }
}
