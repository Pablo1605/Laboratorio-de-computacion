import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        System.out.print("Ingrese el número que desee saber si es par o impar: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
        //Ejercicio 2
        System.out.print("Ingrese el número que desee saber si es múltiplo de 10: ");
        int num = sc.nextInt();
        if (num % 10 == 0) {
            System.out.println("El número " + num + " es múltiplo de 10");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 10");
        }
        //Ejercicio 3
        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("La letra es minúscula");
        }
        //Ejercicio 4
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números no son iguales");
        }
        //Ejercicio 5
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es el mayor");
        } else {
            System.out.println("El número " + num2 + " es el mayor");
        }
        //Ejercicio 6
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 % 10 == num2 % 10) {
            System.out.println("La última cifra de los dos números son iguales");
        } else {
            System.out.println("La última cifra de los dos números son diferentes");
        }
        //Ejercicio 7
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El número ingresado es múltiplo de 3 y de 5");
        } else {
            System.out.println("El número ingresado no es múltiplo de 3 y de 5");
        }
        //Ejercicio 8
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("El número ingresado es múltiplo de 2 o de 3");
        } else {
            System.out.println("El número ingresado no es múltiplo de 2 o de 3");
        }
        //Ejercicio 9
        System.out.print("Ingrese el primer carácter: ");
        char caracter1 = sc.next().charAt(0);
        System.out.print("Ingrese el segundo carácter: ");
        char caracter2 = sc.next().charAt(0);
        if (caracter1 == caracter2) {
            System.out.println("Los carácteres son iguales");
        } else {
            System.out.println("Los carácteres son diferentes");
        }
        //Ejercicio 10
        System.out.print("Ingrese el primer carácter: ");
        char caracter1 = sc.next().charAt(0);
        System.out.print("Ingrese el segundo carácter: ");
        char caracter2 = sc.next().charAt(0);
        if (Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)) {
            System.out.println("Los dos carácteres ingresados están en minúsculas");
        } else {
            System.out.println("Los dos carácteres ingresados no están en minúsculas");
        }
        //Ejercicio 11
        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);
        if (Character.isDigit(caracter)) {
            System.out.println("El carácter ingresado es un dígito numérico");
        } else {
            System.out.println("El carácter ingresado no es un dígito numérico");
        }
        //Ejercicio 12
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("El resultado de la división es " + division);
        } else {
            System.out.println("No es posible dividir por cero");
        }
        //Ejercicio 13
        System.out.print("Ingrese el año que desee saber si es bisiesto: ");
        int anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
        //Ejercicio 14
        System.out.print("Ingrese un número entero de tres cifras: ");
        int num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            if (num / 100 == num % 10) {
                System.out.println("El número " + num + " es capicúa");
            } else {
                System.out.println("El número " + num + " no es capicúa");
            }
        } else {
            System.out.println("El programa finaliza");
        }
        //Ejercicio 15
        System.out.print("Ingrese la hora: ");
        int H = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        int M = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        int S = sc.nextInt();
        if (H >= 0 && H < 24 && M >= 0 && M < 60 && S >= 0 && S < 60) {
            System.out.println("La hora es valida");
        } else {
            System.out.println("La hora no es valida");
        }
        //Ejercicio 16
        System.out.print("Ingrese un mes [1/12]: ");
        int mes = sc.nextInt();
        if (mes >= 1 && mes <= 12) {
            if (mes == 1) {
                System.out.println("El mes es enero y tiene 31 dias");
            } else if (mes == 2) {
                System.out.println("El mes es febrero y tiene 28 dias");
            } else if (mes == 3) {
                System.out.println("El mes es marzo y tiene 31 dias");
            } else if (mes == 4) {
                System.out.println("El mes es abril y tiene 30 dias");
            } else if (mes == 5) {
                System.out.println("El mes es mayo y tiene 31 dias");
            } else if (mes == 6) {
                System.out.println("El mes es junio y tiene 30 dias");
            } else if (mes == 7) {
                System.out.println("El mes es julio y tiene 31 dias");
            } else if (mes == 8) {
                System.out.println("El mes es agosto y tiene 31 dias");
            } else if (mes == 9) {
                System.out.println("El mes es septiembre y tiene 30 dias");
            } else if (mes == 10) {
                System.out.println("El mes es octubre y tiene 31 dias");
            } else if (mes == 11) {
                System.out.println("El mes es noviembre y tiene 30 dias");
            } else if (mes == 12) {
                System.out.println("El mes es diciembre y tiene 31 dias");
            }
        } else {
            System.out.println("El valor introucido tiene que estar comprendido entre 1 y 12");
        }
        //Ejercicio 17
        System.out.print("Ingrese una calificación numérica entre 0 y 10 que desee pasar a alfabética: ");
        int nota = sc.nextInt();
        System.out.println("Nota Alfabética: ");
        if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
        //Ejercicio 18
        int n = 1;
        while (n <= 100) {
            System.out.println(n);
            n += 1;
        }
        //Ejercicio 19
        int n = 1;
        do {
            System.out.println(n);
            n += 1;
        }
        while (n <= 100);
        //Ejercicio 20
        for (int n = 1; n <= 100; n++) {
            System.out.println(n);
        }
        //Ejercicio 21
        int n = 100;
        while (n >= 1) {
            System.out.println(n);
            n -= 1;
        }
        //Ejercicio 22
        int n = 100;
        do {
            System.out.println(n);
            n -= 1;
        }
        while (n >= 1);
        //Ejercicio 23
        for (int n = 100; n >= 1; n--) {
            System.out.println(n);
        }
        //Ejercicio 24
        System.out.print("Ingrese el valor de N: ");
        int n = sc.nextInt();
        System.out.print("Bucle con estructura for: \n");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        int i = 1;
        System.out.print("Bucle con estructura while: \n");
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        i = 1;
        System.out.print("Bucle con estructura do-while: \n");
        do {
            System.out.println(i);
            i++;
        }
        while (i <= n);
        //Ejercicio 25
        System.out.print("Ingrese el valor de N: ");
        int n = sc.nextInt();
        System.out.print("Bucle con estructura for: \n");
        for (int i = 100; i >= n; i--) {
            System.out.println(i);
        }
        int i = 100;
        System.out.print("Bucle con estructura while: \n");
        while (i >= n) {
            System.out.println(i);
            i--;
        }
        i = 100;
        System.out.print("Bucle con estructura do-while: \n");
        do {
            System.out.println(i);
            i--;
        }
        while (i >= n);
        //Ejercicio 26
        int num1;
        int num2;
        do {
            System.out.print("Ingrese el valor del primer número: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el valor del segundo número: ");
            num2 = sc.nextInt();
            if (num1 == num2) {
                System.out.println("Los números ingresados tienen que ser distintos, introduzcalos nuevamente");
            }
        }
        while (num1 == num2);
        int menor;
        int mayor;
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        //Ejercicio 27
        int a;
        int b;
        do {
            System.out.print("Ingrese el valor de A: ");
            a = sc.nextInt();
            System.out.print("Ingrese el valor de B: ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("A tiene que ser menor que B, introduzca los valores nuevamente");
            }
        }
        while (a > b);
        System.out.print("Números pares entre A y B: \n");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Ejercicio 28
        int n;
        int m;
        do {
            System.out.print("Ingrese el valor de N, tiene que ser un valor positivo: ");
            n = sc.nextInt();
            System.out.print("Ingrese el valor de M, tiene que ser un valor positivo y mayor a N: ");
            m = sc.nextInt();
            if (n > m || n <= 0 || m <= 0) {
                System.out.println("N tiene que ser menor que M y ambos valores tienen que ser positivos, introduzca los valores nuevamente");
            }
        }
        while (n > m || n <= 0 || m <= 0);
        System.out.print("Múltiplos de N comprendidos desde 1 hasta M: \n");
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
        //Ejercicio 29
        double m = 1.6063;
        double millas;
        do {
            System.out.print("Introduzca una cantidad de millas, ingrese 0 para salir: ");
            millas = sc.nextInt();
            if (millas != 0) {
                double km = millas * m;
                System.out.println(millas + " millas son equivalentes a " + km + " km");
            }
        }
        while (millas != 0);
        sc.close();
    }
}