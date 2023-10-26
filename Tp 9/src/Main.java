import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(5);
        enteros.add(10);
        enteros.add(15);
        enteros.add(20);
        enteros.add(25);

        //Ejercicio 2
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pablo");
        nombres.add("Nazareno");
        nombres.add("Facundo");
        nombres.add("Goku");

        //Ejercicio 3
        for (int numero : enteros) {
            System.out.println(numero);
        }

        //Ejercicio 4
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        int longitud = caracteres.size();
        System.out.println("La longitud del ArrayList de caracteres es de "+longitud);


        //Ejercicio 5
        nombres.remove("Goku");

        //Ejercicio 6
        ArrayList<Integer> vacio = new ArrayList<>();
        boolean estaVacio = vacio.isEmpty();
        if (estaVacio) {
            System.out.println("El ArrayList está vacio");
        } else {
            System.out.println("El ArrayList no está vacio");
        }

        //Ejercicio 7
        int maximo = enteros.get(0);
        for (int i = 1; i < enteros.size(); i++) {
            if (enteros.get(i) > maximo) {
                maximo = enteros.get(i);
            }
        }
        System.out.println("El elemento más grande del ArrayList es: " + maximo);

        //Ejercicio 8
        ArrayList<Integer> copia = new ArrayList<>(enteros);

        //Ejercicio 9
        Collections.reverse(enteros);

        //Ejercicio 10
        ArrayList<Integer> enteros1 = new ArrayList<>();
        enteros.add(30);
        enteros.add(35);
        enteros.add(40);
        enteros.add(45);
        enteros.add(50);
        ArrayList<Integer> arraysCombinados = new ArrayList<>();
        arraysCombinados.addAll(enteros);
        arraysCombinados.addAll(enteros1);

        //Ejercicio 11
        ArrayList<Integer> enteros2 = new ArrayList<>();
        enteros2.add(1);
        enteros2.add(2);
        enteros2.add(3);
        enteros2.add(4);
        enteros2.add(5);
        enteros2.add(6);
        enteros2.removeIf(numero -> numero % 2 == 0);

        //Ejercicio 12
        String elementoABuscar = "Pablo";
        int indice = nombres.indexOf(elementoABuscar);
        System.out.println("El elemento '"+elementoABuscar+"' se encuentra en el indice "+indice);

        //Ejercicio 13
        boolean sonIguales = enteros.equals(enteros1);
        if (sonIguales) {
            System.out.println("Los ArrayList son iguales");
        } else {
            System.out.println("Los ArrayList no son iguales");
        }

        //Ejercicio 14
        int minimo = enteros.get(0);
        for (int i = 1; i < enteros.size(); i++) {
            if (enteros.get(i) > minimo) {
                minimo = enteros.get(i);
            }
        }

        //Ejercicio 15
        ArrayList<Integer> enteros3 = new ArrayList<>();
        enteros3.add(1);
        enteros3.add(2);
        enteros3.add(3);
        enteros3.add(4);
        enteros3.add(5);
        int suma = 0;
        for (int numero : enteros3) {
            suma += numero;
        }

        //Ejercicio 16
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add(" ");
        cadenas.add("Mundo");
        cadenas.add(" ");
        cadenas.add("que ");
        cadenas.add("tal");
        StringBuilder concatenadas = new StringBuilder();
        for (String cadena : cadenas) {
            concatenadas.append(cadena);
        }
        String resultado = concatenadas.toString();

        //Ejercicio 17
        ArrayList<String> cadenas1 = new ArrayList<>();
        cadenas1.add("Hola");
        cadenas1.add("Laboratorio");
        cadenas1.add("Hola");
        cadenas1.add("Goku");
        cadenas1.add("Laboratorio");
        cadenas1.add("Messi");
        HashSet<String> arraySinDuplicados = new HashSet<>();

        //Ejercicio 18
        int sumaPares = 0;
        for (int numero : enteros3) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }

        //Ejercicio 19
        int numABuscar = 4;
        boolean aparece = enteros3.contains(numABuscar);
        if (aparece) {
            System.out.println("El números " + numABuscar + " aparece en el ArrayList");
        } else {
            System.out.println("El números " + numABuscar + " no aparece en el ArrayList");
        }

        //Ejercicio 20
        String masLargo = "";
        for (String cadena : cadenas1) {
            if (cadena.length() > masLargo.length()) {
                masLargo = cadena;
            }
        }

        //Ejercicio 21
        int sumaEnteros3 = 0;
        for (int num : enteros3) {
            sumaEnteros3 += num;
        }
        double promedio = (double) sumaEnteros3 / enteros3.size();

        //Ejercicio 22
        ArrayList<Integer> enteros4 = new ArrayList<>();
        enteros3.add(4);
        enteros3.add(2);
        enteros3.add(5);
        enteros3.add(1);
        enteros3.add(3);
        Collections.sort(enteros4);

        //Ejercicio 23
        int limite = 3;
        for (int num : enteros4) {
            if (num > limite) {
                enteros4.remove(num);
            }
        }

        //Ejercicio 24
        int contador = 0;
        String cadenaAEncontrar = "Hola";
        for (String cadena : cadenas1) {
            if (cadena == cadenaAEncontrar) {
                contador += 1;
            }
        }

        //Ejercicio 25
        ArrayList<String> cadenas2 = new ArrayList<>();
        cadenas2.add("Dado");
        cadenas2.add("Auto");
        cadenas2.add("Casa");
        cadenas2.add("Eso");
        cadenas2.add("Bordo");
        cadenas2.add("Foca");
        Collections.sort(cadenas2);
    }
}