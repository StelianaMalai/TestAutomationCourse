package md.tekwill.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cercAlfa = new Cerc();
        Patrat patratBeta = new Patrat();
        Romb rombGamma = new Romb();

        cercAlfa.setRazaCercului(78.8998);
        cercAlfa.calculeazaAria();
        System.out.println("Aria cercului va avea valoarea: " + cercAlfa.calculeazaAria());

        cercAlfa.calculeazaPerimetrul();
        System.out.println("Perimetrul cercului va avea valoarea: " + cercAlfa.calculeazaPerimetrul());


        rombGamma.setDiagonale(45.55, 11.47);
        System.out.println("Aria rombului va avea valoarea: " + rombGamma.calculeazaAria());

        rombGamma.setLaturi(445, 9.10);
        rombGamma.calculeazaPerimetrul();
        System.out.println("Perimetrul rombului va avea valoarea: " + rombGamma.perimetrulFigurii);

        patratBeta.setLatura(52.789);
        patratBeta.calculeazaPerimetrul();
        System.out.println("Perimetrul patratului va avea valoarea: " + patratBeta.getPerimetrulFigurii());

        patratBeta.calculeazaAria();
        System.out.println("Aria patratului va avea valoarea: " + patratBeta.ariaFigurii);
    }

}


