import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TrabajoPractico7 {
    // Ejercicio 1: Ordenar un array de números enteros de menor a mayor. (Thomy)
    public static void ordenarMenorAMayor() {
        int[] unOrderNums = {5, 8, 18, 44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int s : unOrderNums)
            System.out.println(s);
    }

    // Ejercicio 2: Ordenar un array de números enteros de mayor a menor. (RODRIGO)
    public static void ordenarMayorAMenor() {
        Scanner sc = new Scanner(System.in);
        Integer[] arrayNum = {2, 6, 7, 3, 1, 0, 10};
        Arrays.sort(arrayNum, Collections.reverseOrder());
        for (int item : arrayNum)
            System.out.println(item);
    }

    // Ejercicio 3: Ordenar un array de números flotantes de menor a mayor. (Rodrigo)
    public static void ordenarFlotantesMenorAMayor() {
        Scanner sc = new Scanner(System.in);
        float[] arrayNum = {2f, 6f, 7f, 3f, 1f, 0f, 10f};
        Arrays.sort(arrayNum);
        for (float item : arrayNum)
            System.out.println(item);
    }

    // Ejercicio 4: Ordenar un array de números flotantes de mayor a menor. (Thomy)
    public static void ordenarFlotantesMayorAMenor() {
        double[] unOrderNums = {5.66, 8, 18, 44.44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int i = unOrderNums.length - 1; i >= 0; i--) {
            System.out.println(unOrderNums[i]);
        }
    }

    // Ejercicio 5: Ordenar un array de cadenas de texto en orden alfabético. (Thomy)
    public static void ordenarCadenasAlfabeticamente() {
        String[] strArray = {"Thomas", "Paula", "Eze", "Rodrigo", "Julieta", "Denis", "Uriel", "Zamora", "Ana", "Belén"};
        Arrays.sort(strArray);
        for (String s : strArray)
            System.out.println(s);
    }

    // Ejercicio 6: Ordenar un array de cadenas de texto en orden inverso. (Rodrigo)
    public static void ordenarCadenasInverso() {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = {"Java", "Pablo", "Thomas"};
        Arrays.sort(cadenas, Collections.reverseOrder());
        for (String item : cadenas)
            System.out.println(item);
    }

    // Ejercicio 7: Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja. (Thomy)
    public static void ordenarBurbuja() {
        int[] bubbleInt = {4, 7, 2, 18, 92, 25, 44, 15};
        int i, j, aux;
        for (i = 0; i < bubbleInt.length - 1; i++) {
            for (j = 0; j < bubbleInt.length - 1; j++) {
                if (bubbleInt[j] > bubbleInt[j + 1]) {
                    aux = bubbleInt[j];
                    bubbleInt[j] = bubbleInt[j + 1];
                    bubbleInt[j + 1] = aux;
                }
            }
        }
        for (int s : bubbleInt)
            System.out.println(s);
    }

    // Ejercicio 8: Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por selección. (RODRIGO)
    public static void ordenarSeleccion() {
        int[] array = {2, 1, 20, 4, 5, 6, 102};
        int aux, minimo;

        for (int i = 0; i < array.length - 1; i++) {
            minimo = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }

            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }

        System.out.println(Arrays.toString(array));
    }

    // Ejercicio 9: Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción. (Thomy)
    public static void ordenarInsercion() {
        int[] inser = {30, 150, 2, 21, 44, 8};
        int aux, p, j;

        for (p = 1; p < inser.length; p++) {
            aux = inser[p];
            j = p - 1;

            while ((j >= 0) && (aux < inser[j])) {
                inser[j + 1] = inser[j];
                j--;
            }

            inser[j + 1] = aux;
        }

        for (int n = 0; n <= 5; n++) {
            System.out.println(inser[n]);
        }
    }

    // Ejercicio 10: Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla. (Paula)
    public static void ordenarMezcla() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int i;

        System.out.println("LLENE ESTE ARRAY DE 10 ELEMENTOS CON NUMEROS ENTEROS");

        for (i = 0; i < 10; i++) {
            System.out.println("Ingresar el valor del array en la posición " + (i + 1) + ":");
            A[i] = sc.nextInt();
        }

        System.out.println("Array original:" + Arrays.toString(A));
        mergesort(A, 0, (A.length - 1));
        System.out.println("Array mezclado:" + Arrays.toString(A));
    }

    public static void mergesort(int[] A, int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int[] A, int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; //array auxiliar

        for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar
            B[i] = A[i];

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) //copia el siguiente elemento más grande
            if (B[i] <= B[j])
                A[k++] = B[i++];
            else
                A[k++] = B[j++];

        while (i <= m)         //copia los elementos que quedan de la
            A[k++] = B[i++]; //primera mitad (si los hay)
    }

    // Ejercicio 11: Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell. (Uriel)
    public static void ordenarShell() {
        int[] arreglo1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = (int) (Math.random() * 100);
        }

        System.out.println("Arreglo antes del ordenamiento: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }

        shell(arreglo1);

        System.out.println("");
        System.out.println("Arreglo después del ordenamiento: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + arreglo1[i] + "]->");
        }
    }

    public static void shell(int[] arreglo1) {
        int salto = 0;
        int temp = 0;
        int i = 0;
        boolean cambio;

        for (salto = arreglo1.length / 2; salto != 0; salto /= 2) {
            cambio = true;

            while (cambio) {
                cambio = false;

                for (i = salto; i < arreglo1.length; i++) {
                    if (arreglo1[i - salto] > arreglo1[i]) {
                        temp = arreglo1[i];
                        arreglo1[i] = arreglo1[i - salto];
                        arreglo1[i - salto] = temp;
                        cambio = true;
                    }
                }
            }
        }
    }

    // Ejercicio 12: Cargar y ordenar un array según opciones dadas por el usuario. (Ruth)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[20];
        System.out.println("Ingrese 20 elementos enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("¿Cómo desea ordenar el array? (ASCENDENTE o DESCENDENTE): ");
        String tipoOrdenamiento = scanner.next();

        System.out.print("Seleccione el método de ordenamiento (inserción, burbuja, selección): ");
        String metodoOrdenamiento = scanner.next();

        if (tipoOrdenamiento.equals("ASCENDENTE")) {
            if (metodoOrdenamiento.equals("inserción")) {
                ordenarInsercionAscendente(array);
            } else if (metodoOrdenamiento.equals("burbuja")) {
                ordenarBurbujaAscendente(array);
            } else if (metodoOrdenamiento.equals("selección")) {
                ordenarSeleccionAscendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else if (tipoOrdenamiento.equals("DESCENDENTE")) {
            if (metodoOrdenamiento.equals("inserción")) {
                ordenarInsercionDescendente(array);
            } else if (metodoOrdenamiento.equals("burbuja")) {
                ordenarBurbujaDescendente(array);
            } else if (metodoOrdenamiento.equals("selección")) {
                ordenarSeleccionDescendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else {
            System.out.println("Tipo de ordenamiento no válido.");
            return;
        }

        System.out.println("Array original:");
        mostrarArray(array);
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarInsercionAscendente(int[] A) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) {
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    public static void ordenarInsercionDescendente(int[] A) {
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) {
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux > A[j])) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    public static void ordenarBurbujaAscendente(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void ordenarBurbujaDescendente(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void ordenarSeleccionAscendente(int[] A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void ordenarSeleccionDescendente(int[] A) {
        int i, j, mayor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            mayor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] > mayor) {
                    mayor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
}
