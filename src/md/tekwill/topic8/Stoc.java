package md.tekwill.topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc(int stocIdAtribuit, String adresaMagazinAtribuita) {
        stocId = stocIdAtribuit;
        adresaMagazin = adresaMagazinAtribuita;
        cartileDinStoc = new ArrayList<>();
    }

    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc;

    public void adaugaCarteStoc(Carte CarteAdaugata) {
        this.cartileDinStoc.add(CarteAdaugata);
        System.out.println(CarteAdaugata.toString() + "A fost adaugata in stocul: " + stocId + " in magazinul de pe adresa " +
                adresaMagazin);
    }

    public void stergeCarteDinStoc(Carte CartePeCareOStergem) {
        boolean carteaAFostStearsa = this.cartileDinStoc.remove(CartePeCareOStergem);
        if (carteaAFostStearsa) {
            System.out.println(CartePeCareOStergem.toString() + "a fost stearsa din stocul " + stocId + " din magazinul de pe adresa " +
                    adresaMagazin);
        } else {
            System.out.println("Stergerea nu a avut loc");
        }

    }

    public boolean existaCarteInStoc(Carte CarteInvestigata) {
        return this.cartileDinStoc.contains(CarteInvestigata);
    }

    public int numarDeCartiInStocCurent() {
        return this.cartileDinStoc.size();
    }

    public boolean esteStoculGol() {
        return this.cartileDinStoc.isEmpty();
    }
}
