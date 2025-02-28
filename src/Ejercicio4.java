import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el monto inicial: ");
        int monto = teclado.nextInt();
        int ronda = 1;
        int fin;
        Random random = new Random();
        int numeroAleatorio;
        int opcion;


            numeroAleatorio = random.nextInt(3) + 1;
            System.out.println("Numero aleatorio generado: " + numeroAleatorio);
          while (true){

            if (numeroAleatorio == 1) {
                fin = (monto * 2);
                System.out.println("Su monto se ha duplicado " + fin);
                System.out.println("Quieres seguir jugando? (1/2)");
                opcion=teclado.nextInt();
                if (opcion==1){
                    numeroAleatorio = random.nextInt(3) + 1;
                    if (numeroAleatorio==1){
                    System.out.println("Su monto se ha duplicado " + fin);
                    System.out.println("Quieres seguir jugando? (1/2)");
                    opcion= teclado.nextInt();

                    if (opcion==1){

                    }
                } else {
                    break;
                }
            } else if (numeroAleatorio == 2) {
                fin = (monto / 2);
                System.out.println("Su monto se ha dividido a la mitad " + fin);

            } else {
                System.out.println("Perdiste");
            }


        }
    }
}
