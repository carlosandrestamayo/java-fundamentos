package models;

import java.util.Random;

public class Partido {

    private final Equipo equipoLocal;
    private final String rival;
    private int golesLocal;
    private int golesRival;

    public Partido(Equipo equipoLocal, String rival) {
        this.equipoLocal = equipoLocal;
        this.rival = rival;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesRival() {
        return golesRival;
    }

    public void simular() {
        Random random = new Random();

        int ataque = equipoLocal.calcularAtaque();
        int defensa = equipoLocal.calcularDefensa();

        golesLocal = calcularGoles(ataque, random);
        golesRival = random.nextInt(3);

        if (defensa >= 150) {
            golesRival = Math.max(0, golesRival - 1);
        }

        System.out.println("\n========== RESULTADO ==========");
        System.out.println(equipoLocal.getNombre()
                + " " + golesLocal + " - "
                + golesRival + " " + rival);

        if (golesLocal > golesRival) {
            System.out.println("¡Victoria!");
        } else if (golesLocal < golesRival) {
            System.out.println("Derrota.");
        } else {
            System.out.println("Empate.");
        }
    }

    private int calcularGoles(int ataque, Random random) {
        int bonus = Math.min(2, ataque / 150);
        return random.nextInt(3) + bonus;
    }
}