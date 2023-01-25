import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autore autore = new Autore("Luigi", "Massa","2005-06-24", "2100-10-24");
        Libreria libreria = new Libreria();

        Libro libro = new Libro(autore, "Che schifo il basket", 9);
        Libro libro1 = new Libro(autore, "Pallavolo >>> basket", 0);
        Libro libro2 = new Libro(autore, "fiori", 10);

        libreria.addLibro(libro);
        libreria.addLibro(libro1);

        System.out.println(libreria);

        System.out.println(libreria.existLibro(libro2));
        libreria.removeLibro(libro1);
        System.out.println("\n" + libreria);

        System.out.println(libreria.cercaAutore("massa"));


    }
}