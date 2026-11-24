import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("La longitud és: " + cadena.length());
    }
}
