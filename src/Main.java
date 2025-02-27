import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int max = 10;
        int min = 1;
        int num;
        int dado1;
        int dado2;
        int rondas;
        int cont1=0,cont2=0, suma1=0,suma2=0;


        Random ale = new Random();
        rondas=ale.nextInt(max-min+1)+min;
        System.out.println("Cantidad de rondas: " + rondas);



        for (int i =1;i<=rondas;i++){
            dado1 = ale.nextInt(6-1+1) + 1;
            cont1 += dado1;


            dado2= ale.nextInt(6-1+1) + 1;
            cont2 += dado1;

            System.out.println();
            System.out.println("D1 "+ dado1);
            System.out.println("D2 "+ dado2);

            System.out.println();

            if(cont1>cont2



        }

    }
}