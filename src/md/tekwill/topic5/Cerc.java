package md.tekwill.topic5;

public class Cerc extends FiguraGeometrica {
    private double razaCercului;

    public void setRazaCercului(double razaCercului) {
        if (razaCercului < 0) {
            System.out.println("Valoarea este gresita");
        } else {
            System.out.println("Valoarea este corecta");
            this.razaCercului = razaCercului;
        }
    }

    public double getRazaCercului() {
        return razaCercului;
    }

    @Override
    public double calculeazaAria() {
        this.ariaFigurii = 3.14 * razaCercului * razaCercului;
        return this.ariaFigurii;
    }

    public double calculeazaPerimetrul() {
        this.perimetrulFigurii = 3.14 * 2 * razaCercului;
        return this.perimetrulFigurii;
    }
}
