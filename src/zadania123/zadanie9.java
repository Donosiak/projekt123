package zadania123;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj wage przesyłki");
        double waga = liczby.nextDouble();
        System.out.println("Podaj odległość przesyłki");
        double odleglosc = liczby.nextDouble();
        double stawka;
        double km;
        km = 500/odleglosc;
        if(km<=500){
            if(waga <=1){
                stawka = 1.1;
                System.out.println("Cena wynosi: "+stawka);
            }
            else if(waga>=1 && waga <=3){
                stawka = 2.2;
                System.out.println("Cena wynosi: "+stawka);
            }
            else if(waga>=3 && waga<=5){
                stawka = 3.70;
                System.out.println("Cena wynosi: "+stawka);
            }
            else if(waga>=5){
                stawka = 3.80;
                System.out.println("Cena wynosi: "+stawka);
            }
        }

    }
}
