package juego;

public class Juego {

    private String nombre;
    private int edadMinima;
    private int duracion;
    private double alturaMinima;

    public Juego(String nombre, int edadMinima, int duracion, double alturaMinima) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
        this.alturaMinima = alturaMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public void mostrarInfo() {
        System.out.println("Juego: " + nombre + " | Edad minima: " + edadMinima + " anios | Duracion: " + duracion + " min | Altura monima: " + alturaMinima + " m");
    }

    public boolean puedeSubir(int edad) {
        return edad >= edadMinima;
    }

    public boolean puedeSubir(int edad, double altura) {
        return edad >= edadMinima && altura >= alturaMinima;
    }

    public static void main(String[] args) {
        Juego juego1 = new Juego("Raptor", 12, 3, 1.40);
        Juego juego2 = new Juego("Barco Pirata", 4, 5, 0.90);
        Juego juego3 = new Juego("Sillitas Voladoras", 8, 4, 1.20);

        System.out.println("--- INFORMACION DE LOS JUEGOS ---");
        juego1.mostrarInfo();
        juego2.mostrarInfo();
        juego3.mostrarInfo();

        System.out.println("\n--- EVALUACION DE EDAD ---");
        int edadNino = 10;

        System.out.println("Un nino de " + edadNino + " anos puede subir a " + juego1.getNombre() + "? " + (juego1.puedeSubir(edadNino) ? "Si" : "No"));
        System.out.println("Un nino de " + edadNino + " anos puede subir a " + juego2.getNombre() + "? " + (juego2.puedeSubir(edadNino) ? "Si" : "No"));
        System.out.println("Un nino de " + edadNino + " anos puede subir a " + juego3.getNombre() + "? " + (juego3.puedeSubir(edadNino) ? "Si" : "No"));

        System.out.println("\n--- VALIDACION EXTRA EDAD Y ALTURA ---");
        double alturaNino = 1.35;

        System.out.println("Nino (Edad: " + edadNino + " anos, Altura: " + alturaNino + " m):");
        System.out.println("Puede subir a " + juego1.getNombre() + "? " + (juego1.puedeSubir(edadNino, alturaNino) ? "Si" : "No"));
        System.out.println("Puede subir a " + juego2.getNombre() + "? " + (juego2.puedeSubir(edadNino, alturaNino) ? "Si" : "No"));
        System.out.println("Puede subir a " + juego3.getNombre() + "? " + (juego3.puedeSubir(edadNino, alturaNino) ? "Si" : "No"));
    }
}
