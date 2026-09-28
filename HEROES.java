package juego;

class Heroes {
    private String nombre;
    private int vida;
    private int ataque;

    public Heroes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void atacar(Heroes rival) {
        if (!rival.estaVivo()) {
            return;
        }

        int danioFinal = this.ataque;

        if (Math.random() < 0.20) {
            danioFinal *= 2;
            System.out.println("GOLPE CRITICO de " + this.nombre + " ");
        }

        rival.setVida(rival.getVida() - danioFinal);

        System.out.println(this.nombre + " ataca a " + rival.getNombre() + 
                           " e inflige " + danioFinal + " de daNo. " +
                           "(Vida de " + rival.getNombre() + ": " + rival.getVida() + ")");
    }
}


class dueloHEROES {
    public static void main(String[] args) {
        Heroes a = new Heroes("Valkiria", 100, 10);
        Heroes b = new Heroes("Golem", 130, 12);

        System.out.println("=== INICIA EL DUELO DE HEROE ===");
        System.out.println(a.getNombre() + " (Vida: " + a.getVida() + ", Ataque: " + a.getAtaque() + ") VS " +
                           b.getNombre() + " (Vida: " + b.getVida() + ", Ataque: " + b.getAtaque() + ")");
        System.out.println("--------------------------------------------------\n");

        int ronda = 1;

        while (a.estaVivo() && b.estaVivo()) {
            System.out.println("--- RONDA " + ronda + " ---");

            a.atacar(b);

            if (b.estaVivo()) {
                b.atacar(a);
            }

            ronda++;
            System.out.println();
        }

        System.out.println("==========================================");
        if (a.estaVivo()) {
            System.out.println("EL GANADOR ES " + a.getNombre().toUpperCase() + "");
        } else {
            System.out.println("EL GANADOR ES " + b.getNombre().toUpperCase() + "");
        }
        System.out.println("==========================================");
    }
}