package md.tekwill.topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        int result = Methods.sum(15, 10);
        System.out.println(result);

        int result1 = Methods.sum(15, 15);
        System.out.println(result1);

        int result2 = Methods.sum(10, 15);
        System.out.println(result2);

        Methods.sum(7.4);

        Persoana persoana1 = new Persoana("Malai", "Steliana", 35);
        Persoana persoana2 = new Persoana("Petrut", "Nicoleta", 5);
        Persoana persoana3 = new Persoana("Mircea", "Dorin", 15);
        Persoana persoana4 = new Persoana("Vlas", "Anastasia", 66);

        persoana1.categorieDeVarsta();
        persoana2.categorieDeVarsta();
        persoana3.categorieDeVarsta();
        persoana4.categorieDeVarsta();

    }
}




