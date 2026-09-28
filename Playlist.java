package playlist;

class Cancion {
    private String titulo;
    private String artista;
    private int duracionSeg;

    public Cancion() {
        this.titulo = "Sin título";
        this.artista = "Artista desconocido";
        this.duracionSeg = 0;
    }

    public Cancion(String titulo, String artista, int duracionSeg) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSeg = duracionSeg;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public int getDuracionSeg() { return duracionSeg; }
    public void setDuracionSeg(int duracionSeg) { this.duracionSeg = duracionSeg; }

    public boolean esLarga() {
        return this.duracionSeg > 240;
    }

    public String duracionFormato() {
        int minutos = this.duracionSeg / 60;
        int segundos = this.duracionSeg % 60;
        return String.format("%d:%02d", minutos, segundos);
    }

    public void mostrar() {
        String etiquetaLarga = esLarga() ? " [Larga]" : "";
        System.out.println(this.titulo + " - " + this.artista + " (" + duracionFormato() + ")" + etiquetaLarga);
    }
}

public class Playlist {
    public static void main(String[] args) {
        System.out.println("=== MI PLAYLIST - TOP 3 ===\n");

        Cancion c1 = new Cancion("Desde el antro", "Pastanostra", 186);
        Cancion c2 = new Cancion("La pronoia del su joke fun", "Chystemc", 162);
        Cancion c3 = new Cancion("M5", "Piero47", 158);

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        System.out.println("\n--------------------------------------------------");
        System.out.println("Modificando duracion de 'M5' con setter...");
        System.out.println("--------------------------------------------------");

        c2.setDuracionSeg(250);
        c2.mostrar();
    }
}