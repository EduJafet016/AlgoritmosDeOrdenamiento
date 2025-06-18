# AlgoritmosDeOrdenamiento

Explicación del código
Este programa en Java implementa el algoritmo de ordenamiento burbuja (Bubble Sort) para ordenar una lista de números ingresados por el usuario.

Paso a paso:
Entrada de datos:

Utiliza un objeto Scanner para leer una línea de entrada que contiene números separados por espacios.

Divide la línea en partes usando el método .split("\\s+"), lo cual permite separar correctamente los números incluso si hay múltiples espacios entre ellos.

Cada número, inicialmente como cadena de texto, se convierte a un valor entero mediante Integer.parseInt() y se almacena en un arreglo de tipo int.

Impresión del arreglo original:

Se muestra el contenido del arreglo antes del proceso de ordenamiento, utilizando el método Arrays.toString().

Ordenamiento con Bubble Sort:

Se emplean dos bucles for anidados:

El bucle externo controla el número de pasadas necesarias.

El bucle interno compara elementos adyacentes y realiza un intercambio si están en el orden incorrecto (es decir, si el elemento actual es mayor que el siguiente).

Este proceso "empuja" los valores más grandes hacia el final del arreglo en cada pasada.

Resultado final:

Se imprime el arreglo ya ordenado.

Tipo de ordenamiento utilizado
El algoritmo utilizado es Bubble Sort, un método de ordenamiento simple y fácil de entender, aunque ineficiente para conjuntos de datos grandes.

Se basa en comparar e intercambiar pares de elementos adyacentes hasta que todo el arreglo esté ordenado.

Complejidad del algoritmo (Notación Big O)
Peor caso (cuando el arreglo está completamente desordenado):
La complejidad es O(n²), ya que se realizan aproximadamente n * (n - 1) / 2 comparaciones.

Mejor caso (cuando el arreglo ya está ordenado):
También es O(n²), ya que el algoritmo, tal como está implementado, no verifica si el arreglo ya se encuentra ordenado, por lo que realiza todas las pasadas de todas formas.


Conclusión
Este programa representa una aplicación básica del algoritmo Bubble Sort. Aunque no es el algoritmo más eficiente.
