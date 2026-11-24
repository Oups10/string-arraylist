import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una cadena: ");
        String cadena = sc.nextLine();

        String resultat = "";

        if (cadena.length() >= 2) {
            resultat = cadena.substring(0, 2) +
                    cadena.substring(cadena.length() - 2);
        }

        System.out.println(resultat);
    }
}
