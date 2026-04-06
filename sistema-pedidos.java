package Proyecto;
import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {
        //Entradas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del Cliente:");
        String nom_cliente = scanner.nextLine();
        System.out.println("Elije un producto :\n1. Laptop - $15000\n" + //
                        "2. Mouse - $500\n" +"3. Teclado - $800");
        int opcionProducto = scanner.nextInt();
        System.out.println("Escribre la cantidad: ");
        int cantidadProducto = scanner.nextInt();
        
        //Variables
        String nomProducto = "";
        double total =0;
        double costoTotal =0;
        double descuento =0;
    

        switch (opcionProducto) {
            case 1:
                nomProducto = "Laptop";
                total = 15000*cantidadProducto;
                break;
            case 2:
                nomProducto = "Mouse";
                total = 500*cantidadProducto;
                break;
            case 3:
                nomProducto = "Teclado";
                total = 800*cantidadProducto;
                break;
            default:
                System.out.println("Opción inválida. Terminando programa...");
                scanner.close();
                return;
        }
        if (total >1000) {
            descuento = total * 0.10;
        } else if (total >500){
            descuento = total *0.5;
        }else{
            System.out.println("La compra no tiene descuento");
        }

        costoTotal = total-descuento;

        // Salida
        System.out.println("\n--- TICKET DE COMPRA ---");
        System.out.println("Cliente: " + nom_cliente);
        System.out.println("Producto: " + nomProducto);
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + costoTotal);

        
        scanner.close();
        
    }
    
}
