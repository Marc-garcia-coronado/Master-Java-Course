import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String name;
        String description;
        double product1;
        double product2;
        int impuesto = 19;
        double totalPrecioBruto;
        double totalPrecioNeto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la factura: ");
        name = scanner.nextLine();

        System.out.println("Introduce una descripcion: ");
        description = scanner.nextLine();

        while (true) {
            System.out.println("Introduce el precio del producto 1: ");
            try {
                product1 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No ha introducido un Double: ");
            }
        }

        while (true) {
            System.out.println("Introduce el precio del producto 2: ");
            try {
                product2 = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No ha introducido un Double");
            }
        }

        totalPrecioBruto = product1 + product2;
        totalPrecioNeto = totalPrecioBruto + (( totalPrecioBruto * impuesto) / 100 ) ;

        System.out.println("La factura " + name + " con descripcion: " + description + " tiene un precio bruto de " +
                totalPrecioBruto + ", con un impuesto del " + impuesto + "% y el monto despues de impuestos es de " +
                totalPrecioNeto);



    }
}
