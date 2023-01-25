public class Libro {
    private Autore autore;
    private String titolo;
    private int numeroPagine;

    public Libro(Autore autore, String titolo, int numeroPagine) {
        this.autore = autore;
        this.titolo = titolo;
        this.numeroPagine = controlloPagine(numeroPagine);
    }

    public int controlloPagine(int numeroPagine){
        if (numeroPagine == 0){
            System.out.println("Non esistono libri con 0 pagine. Pagine impostate a 1");
            return 1;
        }

        return numeroPagine;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
