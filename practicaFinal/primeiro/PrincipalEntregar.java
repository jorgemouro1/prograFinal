import java.util.Arrays;

public class PrincipalEntregar {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];

        Serie s1 = new Serie("penillo", 5, false, "vaxabuca", "gosendus");
        Serie s2 = new Serie("gosendini", 3, true, "thriller", "gosendus");
        Serie s3 = new Serie("psoeg", 4, false, "crunch", "sulius");
        Serie s4 = new Serie("pp", 1, true, "terror", "jorgefeijo");
        Serie s5 = new Serie("vox", 7, true, "gosende", "oitaven");

        series[0] = s1;
        series[1] = s2;
        series[2] = s3;
        series[3] = s4;
        series[4] = s5;

        Videoxogo[] videoxogos = new Videoxogo[5];
        Videoxogo v1 = new Videoxogo("cod", 43, false, "gore", "ubisoft");
        Videoxogo v2 = new Videoxogo("fornait", 5, true, "forza", "activision");
        Videoxogo v3 = new Videoxogo("megahucha", 100, false, "lucha", "epic games");
        Videoxogo v4 = new Videoxogo("brawl", 250, false, "carreira", "riot");
        Videoxogo v5 = new Videoxogo("desterrado", 23, true, "carreirillas", "gasendi");

        videoxogos[0] = v1;
        videoxogos[1] = v2;
        videoxogos[2] = v3;
        videoxogos[3] = v4;
        videoxogos[4] = v5;

        s2.devolver();

        v2.devolver();

        System.out.println("--------------");
        int contadorVideoxogo = 0;
        for (int i = 0; i < videoxogos.length; i++) {
            if (videoxogos[i].isEntregado()) {
                contadorVideoxogo++;
                videoxogos[i].devolver();
            }
        }
        System.out.println("Videoxogos entregados: " + contadorVideoxogo);

        System.out.println("--------------");

        int contadorSerie = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                contadorSerie++;
                series[i].devolver();
            }
        }
        System.out.println("Series entregadas: " + contadorSerie);

        System.out.println("--------------");

        Arrays.sort(series);
        System.out.println("Serie con máis tempadas: " + series[series.length - 1]);

        Arrays.sort(videoxogos);
        System.out.println("Videoxogo con máis horas estimadas: " + videoxogos[videoxogos.length - 1]);
    }
}
