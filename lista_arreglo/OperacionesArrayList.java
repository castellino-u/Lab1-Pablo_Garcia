package lista_arreglo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OperacionesArrayList {

    public static void main(String[] args) {
        // Ejercicio 1
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(10);
        numeros.add(3);
        numeros.add(6);

        // Ejercicio 2
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Paula", "Thomas", "Uriel"));

        // Ejercicio 3
        System.out.println(numeros);

        // Ejercicio 4
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("hola", "chau", "mañana", "hoy"));
        System.out.println("La longitud del array es : " + palabras.size());

        // Ejercicio 5
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Manzana", "Platano", "Maracuya", "Banana"));
        lista.remove("Manzana");
        System.out.println(lista);

        // Ejercicio 6
        ArrayList<String> listaVacia = new ArrayList<>(Arrays.asList("Pepe", "Tito", "Calderon"));
        if (listaVacia.isEmpty()) {
            System.out.println("El ArrayList está vacio");
        } else {
            System.out.println("El ArrayList no está vacio");
        }

        // Ejercicio 7
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(100, 2, 3, 4));
        int mayor = listaNumeros.get(0);
        for (int item : listaNumeros) {
            if (item > mayor) {
                mayor = item;
            }
        }
        System.out.println(mayor);

        // Ejercicio 8
        ArrayList<Integer> listaOriginal = new ArrayList<>(Arrays.asList(100, 2, 3, 4));
        ArrayList<Integer> listaNueva = new ArrayList<>();
        for (int item : listaOriginal) {
            listaNueva.add(item);
        }
        System.out.println(listaNueva);

        // Ejercicio 9
        ArrayList<Integer> aInv = new ArrayList<>(Arrays.asList(9, 6, 3, 8, 5, 2, 7, 4, 1));
        Collections.reverse(aInv);
        System.out.println(aInv);

        // Ejercicio 10
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(100, 2, 3, 4));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 70, 0));
        lista2.addAll(lista1);
        Collections.sort(lista2);
        System.out.println(lista2);

        // Ejercicio 11
        ArrayList<Integer> numerosPares = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 8, 7));
        int recorrer = numerosPares.size();
        for (int i = 0; i < recorrer; i++) {
            if (numerosPares.get(i) % 2 == 0) {
                numerosPares.remove(i);
                recorrer -= 1;
                i--;
            }
        }
        System.out.println(numerosPares);

        // Ejercicio 12
        ArrayList<String> listaBusqueda = new ArrayList<>(Arrays.asList("Hola", "Fresa", "Cacao", "Banana"));
        int busquedaIndice = listaBusqueda.indexOf("Bobo");
        if (busquedaIndice != -1) {
            System.out.println("El indice de la palabra es: " + busquedaIndice);
        } else {
            System.out.println("El elemento no existe en el indice");
        }

        // Ejercicio 13
        ArrayList<Integer> listaSame1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> listaSame2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        boolean iguales = listaSame1.equals(listaSame2);
        if (iguales) {
            System.out.println("Las listas son iguales");
        } else {
            System.out.println("Las listas no son iguales");
        }

        // Ejercicio 14
        ArrayList<Integer> listaMenor = new ArrayList<>(Arrays.asList(4444, 5, 69, 8, -500));
        int menor = Collections.min(listaMenor);
        System.out.println("El menor número del array es: " + menor);

        // Ejercicio 15
        ArrayList<Integer> listaSuma = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 80));
        int suma = 0;
        for (int item : listaSuma) {
            suma += item;
        }
        System.out.println(suma);

        // Ejercicio 16
        ArrayList<String> listaConcat = new ArrayList<>(Arrays.asList("Hola", "Fresa", "Cacao", "Banana"));
        StringBuilder sumaString = new StringBuilder();
        for (String item : listaConcat) {
            sumaString.append(item);
        }
        System.out.println(sumaString);

        // Ejercicio 17
        ArrayList<String> listaDuplicados = new ArrayList<>(Arrays.asList("Hola", "Hola"));
        ArrayList<String> listaSinDuplicados = new ArrayList<>();

        for (String item : listaDuplicados) {
            if (!listaSinDuplicados.contains(item)) {
                listaSinDuplicados.add(item);
            }
        }

        System.out.println(listaSinDuplicados);


        // Ejercicio 18
        ArrayList<Integer> oddArray = new ArrayList<>(Arrays.asList(1, 5, 8, 6, 2, 7, 1, 1, 8));
        int oddSum = 0;
        for (int i = 0; i < oddArray.size(); i += 2) {
            oddSum += oddArray.get(i);
        }
        System.out.println("La suma de los indices pares del array es: " + oddSum);

        // Ejercicio 19
        ArrayList<Integer> numerosBuscar = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 8, 7));
        int numeroBuscar = 8;
        boolean encontrado = numerosBuscar.contains(numeroBuscar);
        if (encontrado) {
            System.out.println("Numero encontrado: " + numeroBuscar);
        } else {
            System.out.println("Numero no encontrado");
        }

        // Ejercicio 20 
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("a", "queso", "hamburguesa", "galleta", "Rodrigo"));

        String masLarga = null;
        int longitudMaxima = 0;

        for (String palabra : strArray) {
            if (palabra.length() > longitudMaxima) {
                masLarga = palabra;
                longitudMaxima = palabra.length();
            }
        }

        System.out.println("La palabra más larga del array es: " + masLarga);


        // Ejercicio 21
        ArrayList<Integer> enterosPromedio = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        double promedio = enterosPromedio.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("El promedio del array es: " + promedio);

        // Ejercicio 22
        ArrayList<Integer> enterosOrdenados = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        Collections.sort(enterosOrdenados);
        System.out.println(enterosOrdenados);

        // Ejercicio 23
        ArrayList<Integer> enterosMenores = new ArrayList<>(Arrays.asList(15, 48, 32, 64, 79, 12, 54, 451, 50, 20, 21, 1, 6, 58));
        enterosMenores.removeIf(n -> n > 50);
        System.out.println(enterosMenores);

        // Ejercicio 24
        ArrayList<String> cadenasAlfabeticas = new ArrayList<>(Arrays.asList("lengua", "manzana", "vacío", "molleja", "bicep", "pechuga", "arcoiris"));
        Collections.sort(cadenasAlfabeticas);
        System.out.println(cadenasAlfabeticas);

        
        // Ejercicio 25
        ArrayList<String> repeatArray = new ArrayList<>(Arrays.asList("a", "b", "a", "uva", "uva", "manzana", "uva"));
        String search = "uva";
        long count = repeatArray.stream().filter(s -> s.equals(search)).count();
        System.out.println("El elemento (" + search + ") se repite " + count + " veces");


    }
}
