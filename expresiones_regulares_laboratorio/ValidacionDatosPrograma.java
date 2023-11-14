package expresiones_regulares_laboratorio;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionDatosPrograma {

    public static void main(String[] args) {
        // Creación de un conjunto de datos ficticio
        ArrayList<String> conjuntoDatos = new ArrayList<>();
        conjuntoDatos.add("uriel1998@yahoo.com");
        conjuntoDatos.add("marianela999@gmail.com");
        conjuntoDatos.add("orne67@gmail.com");
        conjuntoDatos.add("paulageier@outlook.com");
        conjuntoDatos.add("1123@122.c");
        conjuntoDatos.add("44-900-777");
        conjuntoDatos.add("aaa111");
        // Agrega más datos según sea necesario

        // Validación de datos utilizando expresiones regulares
        for (String dato : conjuntoDatos) {
            validarDatos(dato);
        }

        // Ejercicios
        comprobarCadenaNoAcabaConDigito("cadena123");
        comprobarCadenaNoEmpiezaConDigito("123cadena");
        comprobarCadenaLongitud("ABCDE");
        validarDNI("12-345-678");
        guardarMailsValidosEnArrayList(conjuntoDatos);
        comprobarCadenaContieneABC("xyzabc123");
    }

    // Método para validar y verificar datos usando expresiones regulares
    private static void validarDatos(String dato) {
        // Ejemplo de expresión regular para validar un correo electrónico
        String regexCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Compila el patrón de expresión regular
        Pattern pattern = Pattern.compile(regexCorreo);
        // Crea un objeto Matcher
        Matcher matcher = pattern.matcher(dato);

        // Realiza la validación
        if (matcher.matches()) {
            System.out.println("Dato válido: " + dato);
        } else {
            System.out.println("Dato no válido: " + dato);
        }
    }

    // Ejercicio: Comprobar si el String cadena no acaba con un dígito
    private static void comprobarCadenaNoAcabaConDigito(String cadena) {
        if (!cadena.matches(".*\\d$")) {
            System.out.println("La cadena no acaba con un dígito.");
        } else {
            System.out.println("La cadena acaba con un dígito.");
        }
    }

    // Ejercicio: Comprobar si el String cadena no empieza por un dígito
    private static void comprobarCadenaNoEmpiezaConDigito(String cadena) {
        if (!cadena.matches("^\\D.*")) {
            System.out.println("La cadena no empieza por un dígito.");
        } else {
            System.out.println("La cadena empieza por un dígito.");
        }
    }

    // Ejercicio: Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10
    private static void comprobarCadenaLongitud(String cadena) {
        if (cadena.matches("^[a-zA-Z]{5,10}$")) {
            System.out.println("La cadena cumple con la longitud especificada.");
        } else {
            System.out.println("La cadena no cumple con la longitud especificada.");
        }
    }

    // Ejercicio: Validar el ingreso de un DNI (xx-xxx-xxx)
    private static void validarDNI(String dni) {
        if (dni.matches("^\\d{2}-\\d{3}-\\d{3}$")) {
            System.out.println("DNI válido: " + dni);
        } else {
            System.out.println("DNI no válido: " + dni);
        }
    }

    // Ejercicio: Guardar en un ArrayList una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares
    private static void guardarMailsValidosEnArrayList(ArrayList<String> conjuntoDatos) {
        ArrayList<String> mailsValidos = new ArrayList<>();

        for (String dato : conjuntoDatos) {
            if (dato.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                mailsValidos.add(dato);
            }
        }

        System.out.println("Correos electrónicos válidos en el conjunto de datos: " + mailsValidos);
    }

    // Ejercicio: Comprobar si el String cadena contiene “abc”
    private static void comprobarCadenaContieneABC(String cadena) {
        if (cadena.contains("abc")) {
            System.out.println("La cadena contiene 'abc'.");
        } else {
            System.out.println("La cadena no contiene 'abc'.");
        }
    }
}
