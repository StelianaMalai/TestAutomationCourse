package md.tekwill.topic1;

public class Angajat {
    public Angajat(String numeAtribuit, int virstaAtribuit){
        nume = numeAtribuit;
        virsta = virstaAtribuit;
    }

        String nume;
        int virsta;
        double salariu;
        String gen;

        public void areSalariu () {
            System.out.println(nume +" " + "are salariul de 1000 mdl");

        }
        public void areGenul () {
            System.out.println(nume + " " + "are genul feminin");
        }

    }


