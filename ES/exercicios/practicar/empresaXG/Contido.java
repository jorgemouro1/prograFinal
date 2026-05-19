public abstract class Contido implements Comparable<Contido> {
    private final String id;
    private String titulo;
    private int minutos;

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Contido(String id, String titulo, int minutos) {
        this.id = id;
        this.titulo = titulo;
        this.minutos = minutos;
    }

    @Override
    public int compareTo(Contido o) {
        if (this.getMinutos() > o.getMinutos()) {
            return 1;
        }
        if (this.getMinutos() < o.getMinutos()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Contido [id=" + id + ", titulo=" + titulo + ", minutos=" + minutos + "]";
    }

}
