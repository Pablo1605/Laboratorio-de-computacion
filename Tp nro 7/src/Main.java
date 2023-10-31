import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        Integer [] enteros = {2,1,5,3,4,9,8,6,10,7};
        Arrays.sort(enteros);
        for (int n : enteros) {
            System.out.println(n);
        }

        //2
        Arrays.sort(enteros, Collections.reverseOrder());
        for (int n : enteros) {
            System.out.println(n);
        }

        //3
        Double [] flotantes = {3.13,1.89,2.71,5.55,9.23,7.62,6.26,4.38,8.97,0.99};
        Arrays.sort(flotantes);
        for (double n : flotantes) {
            System.out.println(n);
        }

        //4
        Arrays.sort(flotantes,Collections.reverseOrder());
        for (double n : flotantes) {
            System.out.println(n);
        }

        //5
        String [] cadenas = {"Dado","Java","Amarillo","Hola","Buho","Gato","Foca","Isla","Esmeralda","Carta"};
        Arrays.sort(cadenas);
        for (String c : cadenas) {
            System.out.println(c);
        }

        //6
        Arrays.sort(cadenas, Collections.reverseOrder());
        for (String c : cadenas) {
            System.out.println(c);
        }

        //7
        System.out.println();
        Persona[] personas = {
                new Persona("Carlos", 30),
                new Persona("Ana", 25),
                new Persona("Pedro", 35)
        };

        Arrays.sort(personas);

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }

        for (Persona persona : personas) {
            System.out.println(persona);
        }

        //8
        System.out.println();
        Producto[] productos = {
                new Producto("Producto A", 50.0),
                new Producto("Producto B", 30.0),
                new Producto("Producto C", 70.0)
        };

        Arrays.sort(productos);

        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }

        //9
        int n = enteros.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (enteros[j] > enteros[j+1]) {
                    int temp = enteros[j];
                    enteros[j] = enteros[j+1];
                    enteros[j+1] = temp;
                }
            }
        }
        for (int num : enteros) {
            System.out.print(num + " ");
        }

        //10
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (enteros[j] < enteros[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = enteros[i];
            enteros[i] = enteros[minIndex];
            enteros[minIndex] = aux;
        }
        for (int num : enteros) {
            System.out.print(num + " ");
        }

        //11
        System.out.println();
        for (int i = 1; i < n; i++) {
            int aux = enteros[i];
            int j = i - 1;
            while (j>=0 && enteros[j] > aux) {
                enteros[j + 1] = enteros[j];
                j = j - 1;
            }
            enteros[j+1] = aux;
        }
        for (int num : enteros) {
            System.out.print(num + " ");
        }

        //12
        System.out.println();
        int [] enteros1 = {2,1,5,3,4,9,8,6,10,7};
        ordenamiento_por_mezcla(enteros1);
        for (int num : enteros) {
            System.out.print(num + " ");
        }

        //13
        System.out.println();
        boolean cambios;
        int i,aux;
        for (int salto = n/2; salto != 0 ; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < n;i++) {
                    if (enteros[i - salto] > enteros[i]) {
                        aux = enteros[i];
                        enteros[i] = enteros[i-salto];
                        enteros[i-salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        for (int num : enteros) {
            System.out.print(num + " ");
        }
        //14
        System.out.println();
        int [] array1 = new int[20];
        for (i = 0; i < 20; i++) {
            System.out.print("Ingrese el valor "+i+" del array: ");
            array1[i] = sc.nextInt();
        }
        System.out.print("Array original: ");
        mostrarArray(array1);
        System.out.println("¿Como deseas ordenar el array?[ASCENDENTE/DESCENDENTE]: ");
        String tipoOrden = sc.next().toUpperCase();
        System.out.println("¿Que metodo de ordenamiento desea?[INSERCION/BURBUJA/SELECCION]: ");
        String metodoOrdenamiento = sc.next().toUpperCase();
        tipoOrden = tipoOrden.toUpperCase();
        metodoOrdenamiento = metodoOrdenamiento.toUpperCase();
        if (metodoOrdenamiento.equals("INSERCION")) {
            if (tipoOrden.equals("ASCENDENTE")) {
                insercionAscendente(array1);
            } else {
                insercionDescendente(array1);
            }
        } else if (metodoOrdenamiento.equals("BURBUJA")) {
            if (tipoOrden.equals("ASCENDENTE")) {
                burbujaAscendente(array1);
            } else {
                burbujaDescendente(array1);
            }
        } else if (metodoOrdenamiento.equals("SELECCION")) {
            if (tipoOrden.equals("ASCENDENTE")) {
                seleccionAscendente(array1);
            } else {
                seleccionDescendente(array1);
            }
        } else {
            System.out.println("Opción de método de ordenamiento no válida.");
            return;
        }
        System.out.println("Array ordenado:");
        mostrarArray(array1);
    }
    //12
    public static void ordenamiento_por_mezcla(int[] enteros) {
        if (enteros.length <= 1) {
            return;
        }
        int medio = enteros.length / 2;
        int[] izquierda = new int[medio];
        int[] derecha = new int[enteros.length - medio];
        System.arraycopy(enteros,0,izquierda,0,medio);
        System.arraycopy(enteros,medio,derecha,0,enteros.length-medio);
        ordenamiento_por_mezcla(izquierda);
        ordenamiento_por_mezcla(derecha);
        merge(enteros,izquierda,derecha);
    }
    public static void merge(int[] enteros,int[] izquierda,int[] derecha){
        int i = 0,j = 0,k = 0;
        while (i < izquierda.length && j < derecha.length) {
            if (derecha[i] <= derecha[j]) {
                enteros[k++] = izquierda[i++];
            } else {
                enteros[k++] = derecha[j++];
            }
        }
        while (i < izquierda.length) {
            enteros[k++] = izquierda[i++];
        }
        while (j < derecha.length) {
            enteros[k++] = derecha[j++];
        }
    }
    //14
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void insercionAscendente(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void insercionDescendente(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void burbujaAscendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void burbujaDescendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void seleccionAscendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void seleccionDescendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    //7
    class MiClase implements Comparable<MiClase> {
        private int valor;

        // Constructor, getters, setters y otros métodos

        @Override
        public int compareTo(MiClase otra) {
            return Integer.compare(this.valor, otra.valor);
        }
    }
}

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.getNombre());
    }
}
//8
class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.getPrecio());
    }
}