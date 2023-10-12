
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TrabajoPractico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1: Calcular la media de una serie de números que se leen por teclado. 
        int sum = 0;
        int count = 0;

        System.out.println("Ingresa números (0 para terminar):");
        int num = sc.nextInt();

        while (num != 0) {
            sum += num;
            count++;
            num = sc.nextInt();
        }

        if (count != 0) {
            double media = (double) sum / count;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        // Ejercicio 2: Programa que lea por teclado 10 números enteros y los guarde en un array.
        // A continuación calcula y muestra la media de los números que estén en las posiciones pares del array. 
        int[] array = new int[10];
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero de la posicion " + i);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += array[i];
                contador++;
            }
        }

        if (contador != 0) {
            double mediaPares = (double) suma / contador;
            System.out.println("La media de los numeros en las posiciones pares del array es: " + mediaPares);
        } else {
            System.out.println("No hay números en las posiciones pares.");
        }

        // Ejercicio 3: Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
        // También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado. 
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantStudents = sc.nextInt();
        double studentMarks[], markSum = 0, average;
        studentMarks = new double[cantStudents];

        for (int i = 0; i < cantStudents; i++) {
            int aux = 1;
            do {
                System.out.println("Ingrese la nota del alumno " + (i + 1));
                studentMarks[i] = sc.nextDouble();
                if (studentMarks[i] <= 10 && studentMarks[i] > 0) {
                    markSum += studentMarks[i];
                    aux -= 1;
                } else {
                    System.out.println("Ingrese una nota válida");
                }
            } while (aux == 1);
        }

        average = markSum / cantStudents;
        System.out.println("La media de notas es de " + average);

        for (int i = 0; i < cantStudents; i++) {
            if (studentMarks[i] > average) {
                System.out.println("El alumno " + i + " consiguió superar la media de notas, con nota " + studentMarks[i]);
            }
        }

        // Ejercicio 4: Programa que crea un array de 20 elementos llamado Pares y guarda los 20 primeros números pares. 
        int[] Pares = new int[20];
        for (int i = 0; i < 20; i++) {
            Pares[i] = i * 2;
        }

        System.out.println("Contenido del array Pares:");
        System.out.println(Arrays.toString(Pares));

        // Ejercicio 5: Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        // A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros. 
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        // Ejercicio 6: Programa Java que llene un array con 10 números enteros que se leen por teclado.
        // A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array. 
        int[] array2 = new int[10];
        int positive_sum = 0, negative_sum = 0, counter2 = 0;

        for (int i = 0; i < 10; i++) {
            String message = String.format("Ingresa el numero entero para la posicion [%d]", i + 1);
            System.out.println(message);
            array2[i] = sc.nextInt();
        }

        for (int j : array2) {
            if (j < 0) {
                negative_sum += j;
            } else {
                positive_sum += j;
            }
            counter2++;
        }

        System.out.println("Promedio de números positivos: " + (positive_sum / counter2));
        System.out.println("Promedio de números negativos: " + (negative_sum / counter2));

        // Ejercicio 7: Programa Java para leer la altura de N personas y calcular la altura media.
        // Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. 
        System.out.println("Ingresar cantidad de personas:");

        if (sc.hasNextInt()) {
            int cantidadPersonas = sc.nextInt();

            if (cantidadPersonas > 0) {
                int[] alturas = new int[cantidadPersonas];
                int sumaAlturas = 0;
                int i;

                for (i = 0; i <= cantidadPersonas - 1; i++) {
                    System.out.println("Ingresar la altura de la persona en centimetros: " + (i + 1));
                    int altura = sc.nextInt();
                    alturas[i] = altura;
                    sumaAlturas += altura;
                }

                double alturaMedia = (double) sumaAlturas / cantidadPersonas;
                int inferior = 0;
                int superior = 0;

                for (i = 0; i <= cantidadPersonas - 1; i++) {
                    if (alturas[i] > alturaMedia) {
                        inferior++;
                    } else {
                        superior++;
                    }
                }

                System.out.println("La altura media:" + alturaMedia);
                System.out.println("Personas con alturas INFERIORES a la media:" + inferior);
                System.out.println("Personas con alturas SUPERIORES a la media:" + superior);
            } else {
                System.out.println("El numero ingresado no es un numero positivo, reinicie el programa");
            }
        } else {
            System.out.println("No has ingresado un numero entero, reinicie el programa");
        }

        // Ejercicio 8: Programa Java que lea el nombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana. 
        String[] nombres = new String[5];
        double[] sueldos = new double[5];
        double mayorSueldo = 0;
        int empleado = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del empleado:");
            nombres[i] = sc.nextLine();

            System.out.println("Sueldo:");
            sueldos[i] = sc.nextDouble();
            sc.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                empleado = i;
            }
        }

        System.out.println("El empleado que más gana es " + nombres[empleado] + " y gana " + mayorSueldo);

        // Ejercicio 9: Método para llenar un array de enteros con números aleatorios. (Paula)
        Random rand = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100 - 0 + 1) + 1;
        }

        System.out.println("Números aleatorios:");
        System.out.println(Arrays.toString(arr));

        // Ejercicio 10: Programa Java para sumar dos matrices de número enteros. 
        System.out.println("Ingresa la primer dimension de las matrices");
        int n1 = sc.nextInt();
        System.out.println("Ingresa la segunda dimension de las matrices");
        int n2 = sc.nextInt();
        int[][] matrizA = new int[n1][n2];
        int[][] matrizB = new int[n1][n2];
        int[][] matrizC = new int[n1][n2];

        // Rellenamos la primer matriz
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.printf("Ingresa numero para la posicion[%d][%d] de la matriz A:%n", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }

        // Rellenamos la segunda matriz
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.printf("Ingresa numero para la posicion[%d][%d] de la matriz B:%n", i, j);
                matrizB[i][j] = sc.nextInt();
            }
        }

        // Rellenamos la matriz C, con la suma de la matriz A y la matriz B
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B");
        mostrarMatriz(matrizB);

        System.out.println("Matriz C");
        mostrarMatriz(matrizC);

        // Ejercicio 11: Programa Java para obtener la matriz transpuesta de una matriz.
        System.out.println("Ingrese el número de filas:");
        int filasM = sc.nextInt();

        System.out.println("Ingrese el número de columnas:");
        int columnasM = sc.nextInt();

        int[][] M = new int[filasM][columnasM];

        leerDatos(M);

        System.out.println("Matriz original");
        mostrarMatriz(M);

        int[][] T = matrizTranspuesta(M);

        System.out.println("Matriz transpuesta");
        mostrarMatriz(T);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void leerDatos(int[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de datos de la matriz:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "]=");
                M[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] matrizTranspuesta(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
}
