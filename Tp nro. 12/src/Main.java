import java.util.ArrayList;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        //2
        ArrayList<String> datos = new ArrayList<>();
        datos.add("usuario1@email.com");
        datos.add("usuario2email.com");
        datos.add("1234567890");
        datos.add("9876543210");
        datos.add("usuario3@email.com");
        //3
        for (String dato : datos) {
            if (ValidacionDatos.validarCorreo(dato)) {
                System.out.println(dato + " es una dirección de correo válida.");
            } else if (ValidacionDatos.validarTelefono(dato)) {
                System.out.println(dato + " es un número de teléfono válido.");
            } else {
                System.out.println(dato + " no es una dirección de correo ni un número de teléfono válido.");
            }
        }

        //5
        //a
        String cadena = "Hola123";
        boolean noTerminaConDigito = !cadena.matches(".*\\d$");
        System.out.println("La cadena no termina con un dígito: " + noTerminaConDigito);

        //b
        String cadena1 = "AbCdEf";
        boolean cumpleLongitud = cadena1.matches("[a-zA-Z]{5,10}");
        System.out.println("La cadena cumple con la longitud especificada: " + cumpleLongitud);

        //c
        String cadena2 = "AbCdEf";
        boolean cumpleLongitud1 = cadena2.matches("[a-zA-Z]{5,10}");
        System.out.println("La cadena cumple con la longitud especificada: " + cumpleLongitud1);

        //d
        String dni = "12-345-678";
        boolean esDNIValido = dni.matches("\\d{2}-\\d{3}-\\d{3}");
        System.out.println("El DNI ingresado es válido: " + esDNIValido);

        //e
        ArrayList<String> listaEmails = new ArrayList<>();
        String email1 = "usuario1@email.com";
        String email2 = "invalidEmail";

        if (email1.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            listaEmails.add(email1);
        }
        if (email2.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            listaEmails.add(email2);
        }

        System.out.println("Lista de emails válidos: " + listaEmails);

        //f
        String cadena3 = "defabcghi";
        boolean contieneABC = cadena3.matches(".*abc.*");
        System.out.println("La cadena contiene 'abc': " + contieneABC);
    }
}
//3
class ValidacionDatos {
    public static boolean validarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public static boolean validarTelefono(String telefono) {
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }
}