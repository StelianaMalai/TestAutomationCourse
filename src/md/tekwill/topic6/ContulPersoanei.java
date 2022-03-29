package md.tekwill.topic6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ContulPersoanei {

    private String numePersoana;
    private int id;
    private double sumaCurenta;

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Soldul nu poate fi negativ");
    }

    public String getNumePersoana() {
        return this.numePersoana;
    }

    public int getId() {
        return this.id;
    }

    public double getSumaCurenta() {
        return this.sumaCurenta;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Sold insuficient de mijloace banesti");
        }
        return sumaCurenta - sumaExtrasa;
    }

    public int imparteSoldulLaNrPersoane(int nrPersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / nrPersoane;
        } catch (ArithmeticException exceptieObiect) {
                System.out.println("Ai introdus valoare 0,deci returnam 0");
            }
            return result;
        }
        public void transferCatrePersoanaCuDateDinFisier(String directoriuCuFisier) throws FileNotFoundException {
            File datelePentrUTransfer01 = new File(directoriuCuFisier);
            FileReader fileReader01 = new FileReader(datelePentrUTransfer01);
        }
    }
