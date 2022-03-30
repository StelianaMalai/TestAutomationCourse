package md.tekwill.topic6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ContulPersoanei contul01 = new ContulPersoanei();
        contul01.setNumePersoana("Aura");
        contul01.setId(1589756979);
        contul01.setSumaCurenta(10000.00);

        System.out.println("Introduceti nr de persoane: ");

        Scanner cititor = new Scanner(System.in);
        int numarDePersoane = cititor.nextInt();

        System.out.println("Soldul curent impratit la " + numarDePersoane + " persoane " + contul01.imparteSoldulLaNrPersoane(numarDePersoane));
        contul01.transferCatrePersoanaCuDateDinFisier("Directoriu random");

    }


}
