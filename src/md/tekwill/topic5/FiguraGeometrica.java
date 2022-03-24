package md.tekwill.topic5;

public abstract class FiguraGeometrica {
    protected double ariaFigurii;
    protected double perimetrulFigurii;

    public abstract double calculeazaAria();

    public abstract double calculeazaPerimetrul();

    public double getPerimetrulFigurii() {
        return perimetrulFigurii;
    }

    public double getAriaFigurii() {
        return ariaFigurii;
    }
}



