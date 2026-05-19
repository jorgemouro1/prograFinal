public class Serie implements Entregable, Comparable<Serie> {
    private String titulo;
    private int numeroTempadas = 3;
    private boolean prestado = false;
    private String xenero;
    private String creador;

    public Serie() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTempadas() {
        return numeroTempadas;
    }

    public void setNumeroTempadas(int numeroTempadas) {
        this.numeroTempadas = numeroTempadas;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTempadas, boolean prestado, String xenero, String creador) {
        this.titulo = titulo;
        this.numeroTempadas = numeroTempadas;
        this.prestado = prestado;
        this.xenero = xenero;
        this.creador = creador;
    }

    @Override
    public void entregar() {
        System.out.println("Serie entregada, nome: " + this.getTitulo());
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("Serie devolta, nome: " + this.getTitulo());
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        if (this.prestado == true) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo + ", numeroTempadas=" + numeroTempadas + ", prestado=" + prestado + ", xenero="
                + xenero + ", creador=" + creador + "]";
    }

    @Override
    public int compareTo(Serie o) {
        if (this.getNumeroTempadas() > o.getNumeroTempadas()) {
            return 1;
        }
        if (this.getNumeroTempadas() < o.getNumeroTempadas()) {
            return -1;
        } else {
            return 0;
        }
    }

}
