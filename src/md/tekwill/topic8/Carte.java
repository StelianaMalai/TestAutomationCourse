package md.tekwill.topic8;

public class Carte {
    public Carte(String titluCarteAtribuit, String autorAtribuit, long numarDeSerieAtribuit, int paginiAtribuite) {
        titluCarte = titluCarteAtribuit;
        autor = autorAtribuit;
        numarDeSerie = numarDeSerieAtribuit;
        pagini = paginiAtribuite;
    }

    private String titluCarte;
    private String autor;
    private long numarDeSerie;
    private int pagini;

    @Override
    public String toString() {
        return "Carte{" +
                "titluCarte='" + titluCarte + '\'' +
                ", autor='" + autor + '\'' +
                ", numarDeSerie=" + numarDeSerie +
                ", pagini=" + pagini +
                '}';
    }
}
