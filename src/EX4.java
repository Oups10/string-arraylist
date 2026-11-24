import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una cadena: ");
        String cadena = sc.nextLine();

        if (cadena.length() < 3) {
            System.out.println(cadena);
        } else if (cadena.substring(cadena.length() - 3).equals("ing")) {
            System.out.println(cadena + "ly");
        } else {
            System.out.println(cadena + "ing");
        }
    }
}