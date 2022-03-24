package md.tekwill.topic5;

public class Patrat extends FiguraGeometrica {
    private double latura;

    public void setLatura(double latura) {
        if (latura < 0) {
            System.out.println("Valoarea este gresita");
        } else {
            System.out.println("Valoarea este corecta");
            this.latura = latura;
        }

    }

    public double getLatura() {
        return latura;
    }

    @Override
    public double calculeazaPerimetrul() {
        this.perimetrulFigurii = 4 * latura;
        return this.perimetrulFigurii;
    }

    @Override
    public double calculeazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }
}
