import java.util.Arrays;
import java.util.Scanner;

public class BurbujaFuntion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los números separados por espacios para ordenarlos:");
        String entrada = scanner.nextLine();
        String[] partes = entrada.trim().split("\\s+");
        int[] arreglo = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            arreglo[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("\nArreglo original: " + Arrays.toString(arreglo));
        System.out.println("\n--- Proceso de ordenamiento ---");

        for (int i = 0; i < arreglo.length - 1; i++) {
            System.out.println("\nPasada " + (i + 1) + ":");
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                System.out.print("Comparando " + arreglo[j] + " y " + arreglo[j + 1]);

                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println(" => Intercambio realizado: " + Arrays.toString(arreglo));
                } else {
                    System.out.println(" => Sin cambio");
                }
            }
        }

        System.out.println("\nArreglo ordenado: " + Arrays.toString(arreglo));
        scanner.close();
    }
}
