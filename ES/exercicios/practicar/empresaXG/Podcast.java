/*
Crea a clase `Podcast` que herde de `Contido` e implemente só `Reproducible`. 
Para os seus oíntes, utiliza unha colección tipo **FIFO** que garde a orde de chegada, 
con métodos para poñer xente á espera e para sacalos da espera . */

import java.util.ArrayDeque;
import java.util.Deque;

public class Podcast extends Contido implements Reproducivel {
    Deque<String> ointes = new ArrayDeque<>(); // cola

    @Override
    public void reproducir() {
        System.out.println("Reproducindo un podcasteiro de nome " + this.getTitulo());
    }

    public void engadirOinte(String ointillo) {
        ointes.addLast(ointillo); // congruente
    }

    public void sacarOinte() {
        ointes.poll();
    }

    public Podcast(String id, String titulo, int minutos, Deque<String> ointes) {
        super(id, titulo, minutos);
        this.ointes = ointes;
    }

    public Deque<String> getOintes() {
        return ointes;
    }

    public void setOintes(Deque<String> ointes) {
        this.ointes = ointes;
    }

}
