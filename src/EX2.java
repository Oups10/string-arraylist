import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
/*
        String cadena = "google.com";
        char[] caracters = new char[cadena.length()];
        int[] frequencia = new int[cadena.length()];
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            boolean existeix = false;

            for (int j = 0; j < contador; j++) {
                if (caracters[j] == c) {
                    frequencia[j]=frequencia[j] + 1;
                    existeix = true;
                    break;
                }
            }

            if (!existeix) {
                caracters[contador] = c;
                frequencia[contador] = 1;
                contador++;
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(caracters[i] + ": " + frequencia[i]);
        }
    }
}
*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix una cadena: ");
        String cadena = sc.nextLine();

        char[] caracters = new char[cadena.length()];
        int[] frequencia = new int[cadena.length()];
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            char c = cadena.charAt(i);
            boolean existeix = false;

            for (int j = 0; j < contador; j++) {

                if (caracters[j] == c) {
                    frequencia[j]++;
                    existeix = true;
                    break;
                }
            }

            if (!existeix) {
                caracters[contador] = c;
                frequencia[contador] = 1;
                contador++;
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(caracters[i] + " : " + frequencia[i]);
        }

    }
}