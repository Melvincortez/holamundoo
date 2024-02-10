
import java.util.Random;

public class GalletaFortuna {
    public static void main(String[] args) {
        System.out.println("Mensaje:");

        Random rand = new Random();
        int numeroMensaje = rand.nextInt(6) + 1;

        switch (numeroMensaje) {
            case 1:
                System.out.println("Vive sin limites");
                break;
            case 2:
                System.out.println("Avanza sin mirar atras");
                break;
            case 3:
                System.out.println("Todo es un proceso, pasara");
                break;
            case 4:
                System.out.println("Todo mejorara, paciencia");
                break;
            case 5:
                System.out.println("Esfuerzo y disciplina, llegaras");
                break;
            case 6:
                System.out.println("Manten la calma y disfruta el camino");
                break;
            default:
                System.out.println("Mensaje no valido");
                break;
        }
    }
}
