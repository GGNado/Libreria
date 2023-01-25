import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libri;
    private ArrayList<Autore> autori;

    public Libreria(){
        libri = new ArrayList<>();
        autori = new ArrayList<>();
    }
    public void addLibro(Libro libro){
        libri.add(libro);

        if (!autori.contains(libro.getAutore()))
            autori.add(libro.getAutore());
    }

    public Libro existLibro(Libro libro){
        if (libri.contains(libro))
            return libro;
        return null;
    }

    public void removeLibro(Libro libro){
        boolean flag = libri.removeIf(p -> p.equals(libro));
        if (flag)
            System.out.println("Libro rimosso");
        else
            System.out.println("Libro non in libreria");
    }

    public Autore cercaAutore(String cognome){
        for (Autore autore : autori)
            if (autore.getCognome().equalsIgnoreCase(cognome))
                return autore;

        return null;
    }

    @Override
    public String toString() {
        return "Libreria{" + "libri=" + libri + '}';
    }
}
