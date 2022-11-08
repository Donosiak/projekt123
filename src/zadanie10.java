import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner wartoscProduktu = new Scanner(System.in);
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        System.out.println("Podaj cenę produktu: ");
        double produkt = wartoscProduktu.nextDouble();
        wartoscProduktu.nextLine();
        double cena1;
        cena1 = podatekStanowy * produkt;
        double cena2;
        cena2 = podatekLokalny * produkt;
        double suma;
        suma = produkt + cena1 + cena2;
        System.out.println("Cena wynosi: " +produkt+" Pierwszy podatek: " +
                cena1 + " Drugi podatek: " + cena2 +
                " Łączna cena sprzedaży: " + suma );




    }
}
