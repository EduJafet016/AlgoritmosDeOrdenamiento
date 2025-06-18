import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los números separados por espacios para ordenarlos:");
        String entrada = scanner.nextLine();
        String[] partes = entrada.trim().split("\\s+");
        int[] arreglo = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            arreglo[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
        scanner.close();
    }
}