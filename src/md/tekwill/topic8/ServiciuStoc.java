package md.tekwill.topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte miculPrint = new Carte("Micul Print", "Antoine Saint Exupery", 56484656, 50);
        Carte putereaPrezentului = new Carte("Puterea prezentului", "Ekhart Tolle", 564946788, 300);
        Carte scrisoaseCatreTata = new Carte("Scrisoare catre tata", "Franz Kafka", 6798787, 100);
        Carte ziuaInCareAmInvatatSaTraiesc = new Carte("Ziua in care am inavat sa traiesc", "Laurent Gounelle", 5489789, 200);
        Carte povesteaMea = new Carte("Poveste mea", "Michelle Obama", 545487, 500);

        Stoc magazinulDinCentru = new Stoc(10, "str. Stefan cel Mare, 52");
        Stoc magazinulDeLaBuiucani = new Stoc(5, "str. Alba Iulia,20");

        magazinulDeLaBuiucani.adaugaCarteStoc(miculPrint);
        magazinulDeLaBuiucani.adaugaCarteStoc(scrisoaseCatreTata);
        magazinulDeLaBuiucani.adaugaCarteStoc(putereaPrezentului);

        System.out.println("In magazinul de la Buiucani sunt carti: " + magazinulDeLaBuiucani.numarDeCartiInStocCurent());

        magazinulDinCentru.adaugaCarteStoc(povesteaMea);

        magazinulDeLaBuiucani.stergeCarteDinStoc(miculPrint);
        System.out.println("In magazinul de la Buiucani sunt: " + magazinulDeLaBuiucani.numarDeCartiInStocCurent());

        magazinulDinCentru.numarDeCartiInStocCurent();

        System.out.println(magazinulDinCentru.esteStoculGol());
        System.out.println(magazinulDinCentru.existaCarteInStoc(povesteaMea));
    }
}
