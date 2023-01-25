import java.util.Date;

public class Autore {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String dataMorte;

    public Autore(String nome, String cognome, String dataNascita, String dataMorte) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.dataMorte = dataMorte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(String dataMorte) {
        this.dataMorte = dataMorte;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", dataMorte=" + dataMorte +
                '}';
    }
}
