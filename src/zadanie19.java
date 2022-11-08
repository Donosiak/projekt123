import java.util.Scanner;

public class zadanie19 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner (System.in);
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;
        double ciastka = 48;
        System.out.println("Podaj ilość ciastek które chcesz zrobić: ");
        double liczbaCiastek = liczba.nextDouble();
        double jedencukier, jednomaslo,jednamaka;
        jedencukier = cukier/ciastka;
        jednomaslo = maslo/ciastka;
        jednamaka = maka/ciastka;
        double ilosccukru,iloscmasla,iloscmaki;
        ilosccukru = liczbaCiastek*jedencukier;
        iloscmasla = liczbaCiastek*jednomaslo;
        iloscmaki = liczbaCiastek*jednamaka;
        System.out.println("Ilość szklanek cukru: "+ilosccukru);
        System.out.println("Ilość szklanek masła: "+iloscmasla);
        System.out.println("Ilość szklanek mąki: "+iloscmaki);




    }
}
