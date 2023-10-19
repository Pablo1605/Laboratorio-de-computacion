import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Main:
        //Ejercicio 2
        Perro atributosPerro = new Perro("Firulais","Shiba inu",3);
        atributosPerro.ladrar();

        //Ejercicio 5
        Circulo miCirculo = new Circulo(7.0);
        double area = miCirculo.calcularArea();
        double circunferencia = miCirculo.calcularCircunferencia();
        System.out.println("Area del círculo: " + area);
        System.out.println("Circunferencia del círculo: " + circunferencia);

        //Ejercicio 7
        Estudiante estudiante1 = new Estudiante("Pablo",18,1234);
        Estudiante estudiante2 = new Estudiante("Facundo",22,4321);
        System.out.println("Estudiante 1 - Nombre: "+estudiante1.nombre+", Edad: "+estudiante1.edad+", Número de identificación: "+estudiante1.numeroDeIdentificacion);
        System.out.println("Estudiante 2 - Nombre: "+estudiante2.nombre+", Edad: "+estudiante2.edad+", Número de identificación: "+estudiante2.numeroDeIdentificacion);

        //Ejercicio 9
        Libro atributosLibro = new Libro("Ficciones","Jorge Luis Borges",1944);
        atributosLibro.mostrarInformacion();

        //Ejercicio 11
        cuentaBancaria cuenta = new cuentaBancaria("1234",5000);
        System.out.println("Ingrese un monto a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);
        System.out.println("Ingrese un monto a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);

        //Ejercicio 12
        Rectangulo atributosRectangulo = new Rectangulo(3.5,6);
        double area1 = atributosRectangulo.calcularArea();
        double perimetro = atributosRectangulo.calcularPerimetro();
        System.out.println("Area del rectángulo: " + area1);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        //Ejercicio 13
        Coche atributosCoche = new Coche("Toyota","Supra",1978);

        //Ejercicio 14
        System.out.println("Ingrese cuantos km/h desea acelerar: ");
        int acelerar1 = sc.nextInt();
        atributosCoche.acelerar(acelerar1);
        System.out.println("Ingrese un cuantos km/h desea frenar: ");
        int frenar1 = sc.nextInt();
        atributosCoche.frenar(frenar1);

        //Ejercicio 15
        Pelicula atributosPelicula = new Pelicula("Interestelar","Christopher Nolan",169);
        atributosPelicula.mostrarInformacion1();
    }
}
//Clases:
//Ejercicio 1
class Perro {
    String nombre;
    String raza;
    int edad;
    //Ejercicio 2
    public Perro(String nombre,String raza,int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    //Ejercicio 3
    public void ladrar() {
        System.out.println("Guau, guau");
    }
}
//Ejercicio 4
class Circulo {
    double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}
//Ejercicio 6
class Estudiante {
    String nombre;
    int edad;
    int numeroDeIdentificacion;
    //Ejercicio 7
    public Estudiante(String nombre,int edad,int numeroDeIdentificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
}
//Ejercicio 8
class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    //Ejercicio 9
    public Libro(String titulo,String autor,int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public void mostrarInformacion() {
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+anioPublicacion);
    }
}
//Ejercicio 10
class cuentaBancaria {
    double saldo;
    String cuentaBancaria;
    //Ejercicio 11
    public cuentaBancaria(String cuentaBancaria,double saldoInicial) {
        this.cuentaBancaria = cuentaBancaria;
        this.saldo = saldoInicial;
    }
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron: "+monto+"$. Saldo actual: "+saldo);
    }
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Se retiraron "+monto+"$. Saldo actual: "+saldo);
        } else {
            System.out.println("Error: Saldo insuficiente");
        }
    }
}
//Ejercicio 12
class Rectangulo {
    double ancho;
    double alto;
    public Rectangulo(double ancho,double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double calcularArea() {
        return ancho * alto;
    }
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}
//Ejercicio 13
class Coche {
    String marca;
    String modelo;
    int anioFabricacion;
    //Ejercicio 14
    int velocidad;
    public Coche(String modelo,String marca,int anioFabricacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidad = 0;
    }
    public void acelerar(int incrementoVelocidad) {
        velocidad += incrementoVelocidad;
        System.out.println("El coche aceler'o a "+velocidad+" km/h");
    }
    public void frenar(int decrementoVelocidad) {
        if (velocidad >= decrementoVelocidad) {
            velocidad -= decrementoVelocidad;
            System.out.println("El coche freno a "+velocidad+" km/h");
        } else {
            velocidad = 0;
            System.out.println("El coche se detuvo");
        }
    }
}
//Ejercicio 15
class Pelicula {
    String titulo;
    String director;
    int duracion;
    public Pelicula(String titulo,String director,int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    public void mostrarInformacion1() {
        System.out.println("Título: "+titulo);
        System.out.println("Director: "+director);
        System.out.println("Duración en minutos: "+duracion);
    }
}