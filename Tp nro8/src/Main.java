import java.util.Scanner;
import java.util.Arrays;
public class Main {
    //1
    public static int[][] sumarMatrices(int[][] a,int[][] b) {
        int matriz1 = a.length;
        int matriz2 = a[0].length;
        int [][] resultado = new int[matriz1][matriz2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
    //2
    public static int[][] multiplicarMatrices(int[][] a,int[][] b) {
        int matriz1 = a.length;
        int matriz2 = a[0].length;
        int [][] resultado1 = new int[matriz1][matriz2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                resultado1[i][j] = a[i][j] * b[i][j];
            }
        }
        return resultado1;
    }
    //3
    public static int[][] matrizTranspuesta(int[][] a) {
        int filas = a.length;
        int columnas = a[0].length;
        int [][] transpuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = a[i][j];
            }
        }
        return transpuesta;
    }
    //4
    public static boolean esMatrizSimetrica(int[][] a) {
        int filas = a.length;
        int columnas = a[0].length;
        if (filas != columnas) {
            return false;
        }
        int[][] transpuesta = matrizTranspuesta(a);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (a[i][j] != transpuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    //5
    public static int[] productoEscalar(int[] vector,int escalar) {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }
    //6
    public static int sumarMatriz(int[][] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                suma += a[i][j];
            }
        }
        return suma;
    }
    //7
    public static int[] encontrarMaximoMatriz(int[][] a) {
        int maximo = a[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maximo) {
                    maximo = a[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }
        return new int[]{maximo,filaMaximo,columnaMaximo};
    }
    //8
    public static int sumarFila(int[][] a, int fila) {
        int suma = 0;
        for (int i = 0; i < a[fila].length; i++) {
            suma += a[fila][i];
        }
        return suma;
    }
    //9
    public static boolean esMatrizDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    //10
    public static int[][] generarMatrizIdentidad(int n) {
        int[][] matrizIdentidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }

        return matrizIdentidad;
    }
    public static int[] contarParesImpares(int[][] matriz) {
        int[] contador = {0,0};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador[0]++;
                } else {
                    contador[1]++;
                }
            }
        }
        return contador;
    }
    //12
    public static int[][] rotarMatrizGrados(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[i][j] = matriz[n - j - 1][i];
            }
        }

        return matrizRotada;
    }
    //13
    public static int contarAparicionesNumero(int[][] matriz,int numeroABuscar) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == numeroABuscar) {
                    contador++;
                }
            }
        }
        return contador;
    }
    //14
    public static int[][] invertirOrdenFilasMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizFilasIvertidas = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizFilasIvertidas[i][j] = matriz[filas-i-1][j];
            }
        }
        return matrizFilasIvertidas;
    }
    //15
    public static int sumarDiagonalesMatriz(int[][] matriz) {
        int suma = 0;
        int dimension = matriz.length;

        for (int i = 0; i < dimension; i++) {
            suma += matriz[i][i];
            suma += matriz[i][dimension - i - 1];
        }
        if (dimension % 2 != 0) {
            suma -= matriz[dimension / 2][dimension / 2];
        }
        return suma;
    }
    //16
    public static double[][] transponerMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] resultado = new double[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }

    public static double[][] inversa(double[][] matriz) {
        int n = matriz.length;
        double[][] aumentada = new double[n][2*n];
        double[][] inversa = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aumentada[i][j] = matriz[i][j];
                aumentada[i][j+n] = (i == j) ? 1 : 0;
            }
        }
        for (int i = 0; i < n; i++) {
            double pivot = aumentada[i][i];

            for (int j = 0; j < 2*n; j++) {
                aumentada[i][j] /= pivot;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aumentada[k][i];
                    for (int j = 0; j < 2*n; j++) {
                        aumentada[k][j] -= factor * aumentada[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = aumentada[i][j + n];
            }
        }

        return inversa;
    }

    public static boolean calcularOrtogonal(double[][] matriz) {
        double[][] transpuesta = transponerMatriz(matriz);
        double[][] matrizInversa = inversa(matriz);

        return Arrays.deepEquals(matriz, transpuesta) && Arrays.deepEquals(matriz, matrizInversa);
    }
    //17
    public static int[] encontrarMinimosPorFila(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] minimos = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimoFila = matriz[i][0];
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minimoFila) {
                    minimoFila = matriz[i][j];
                }
            }
            minimos[i] = minimoFila;
        }
        return minimos;
    }
    //18
    public static int[][] productoMatrices(int[][] a, int[][] b) {
        int filasA = a.length;
        int columnasA = a[0].length;
        int filasB = b.length;
        int columnasB = b[0].length;

        if (columnasA != filasB) {
            return null;
        }
        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] resultado = sumarMatrices(a,b);
        System.out.println("Suma matrices: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        //2
        int [][] resultado1 = multiplicarMatrices(a,b);
        System.out.println("Multiplicación matrices: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(resultado1[i][j] + " ");
            }
            System.out.println();
        }

        //3
        int [][] transpuesta = matrizTranspuesta(a);
        System.out.println("Matriz 'a' transpuesta: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        //4
        boolean simetrica = esMatrizSimetrica(a);
        if (simetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }

        //5
        int[] vector = {1,2,3,4,5};
        int escalar = 3;
        int[] resultado2 = productoEscalar(vector,escalar);
        for (int i = 0; i < resultado2.length; i++) {
            System.out.print(resultado2[i] + " ");
        }

        //6
        System.out.println();
        int suma = sumarMatriz(a);
        System.out.println("La suma de los lementos de la matriz es: " + suma);

        //7
        int[] resultado3 = encontrarMaximoMatriz(a);
        System.out.println("El elemento máximo de la matriz es: " + resultado3[0]);
        System.out.println("Esta en la posición: (" + resultado3[1] + ",  " + resultado3[2] + ")");

        //8
        int filaDeMatriz = 1;
        int suma1 = sumarFila(a,filaDeMatriz);
        System.out.println("La suma de la fila 1 de la matriz es: " + suma1);

        //9
        int[][] matrizDiagonal = {{1,0,0},{0,2,0},{0,0,3}};
        boolean primeraMatriz = esMatrizDiagonal(matrizDiagonal);
        if (primeraMatriz) {
            System.out.println("La matriz es diagonal");
        } else {
            System.out.println("La matriz no es diagonal");
        }

        //10
        int n = 3;
        int[][] matrizIdentidad = generarMatrizIdentidad(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }

        //11
        int[] contadorParesImpares = contarParesImpares(a);
        System.out.println("La cantidad de números pares es: "+contadorParesImpares[0]);
        System.out.println("La cantidad de números impares es: "+contadorParesImpares[1]);

        //12
        int[][] matrizRotada = rotarMatrizGrados(a);
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }

        //13
        int [][] matriz = {{4,2,8},{6,4,4},{8,8,4}};
        int numeroABuscar = 4;
        int contador = contarAparicionesNumero(matriz,numeroABuscar);
        System.out.println("El número "+numeroABuscar+" aparece "+contador+" veces en la matriz");

        //14
        int[][] matrizFilasInvertidas = invertirOrdenFilasMatriz(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(matrizFilasInvertidas[i][j] + " ");
            }
            System.out.println();
        }

        //15
        int sumaDiagonales = sumarDiagonalesMatriz(a);
        System.out.println("La suma de las diagonales de la matriz es: " + sumaDiagonales);

        //16
        double[][] matrizOrtogonal = {
                {1, 0},
                {0, -1}
        };

        boolean esOrtogonal = calcularOrtogonal(matrizOrtogonal);

        if (esOrtogonal) {
            System.out.println("La matriz es ortogonal.");
        } else {
            System.out.println("La matriz no es ortogonal.");
        }

        //17
        int[] minimosXfila = encontrarMinimosPorFila(a);
        for (int i = 0; i < minimosXfila.length; i++) {
            System.out.println("Fila "+i+": "+minimosXfila[i]);
        }

        //18
        int[][] resultado4 = productoMatrices(a,b);
        if (resultado4 != null) {
            System.out.println("Producto de matrices:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    System.out.print(resultado4[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No es posible multiplicar las matrices.");
        }
    }
}