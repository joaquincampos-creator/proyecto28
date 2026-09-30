package gestiontienda;

import java.util.ArrayList;
import java.util.Collections;

public class GestionTienda {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Arroz");
        productos.add("Pan");
        productos.add("Leche");
        productos.add("Aceite");
        productos.add("Fideos");

        System.out.println("--- Lista de productos inicial ---");
        System.out.println(productos);

        productos.set(2, "Queso");
        System.out.println("\n--- Despues de reemplazar 'Leche' por 'Queso' ---");
        System.out.println(productos);

        String productoEliminar = "Pan";
        if (productos.contains(productoEliminar)) {
            System.out.println("\nEl producto '" + productoEliminar + "' existe en el sistema.");
            productos.remove(productoEliminar);
            System.out.println("Se ha eliminado '" + productoEliminar + "'. Total de productos restantes: " + productos.size());
        } else {
            System.out.println("\nEl producto '" + productoEliminar + "' no se encuentra en el sistema.");
        }

        String productoBuscado = "Aceite";
        int posicion = productos.indexOf(productoBuscado);
        if (posicion != -1) {
            System.out.println("\nEl producto '" + productoBuscado + "' esta en el indice: " + posicion);
        } else {
            System.out.println("\nEl producto '" + productoBuscado + "' no existe en la lista.");
        }

        Collections.sort(productos);

        System.out.println("\n--- Lista final de productos ordenados y enumerados ---");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }
}