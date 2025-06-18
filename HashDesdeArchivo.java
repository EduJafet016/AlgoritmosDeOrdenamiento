import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class HashDesdeArchivo {
    public static void main(String[] args) {
        HashMap<Integer, String> tabla = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1] + "," + partes[2];
                tabla.put(id, nombre);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ TABLA HASH ---");
            System.out.println("1. Buscar ID");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un ID a buscar: ");
                    int idBuscar = scanner.nextInt();
                    if (tabla.containsKey(idBuscar)) {
                        System.out.println("Registro encontrado: " + tabla.get(idBuscar));
                    } else {
                        System.out.println("Registro no encontrado para ID: " + idBuscar);
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}