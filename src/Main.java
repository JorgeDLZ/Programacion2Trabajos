import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 50, min = 1, num, numa, user, i=0;
        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);

        numa = ale.nextInt(max - min + 1) + 1;

        while(i>3){
        System.out.println("Adivina el numero");
        user =teclado.nextInt();

        i++;
        }

    }
}


