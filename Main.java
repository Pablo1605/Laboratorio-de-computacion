import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A-
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 % 10 == num2 % 10) {
            System.out.println("La última cifra de los dos números son iguales");
        } else {
            System.out.println("La última cifra de los dos números no son iguales");
        }
        //B-
        System.out.print("Ingrese un número entero de tres cifras: ");
        int num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            if (num / 100 == num % 10) {
                System.out.println("El número " + num + " es capicúa");
            } else {
                System.out.println("El número " + num + " no es capicúa");
            }
        } else {
            System.out.println("Error: el número a ingresar tenía que ser de tres cifras, programa finaliza");
        }
            sc.close();
        }
    }
