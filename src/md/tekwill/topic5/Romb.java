package md.tekwill.topic5;

public class Romb extends FiguraGeometrica {
    private double diagonalaMare;
    private double diagonalaMica;

    private double laturaMare;
    private double laturaMica;


    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if (diagonalaMare > diagonalaMica && diagonalaMica > 0 && diagonalaMare > 0) {
            System.out.println("Valorile introduse sunt corecte");
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
        } else {
            System.out.println("Valoarea este incorecta");

        }
    }

    public void setLaturi(double laturaMare, double laturaMica) {
        if (laturaMare > laturaMica && laturaMare > 0 && laturaMica > 0) {
            System.out.println("Valorile introduse sunt corecte");
            this.laturaMica = laturaMica;
            this.laturaMare = laturaMare;
        } else {
            System.out.println("Valoarea este incorecta");
        }
    }

    public double getDiagonalaMica() {
        return diagonalaMica;
    }

    public double getDiagonalaMare() {
        return diagonalaMare;
    }

    public double getLaturaMare() {
        return laturaMare;
    }

    public double getLaturaMica() {
        return laturaMica;
    }

    @Override
    public double calculeazaAria() {
        this.ariaFigurii = (diagonalaMare * diagonalaMica / 2);
        return this.ariaFigurii;
    }

    @Override
    public double calculeazaPerimetrul() {
        this.perimetrulFigurii = (2 * laturaMare + 2 * laturaMica);
        return this.perimetrulFigurii;
    }
}
