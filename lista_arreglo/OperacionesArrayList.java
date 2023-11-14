package lista_arreglo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OperacionesArrayList {

    public static void main(String[] args) {
        // Ejemplo 1: Crear un ArrayList de números enteros y agregar 5 números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(10);
        numeros.add(3);
        numeros.add(6);

        // Ejemplo 2: Crear un ArrayList de cadenas y agregar 3 nombres
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paula");
        nombres.add("Thomas");
        nombres.add("Uriel");

        // Ejemplo 3: Imprimir todos los elementos de un ArrayList de enteros
        ArrayList<Integer> numerosImprimir = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 4, 8));
        System.out.println(numerosImprimir);

        // Ejemplo 4: Encontrar la longitud de un ArrayList de cadenas
        ArrayList<String> palabras = new ArrayList<String>(Arrays.asList("hola", "chau", "mañana", "hoy"));
        System.out.println("La longitud del array es : " + palabras.size());

        // Ejemplo 5: Eliminar un elemento específico de un ArrayList de cadenas
        ArrayList<String> listaEliminar = new ArrayList<String>();
        listaEliminar.add("Manzana");
        listaEliminar.add("Platano");
        listaEliminar.add("Maracuya");
        listaEliminar.add("Banana");
        listaEliminar.remove("Manzana");
        System.out.println(listaEliminar);

        // Ejemplo 6: Comprobar si un ArrayList de números enteros está vacío
        ArrayList<String> listaVacia = new ArrayList<String>(Arrays.asList("Pepe", "Tito", "Calderon"));
        if (listaVacia.isEmpty()) {
            System.out.println("El ArrayList está vacío");
        } else {
            System.out.println("El ArrayList no está vacío");
        }

        // Ejemplo 7: Encontrar el elemento más grande en un ArrayList de números
        ArrayList<Integer> listaMayor = new ArrayList<Integer>(Arrays.asList(100, 2, 3, 4));
        int mayor = listaMayor.get(0);
        for (int item : listaMayor) {
            if (item > mayor) {
                mayor = item;
            }
        }
        System.out.println(mayor);

        // Ejemplo 8: Copiar todos los elementos de un ArrayList a otro
        ArrayList<Integer> listaCopiar = new ArrayList<Integer>(Arrays.asList(100, 2, 3, 4));
        ArrayList<Integer> listaVaciaCopiada = new ArrayList<Integer>();
        for (int item : listaCopiar) {
            listaVaciaCopiada.add(item);
        }
        System.out.println(listaVaciaCopiada);

        // Ejemplo 9: Invertir un ArrayList de enteros
        ArrayList<Integer> listaInvertida = new ArrayList<Integer>(Arrays.asList(9, 6, 3, 8, 5, 2, 7, 4, 1));
        Integer add;
        for (int i = listaInvertida.size() - 1; i >= 0; i--) {
            add = listaInvertida.get(i);
            listaInvertida.remove(i);
            listaInvertida.add(add);
        }
        System.out.println(listaInvertida);

        // Ejemplo 10: Combinar dos ArrayLists de enteros en uno solo
        ArrayList<Integer> listaCombinada1 = new ArrayList<Integer>(Arrays.asList(100, 2, 3, 4));
        ArrayList<Integer> listaCombinada2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 70, 0));
        for (int item : listaCombinada1) {
            listaCombinada2.add(item);
        }
        Collections.sort(listaCombinada2);
        System.out.println(listaCombinada2);

        // ... Resto de los ejemplos
    }
}
