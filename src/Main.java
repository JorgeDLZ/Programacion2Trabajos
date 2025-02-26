/*  La diferencia entre el switch case viejo y el switch case nuevo
 de Java 14 radica principalmente en la sintaxis, funcionalidad y facilidad de uso.
 Ya que mientras en la version vieja, se precisa del uso de un break
 para poner terminar la ejecucion del codigo, en la version de java 14
 podemos hacerlo de una manera mucho más efeciente, así mismo logrando hacerlo
  de una manera más compacta a la hora de programar
 */
// Sintaxis Antigua (Java 13 y versiones anteriores)
//La sintaxis tradicional usa la palabra clave case con break
// para evitar la ejecución de múltiples casos:
//Switch case viejo:
public class SwitchVersion {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
    }
}
//Switch case nuevo
public class SwitchVersion {
    public static void main(String[] args) {
        int day = 2;

        String resultado = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día no válido";
        };

        System.out.println(resultado);
    }
}
