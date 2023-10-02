import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
                contadorPositivos++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                sumaNegativos = sumaNegativos + numeros[i];
                contadorNegativos++;
            }
        }
        if (contadorPositivos > 0) {
            double mediaPositivos = sumaPositivos / contadorPositivos;
            System.out.println("Media de los valores positivos: " + mediaPositivos);
        } else {
            System.out.print("No se introdujero valores positivos");
        }
        if (contadorNegativos > 0) {
            double mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("Media de los valores Negativos: " + mediaNegativos);
        } else {
            System.out.print("No se introdujero valores Negativos");
//        }

        //Ejercicio 2
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i+=2) {
            suma += numeros[i];
        }
        double media = suma / numeros.length;
        System.out.println("La media de los números que estan en posiciones pares es: " + media);

        //Ejercicio 3
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = sc.nextInt();
        double [] notas = new double[numAlumnos];
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del alumno " + (i+1) + ":");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.println("La nota media de los alumnos es: " + media);
        System.out.print("Alumnos con una nota superior a la media \n");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i+1) + ": " + notas[i]);
            }
        }

        //Ejercicio 4
        int [] pares = new int[20];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i] + " ");
//        }

        //Ejercicio 5
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) +": ");
            numeros[i] = sc.nextInt();
        }
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos += 1;
            } else if (numeros[i] < 0) {
                negativos += 1;
            } else if (numeros[i] == 0) {
                ceros += 1;
            }
        }
        System.out.println("La cantidad de números positivos es de " + positivos);
        System.out.println("La cantidad de números negativos es de " + negativos);
        System.out.println("La cantidad de números iguales a cero es de " + ceros);

        //Ejercicio 6
        int [] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                sumaNegativos = sumaNegativos + numeros[i];
            }
        }
        double mediaPositivos = sumaPositivos / numeros.length;
        double mediaNegativos = sumaNegativos / numeros.length;
        System.out.println("Media de los valores positivos: " + mediaPositivos + "\nMedia de los valores negativos: " + mediaNegativos);

        //Ejercicio 7
        int n;
        do {
            System.out.print("Ingrese el número de personas del que desee calcular su altura: ");
            n = sc.nextInt();
        }
        while (n <= 0);
        double [] alturas = new double[n];
        double sumaAlturas = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura de la persona " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
            sumaAlturas += alturas[i];
        }
        double alturaMedia = sumaAlturas / n;
        int superiorMedia = 0;
        int inferiorMedia = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > alturaMedia) {
                superiorMedia++;
            } else if (alturas[i] < alturaMedia) {
                inferiorMedia++;
            }
        }
        System.out.println("La altura media es: " + alturaMedia);
        System.out.println("Las personas con una altura superior a la media son " + superiorMedia);
        System.out.println("Las personas con una altura inferior a la media son " + inferiorMedia);

        //Ejercicio 8
        String [] nombres = new String[20];
        double [] sueldos = new double[20];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el sueldo del empleado " + (i+1) + ": ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine();

        }
        double mayorSueldo = sueldos[0];
        String mayorSueldoNombre = nombres[0];
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                mayorSueldoNombre = nombres[i];
            }
        }
        System.out.println("El empleado con mayor sueldo es " + mayorSueldoNombre + " con un sueldo de " + mayorSueldo);

        //Ejercicio 9
        int desde = 5;
        int hasta = 20;
        int tamano = 10;
        int[] numAleatorios = array(desde,hasta,tamano);
        for (int num : numAleatorios) {
            System.out.print(num + " ");

        //Ejercicio 10
        //A
        System.out.print("Ingrese el número de filas que desee que tengan los arrays A y B: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el números de columnas que desee que tengan los arrays A y B: ");
        int columnas = sc.nextInt();
        int [][] a = new int[filas][columnas];
        int [][] b = new int[filas][columnas];
        int [][] c = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la pisición ["+i+", "+j+"] de la matriz A: ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la pisición ["+i+", "+j+"] de la matriz B: ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        //B
        int filas = leerNumeroEntero("Introduce el número de filas: ");
        int columnas = leerNumeroEntero("Introduce el número de columnas: ");
        int [][] a = crearMatriz(filas,columnas);
        int [][] b = crearMatriz(filas,columnas);
        System.out.print("Introduce los valores de la matriz A: \n");
        llenarMatriz(sc,a);
        System.out.print("Introduce los valores de la matriz B: \n");
        llenarMatriz(sc,b);
        int [][] c = sumarMatrices(a,b);
        System.out.print("La matriz C queda de la siguiente forma: \n");
        mostrarMatriz(c);

        //Ejercicio 11
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();
        int [][] a = new int[filas][columnas];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Introduce el valor de la matriz A para la posición ["+i+", "+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        int [][] matrizTranspuesta = new int[columnas][filas];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                matrizTranspuesta[j][i] = a[i][j];
            }
        }
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(matrizTranspuesta[j][i] + " ");
            }
            System.out.println();
        }
    }
    //Metodo del ejercicio 9
        public static int[] array(int desde,int hasta,int tamano) {
        int [] arrayAleatorio = new int[tamano];
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            arrayAleatorio[i] = random.nextInt(hasta - desde + 1) + desde;
        }
        return arrayAleatorio;
    }

    //Metodos ejercicio 10 B
    public static int leerNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }
    public static int[][] crearMatriz(int filas,int columnas) {
        return new int[filas][columnas];
    }
    public static void llenarMatriz(Scanner sc, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la pisición ["+i+", "+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public static int[][] sumarMatrices(int[][] a,int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int [][] c = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
//        }
//    }
}