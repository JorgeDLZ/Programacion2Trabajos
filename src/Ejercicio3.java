import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su peso en Kg: ");
        double peso = teclado.nextDouble();

        System.out.println("Ingrese su estatura en m: ");
        double estat = teclado.nextDouble();

        double imc = peso/(estat*estat);

        if (imc<18.5) {
            System.out.println("Usted tiene bajo peso");
        }else if (imc>=18.5 && imc<=24.9) {
            System.out.println("Usted tiene peso normal");
        } else if (imc>=25 && imc>=26.9) {
            System.out.println("Usted tiene sobrepeso grado I");
        } else if (imc>=27 && imc<=29.9) {
            System.out.println("Usted tiene sobrepeso grado II");

        } else if (imc>=30 && imc<=34.9) {
            System.out.println("Usted tiene obesidad tipo I");
        } else if (imc>=35 && imc<=39.9) {
            System.out.println("Usted tiene obesidad tipo II");
        } else if (imc>=40 && imc<=49.9) {
            System.out.println("Usted tiene obesidad tipo III");
        } else if (imc>50) {
            System.out.println("Usted tiene obesidad tipo IV");
        }else {
            System.out.println("El peso no existe");
        }
    }

    }
