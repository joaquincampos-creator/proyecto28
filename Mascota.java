package juego;

import java.util.Scanner;


class Mascota {
    private String nombre;
    private int energia;
    private int hambre;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 100;
        this.hambre = 0;  
    }

    public void comer() {
        this.hambre -= 30;
        if (this.hambre < 0) {
            this.hambre = 0;
        }
        System.out.println(nombre + " ha comido. Hambre actual: " + hambre);
    }

    public void jugar() {
        this.energia -= 20;
        if (this.energia < 0) {
            this.energia = 0;
        }
        this.hambre += 15;
        System.out.println(nombre + " jugo un rato. Energia: " + energia + " | Hambre: " + hambre);
    }

    public void dormir() {
        this.energia = 100;
        System.out.println(nombre + " ha dormido y recupero toda su energia (100).");
    }

    public boolean estaFeliz() {
        return this.energia > 50 && this.hambre < 50;
    }

    public void mostrarEstado() {
        System.out.println("\n--- ESTADO DE " + nombre.toUpperCase() + " ---");
        System.out.println("Energia: " + energia);
        System.out.println("Hambre:  " + hambre);
        System.out.println("¿Esta feliz?: " + (estaFeliz() ? "SI" : "NO"));
        System.out.println("----------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido Ingresa el nombre de tu mascota: ");
        String nombreMascota = scanner.nextLine();

        Mascota miMascota = new Mascota(nombreMascota);

        System.out.println("\n=== INICIO ===");
        System.out.println("Haciendo jugar a " + nombreMascota + " 3 veces seguidas...");
        
        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();

        miMascota.mostrarEstado();

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n--- MENU DE INTERACCION ---");
            System.out.println("1. Alimentar (comer)");
            System.out.println("2. Jugar");
            System.out.println("3. Poner a dormir");
            System.out.println("4. Ver estado");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        miMascota.comer();
                        break;
                    case 2:
                        miMascota.jugar();
                        break;
                    case 3:
                        miMascota.dormir();
                        break;
                    case 4:
                        miMascota.mostrarEstado();
                        break;
                    case 5:
                        System.out.println("¡Gracias por jugar con " + nombreMascota + "Hasta luego");
                        break;
                    default:
                        System.out.println("Opcion invaalida. Intenta nuevamente.");
                }
            } else {
                System.out.println("Por favor, ingresa un numero valido.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}

