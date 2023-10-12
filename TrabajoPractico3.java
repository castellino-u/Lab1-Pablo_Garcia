import java.util.Scanner;

public class TrabajoPractico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1: Ingrese un número para saber si es par o impar: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es par");
        } else {
            System.out.println("El número " + num1 + " es impar");
        }

        // Ejercicio 2
        System.out.println("\nEjercicio 2: Ingresa un número para verificar si es múltiplo de 10: ");
        int num2 = sc.nextInt();
        if (num2 % 10 == 0) {
            System.out.println(num2 + " es múltiplo de 10");
        } else {
            System.out.println(num2 + " no es múltiplo de 10");
        }

        // Ejercicio 3
        System.out.println("\nEjercicio 3: Ingresar una letra para verificar si es mayúscula: ");
        String letra = sc.next();
        if (letra.length() == 1 && Character.isUpperCase(letra.charAt(0))) {
            System.out.println("La letra ingresada es una letra MAYÚSCULA");
        } else {
            System.out.println("La letra ingresada es MINÚSCULA o no es válida");
        }

        // Ejercicio 4
        System.out.println("\nEjercicio 4: Ingrese dos números para verificar si son iguales: ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num3 == num4) {
            System.out.println(num3 + " y " + num4 + " son iguales");
        } else {
            System.out.println(num3 + " y " + num4 + " son distintos");
        }

        // Ejercicio 5
        System.out.println("\nEjercicio 5: Ingrese dos números para verificar cuál es mayor: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        if (num5 > num6) {
            System.out.println(num5 + " es mayor que " + num6);
        } else if (num6 > num5) {
            System.out.println(num6 + " es mayor que " + num5);
        } else {
            System.out.println("Ambos números son iguales");
        }

        // Ejercicio 6
        System.out.println("\nEjercicio 6: Ingrese dos números para verificar si tienen la misma última cifra: ");
        int num7 = sc.nextInt() % 10;
        int num8 = sc.nextInt() % 10;
        if (num7 == num8) {
            System.out.println("Ambos números tienen la misma última cifra.");
        } else {
            System.out.println("Los números tienen diferentes últimas cifras.");
        }

        // Ejercicio 7
        System.out.println("\nEjercicio 7: Ingrese un número para verificar si es múltiplo de 3 y 5: ");
        int num9 = sc.nextInt();
        if (num9 % 3 == 0 && num9 % 5 == 0) {
            System.out.println("El número " + num9 + " es múltiplo de 3 y 5.");
        } else {
            System.out.println("El número " + num9 + " NO es múltiplo de 3 y 5.");
        }

        // Ejercicio 8
        System.out.println("\nEjercicio 8: Ingrese un número para verificar si es múltiplo de 2 o 3: ");
        int num10 = sc.nextInt();
        if (num10 % 2 == 0 || num10 % 3 == 0) {
            System.out.println("El número " + num10 + " es múltiplo de 2 o 3.");
        } else {
            System.out.println("El número " + num10 + " NO es múltiplo de 2 o 3.");
        }

        // Ejercicio 9
        System.out.println("\nEjercicio 9: Ingrese dos caracteres para verificar si son iguales: ");
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        if (char1 == char2) {
            System.out.println(char1 + " y " + char2 + " son iguales.");
        } else {
            System.out.println(char1 + " y " + char2 + " son distintos.");
        }

        // Ejercicio 10
        System.out.println("\nEjercicio 10: Ingrese dos letras para verificar si son minúsculas: ");
        char letter1 = sc.next().charAt(0);
        char letter2 = sc.next().charAt(0);
        if (Character.isLowerCase(letter1) && Character.isLowerCase(letter2)) {
            System.out.println("Ambas letras son minúsculas.");
        } else {
            System.out.println("Al menos una de las letras NO es minúscula.");
        }

        // Ejercicio 11
        System.out.println("\nEjercicio 11: Ingrese un carácter para verificar si es un dígito numérico (cifra entre 0 y 9): ");
        char character = sc.next().charAt(0);
        if (Character.isDigit(character)) {
            System.out.println("Es un dígito numérico.");
        } else {
            System.out.println("No es un dígito numérico.");
        }

        // Ejercicio 12
        System.out.println("\nEjercicio 12: Ingrese dos números para calcular su división (el divisor no puede ser cero): ");
        double num11 = sc.nextDouble();
        double num12;
        do {
            num12 = sc.nextDouble();
            if (num12 == 0) {
                System.out.println("El divisor no puede ser cero. Ingrese otro valor.");
            }
        } while (num12 == 0);
        double divisionResult = num11 / num12;
        System.out.println("El resultado de la división es: " + divisionResult);

        // Ejercicio 13
        System.out.println("\nEjercicio 13: Ingrese un año para verificar si es bisiesto: ");
        int year = sc.nextInt();
        String result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "Es un año bisiesto." : "No es un año bisiesto.";
        System.out.println(year + " " + result);

        // Ejercicio 14
        System.out.println("\nEjercicio 14: Ingrese un número de tres cifras para verificar si es capicúa: ");
        int num13 = sc.nextInt();
        if (num13 >= 100 && num13 <= 999) {
            int primerCifra = num13 / 100;
            int ultimaCifra = num13 % 10;
            if (primerCifra == ultimaCifra) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        } else {
            System.out.println("El número ingresado no tiene tres cifras.");
        }

        // Ejercicio 15
        System.out.println("\nEjercicio 15: Ingrese horas, minutos y segundos para verificar si es una hora válida: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        if (horas >= 0 && horas <= 24 && minutos >= 0 && minutos <= 60 && segundos >= 0 && segundos <= 60) {
            System.out.println("La hora ingresada es: " + horas + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("Los valores ingresados para la hora no son válidos.");
        }

        // Ejercicio 16
        System.out.println("\nEjercicio 16: Ingrese un número de mes (1 a 12) para conocer la cantidad de días: ");
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días.");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días.");
                break;
            default:
                System.out.println("Mes no válido. Ingrese un número del 1 al 12.");
                break;
        }

        // Ejercicio 17
        System.out.println("\nEjercicio 17: Ingrese una calificación numérica (0-10) para obtener su equivalente alfabético: ");
        int calificacion = sc.nextInt();
        if (calificacion >= 0 && calificacion <= 10) {
            switch (calificacion) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Calificación alfabética: Insuficiente");
                    break;
                case 5:
                    System.out.println("Calificación alfabética: Suficiente");
                    break;
                case 6:
                    System.out.println("Calificación alfabética: Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Calificación alfabética: Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Calificación alfabética: Sobresaliente");
                    break;
            }
        } else {
            System.out.println("Calificación no válida. Ingrese un número del 0 al 10.");
        }

        // Ejercicio 18
        System.out.println("\nEjercicio 18: Mostrar números del 1 al 100 utilizando while: ");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // Ejercicio 19
        System.out.println("\nEjercicio 19: Mostrar números del 1 al 100 utilizando do-while: ");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 100);

        // Ejercicio 20
        System.out.println("\nEjercicio 20: Mostrar números del 1 al 100 utilizando for: ");
        for (int k = 1; k <= 100; k++) {
            System.out.println(k);
        }

        // Ejercicio 21
        System.out.println("\nEjercicio 21: Mostrar números del 100 al 1 utilizando while: ");
        int l = 100;
        while (l >= 1) {
            System.out.println(l);
            l--;
        }

        // Ejercicio 22
        System.out.println("\nEjercicio 22: Mostrar números del 100 al 1 utilizando do-while: ");
        int m = 100;
        do {
            System.out.println(m);
            m--;
        } while (m >= 1);

        // Ejercicio 23
        System.out.println("\nEjercicio 23: Mostrar números del 100 al 1 utilizando for: ");
        for (int n = 100; n >= 1; n--) {
            System.out.println(n);
            // Ejercicio 24
            System.out.println("\nEjercicio 24: Mostrar números del 1 al N (ingresado por el usuario): ");
            System.out.print("Ingrese un número N: ");
            int numberN = sc.nextInt();
            for (int o = 1; o <= numberN; o++) {
                System.out.println(o);
            }

        }
        // Ejercicio 25
        System.out.println("\nEjercicio 25: Mostrar números desde N hasta 1 (ingresado por el usuario): ");
        System.out.print("Ingrese un número N: ");
        int numberN2 = sc.nextInt();
        while (numberN2 >= 1) {
            System.out.println(numberN2);
            numberN2--;
        }

        // Ejercicio 26
        System.out.println("\nEjercicio 26: Mostrar números entre dos números A y B (A < B): ");
        int A, B;
        do {
            System.out.print("Ingrese un número A: ");
            A = sc.nextInt();
            System.out.print("Ingrese un número B (mayor que A): ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("El valor de A debe ser menor que B. Intente nuevamente.");
            }
        } while (A >= B);

        for (int p = A; p <= B; p++) {
            System.out.println(p);
        }

        // Ejercicio 27
        System.out.println("\nEjercicio 27: Mostrar números pares entre dos números A y B (A < B): ");
        int A2, B2;
        do {
            System.out.print("Ingrese un número A: ");
            A2 = sc.nextInt();
            System.out.print("Ingrese un número B (mayor que A): ");
            B2 = sc.nextInt();
            if (A2 >= B2) {
                System.out.println("El valor de A debe ser menor que B. Intente nuevamente.");
            }
        } while (A2 >= B2);

        for (int q = A2; q <= B2; q++) {
            if (q % 2 == 0) {
                System.out.println(q);
            }
        }

        // Ejercicio 28
        System.out.println("\nEjercicio 28: Mostrar múltiplos de N entre 1 y M (N < M): ");
        int N, M;
        do {
            System.out.print("Ingrese un número N: ");
            N = sc.nextInt();
            System.out.print("Ingrese un número M (mayor que N): ");
            M = sc.nextInt();
            if (N >= M) {
                System.out.println("El valor de N debe ser menor que M. Intente nuevamente.");
            }
        } while (N >= M);

        System.out.println("Los múltiplos de " + N + " entre 1 y " + M + " son:");
        for (int r = 1; r <= M; r++) {
            if (r % N == 0) {
                System.out.println(r);
            }
        }

        // Ejercicio 29
        System.out.println("\nEjercicio 29: Conversión de millas a kilómetros (Ingrese 0 para salir): ");
        do {
            System.out.print("Ingrese una cantidad de millas: ");
            double millas = sc.nextDouble();
            if (millas != 0) {
                double kilometros = millas * 1.60934;
                System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
            } else {
                System.out.println("Saliendo del programa.");
            }
        } while (true);
    }
}

