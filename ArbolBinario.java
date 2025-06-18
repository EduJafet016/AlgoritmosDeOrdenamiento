import java.util.Scanner;

public class ArbolBinario {
    static class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int valor) {
            this.valor = valor;
            izquierdo = derecho = null;
        }
    }

    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) return false;
        if (actual.valor == valor) return true;
        return valor < actual.valor
            ? buscarRecursivo(actual.izquierdo, valor)
            : buscarRecursivo(actual.derecho, valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int[] valores = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int v : valores) {
            arbol.insertar(v);
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ ÁRBOL BINARIO ---");
            System.out.println("1. Buscar número");
            System.out.println("2. Agregar número");
            System.out.println("3. Mostrar recorrido en orden");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número para buscar: ");
                    int buscar = scanner.nextInt();
                    if (arbol.buscar(buscar)) {
                        System.out.println("El número " + buscar + " SÍ está en el árbol.");
                    } else {
                        System.out.println("El número " + buscar + " NO está en el árbol.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa un número para agregar al árbol: ");
                    int nuevo = scanner.nextInt();
                    arbol.insertar(nuevo);
                    System.out.println("Número insertado.");
                    break;
                case 3:
                    System.out.print("Recorrido en orden: ");
                    arbol.inOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}