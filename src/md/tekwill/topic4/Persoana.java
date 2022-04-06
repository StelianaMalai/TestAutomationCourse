package md.tekwill.topic4;

public class Persoana {
    public Persoana(String numeAtribuit, String prenumeAtribuit, int varstaAtribuita) {
        nume = numeAtribuit;
        prenume = prenumeAtribuit;
        varsta = varstaAtribuita;
    }

    String nume;
    String prenume;
    int varsta;

    public void categorieDeVarsta() {
        if (varsta <= 14) {
            System.out.println("Persoana inregistrata se incadreaza in categoria de varsta 'COPII' si are varsta de " + this.varsta + " ani");
        } else if (varsta <= 23) {
            System.out.println("Persoana inregistrata se incadreaza in categoria de varsta'ADOLESCENTI' si are varsta de " + this.varsta + " ani");
        } else if (varsta <= 65) {
            System.out.println("Persoana se incadreaza in categoria de varsta ' MATURI' si are varsta de " + this.varsta + " ani");
        } else {
            System.out.println("Persoana se incadreaza in categoria de varsta 'VARSTNICI' si are varsta de " + this.varsta + " ani");

        }

    }
}
