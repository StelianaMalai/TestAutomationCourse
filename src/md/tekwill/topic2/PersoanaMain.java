package md.tekwill.topic2;

public class PersoanaMain {
    public static void main(String[] args) {
        Persoana ionPersoana = new Persoana();

        ionPersoana.numePersoana = "Ionut";
        ionPersoana.seteazaGreutatea(25);
        System.out.println(ionPersoana.getGreutateaPersoana());
    }
}
