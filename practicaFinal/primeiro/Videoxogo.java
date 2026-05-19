public class Videoxogo implements Entregable, Comparable<Videoxogo> {
    private String titulo;
    private int horasEstimadas;
    private boolean prestado = false;
    private String xenero;
    private String compania;

    public Videoxogo() {
    }

    @Override
    public String toString() {
        return "Videoxogo [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", prestado=" + prestado
                + ", xenero=" + xenero + ", compania=" + compania + "]";
    }

    public Videoxogo(String titulo, int horasEstimadas, boolean prestado, String xenero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.prestado = prestado;
        this.xenero = xenero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        System.out.println("Videoxogo entregado, nome: " + this.getTitulo());
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("Videoxogo devolto, nome: " + this.getTitulo());
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        if (this.prestado == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Videoxogo o) {
        if (this.getHorasEstimadas() > o.getHorasEstimadas()) {
            return 1;
        }
        if (this.getHorasEstimadas() < o.getHorasEstimadas()) {
            return -1;
        } else {
            return 0;
        }
    }

}
