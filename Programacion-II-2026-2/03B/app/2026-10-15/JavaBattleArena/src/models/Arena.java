package models;

public class Arena {

    private Personaje jugador;
    private Enemigo enemigo;

    public Arena() {
    }

    public Arena(Personaje jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public Personaje getJugador() {
        return jugador;
    }

    public void setJugador(Personaje jugador) {
        this.jugador = jugador;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public void iniciarCombate() {
        if (jugador == null || enemigo == null) {
            System.out.println("El combate no está preparado.");
            return;
        }

        if (!jugador.estaVivo() || !enemigo.estaVivo()) {
            System.out.println(
                "Ambos participantes deben estar vivos."
            );
            return;
        }

        System.out.println("\n===== INICIO DEL COMBATE =====");
        jugador.mostrarInformacion();
        enemigo.mostrarInformacion();

        while (jugador.estaVivo() && enemigo.estaVivo()) {
            jugador.atacar(enemigo);

            if (!enemigo.estaVivo()) {
                break;
            }

            enemigo.atacar(jugador);

            if (jugador.getEnergia() < 10
                    && enemigo.getEnergia() < 10) {
                System.out.println(
                    "Ambos combatientes están agotados."
                );
                break;
            }
        }

        System.out.println("\n===== FIN DEL COMBATE =====");

        if (jugador.estaVivo() && !enemigo.estaVivo()) {
            System.out.println(
                "¡Victoria de " + jugador.getNombre() + "!"
            );
        } else if (!jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println(
                "El enemigo " + enemigo.getNombre() + " ha ganado."
            );
        } else if (!jugador.estaVivo() && !enemigo.estaVivo()) {
            System.out.println("El combate termina en empate.");
        } else {
            System.out.println("Combate interrumpido por agotamiento.");
        }
    }
}