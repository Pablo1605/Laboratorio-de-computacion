import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //Ejercicio 4
        //a
        ArrayList<Double> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el número decimal numero "+i+": ");
            double num = sc.nextDouble();
            numeros.add(num);
        }

        //b
        double mayor = numeros.get(0);
        for (double num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }

        //c
        double menor = numeros.get(0);
        for (double num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        double rango = mayor - menor;
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        System.out.println("El rango es " + rango);

        //Ejercicio 5
        ArrayList<Integer> numeros1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num1 = rand.nextInt(50) * 2 + 2;
            numeros1.add(num1);
        }

        //a
        int suma = 0;
        for (int num : numeros1) {
            suma += num;
        }
        double promedio = (double) suma / numeros1.size();

        //b
        int igualesPromedio = 0;
        for (int num : numeros1) {
            if (num == promedio) {
                igualesPromedio++;
            }
        }

        //c
        int mayoresPromedio = 0;
        for (int num : numeros1) {
            if (num > promedio) {
                mayoresPromedio++;
            }
        }

        //d
        int menoresPromedio = 0;
        for (int num : numeros1) {
            if (num < promedio) {
                menoresPromedio++;
            }
        }
        System.out.println("El promedio aritmetico es: " + promedio);
        System.out.println("Los números iguales al promedio aritmetico son: " + igualesPromedio);
        System.out.println("Los números mayores al promedio aritmetico son: " + mayoresPromedio);
        System.out.println("Los números menores al promedio aritmetico son: " + menoresPromedio);
    }
}