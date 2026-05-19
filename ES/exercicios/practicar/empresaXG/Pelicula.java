/*
Crea a clase `Pelicula` que herde de `Contido` e implemente as dúas interfaces . 
Para os seus actores, utiliza unha colección que **non permita duplicados** e implementa 
un método para engadilos .
 */

import java.util.HashSet;
import java.util.Set;

public class Pelicula extends Contido implements Descargavel, Reproducivel {
    private Set<String> actorillos = new HashSet<>();

    public Pelicula(String id, String titulo, int minutos, Set<String> actorillos) {
        super(id, titulo, minutos);
        this.actorillos = actorillos;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducindo unha peliculeira de nome " + this.getTitulo());
    }

    @Override
    public void descargar() {
        System.out.println("Descargando unha peliculeira de nome " + this.getTitulo());
    }

    public Set<String> getActorillos() {
        return actorillos;
    }

    public void setActorillos(Set<String> actorillos) {
        this.actorillos = actorillos;
    }

    public void engadirActorillos(String actorillo) {
        this.actorillos.add(actorillo);
    }
}
