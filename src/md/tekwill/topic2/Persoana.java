package md.tekwill.topic2;

public class Persoana {

    public String prenumePersoana;
    protected String numePersoana;
    private int greutatePersoana;

    public void seteazaGreutatea(int greutatePersoanaAtribuita) {
        this.greutatePersoana = greutatePersoanaAtribuita;
        System.out.println("Greutatea persoanei este urmatoarea:"+this.greutatePersoana);}

    public int getGreutateaPersoana() {
        return this.greutatePersoana;
    }
}


