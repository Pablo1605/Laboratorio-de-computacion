import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        ArrayList<String> marcasAutos = new ArrayList<>();
        boolean otroAuto = true;

        while (otroAuto) {
            System.out.print("Ingrese una marca de auto: ");
            String marca = sc.nextLine();
            marcasAutos.add(marca);

            System.out.print("¿Desea ingresar otra marca de auto?(s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                otroAuto = false;
            }
        }
        for (String marca : marcasAutos) {
            System.out.println(marca);
        }

        //Ejercicio 2
        EquiposDeFutbol equipo = new EquiposDeFutbol();
        boolean otroJugador = true;
        while (otroJugador) {
            System.out.print("Ingrese el nombre del jugador a agregar: ");
            String nombre = sc.nextLine();
            equipo.agregarJugador(nombre);

            System.out.print("¿Desea ingresar otro jugador?(s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                otroJugador = false;
            }
        }
        equipo.listarPlantilla();
        boolean eliminarJugador = true;
        System.out.print("¿Desea eliminar algún jugador?(s/n):");
        String respuesta1 = sc.nextLine();
        if (!respuesta1.equalsIgnoreCase("s")) {
            eliminarJugador = false;
        }
        while (eliminarJugador) {
            System.out.print("Ingrese el nombre del jugador a eliminar: ");
            String nombre = sc.nextLine();
            equipo.eliminarJugador(nombre);

            System.out.print("¿Desea eliminar a otro jugador?(s/n): ");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                eliminarJugador = false;
            }
            if (eliminarJugador == false) {
                equipo.listarPlantilla();
            }

            //Ejercicio 3
            Factura factura = new Factura(1001, new Date(), "Cliente Ejemplo", 10.0, 3);

            Articulo articulo1 = new Articulo("Producto 1", 10.0);
            Articulo articulo2 = new Articulo("Producto 2", 20.0);

            factura.agregarArticulo(articulo1);
            factura.agregarArticulo(articulo2);

            factura.calcularSubtotal();
            factura.calcularIVA();
            factura.calcularTotal();

            System.out.println("Subtotal: " + factura.getSubtotal());
            System.out.println("IVA: " + factura.getIva());
            System.out.println("Total: " + factura.getTotal());
        }
    }
}
//Ejercicio 2
class EquiposDeFutbol {
    private ArrayList<String> jugadores;
    public EquiposDeFutbol() {
        this.jugadores = new ArrayList<>();
    }
    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
    }
    public void eliminarJugador(String jugador) {
        jugadores.remove(jugador);
    }
    public void listarPlantilla() {
        System.out.println("Plantilla del equipo:");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
//Ejercicio 3
class Factura {
    private int numeroFactura;
    private Date fechaEmision;
    private String cliente;
    private List<Articulo> articulos;
    private double precioUnitario;
    private int cantidad;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(int numeroFactura, Date fechaEmision, String cliente, double precioUnitario, int cantidad) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void calcularSubtotal() {
        subtotal = precioUnitario * cantidad;
    }

    public void calcularIVA() {
        iva = subtotal * 0.16;
    }

    public void calcularTotal() {
        total = subtotal + iva;
    }
    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }
}
class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}