
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppEmpresaXG {
    public static void main(String[] args) {
        Map<String, Contido> mapilla = new HashMap<>();
        Set<String> actorinos = new HashSet<>();
        Deque<String> ointillos = new ArrayDeque<>();

        String a1 = "daik";
        String a2 = "gose";
        String a3 = "ribeiro";

        Pelicula p1 = new Pelicula("a", "la vida de yulio", 50, actorinos);
        Pelicula p2 = new Pelicula("b", "la vida de sosendo", 520, actorinos);

        p1.engadirActorillos(a1);
        p1.engadirActorillos(a2);
        p1.engadirActorillos(a3);

        p2.engadirActorillos(a1);
        p2.engadirActorillos(a2);
        p2.engadirActorillos(a3);

        Podcast po1 = new Podcast("c", "chiguagua rabioso documental", 510, ointillos);
        Podcast po2 = new Podcast("bf", "chiguagua bueno documental", 5, ointillos);

        po1.engadirOinte(a1);
        po1.engadirOinte(a2);
        po1.engadirOinte(a3);

        po2.engadirOinte(a1);
        po2.engadirOinte(a2);
        po2.engadirOinte(a3);

        mapilla.put("a1", p1);
        mapilla.put("a2", p2);

        mapilla.put("b1", po1);
        mapilla.put("b2", po2);

        for (Map.Entry<String, Contido> elemento : mapilla.entrySet()) {
            String clave = elemento.getKey();
            Contido valor = elemento.getValue();
            System.out.println("Clave: " + clave + " valor: " + valor);

            if (valor instanceof Reproducivel) {
                ((Reproducivel) valor).reproducir();
            }
            if (valor instanceof Descargavel) {
                ((Descargavel) valor).descargar();
            }
            if (valor instanceof Podcast) {
                ((Podcast) valor).sacarOinte();
            }
        }
    }
}
