package Practica_3;

public class Juego2 {
    protected int numeroDeVidas;
    protected int record;

    public Juego2(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = 3;
        System.out.println("Nueva partida. Tienes " + numeroDeVidas + " vidas.");
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("¡Nuevo record! Tus vidas sobrantes: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
            return true;
        } else {
            System.out.println("Te has quedado sin vidas.");
            return false;
        }
    }
}
