package zadania123;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj liczbe zakupionych pakietów");
        double ilosc = liczby.nextDouble();
        double cena = 99;
        double rabat;
        double wartosc;
        double znizka;
        double calkowitaCena;
        wartosc = cena * ilosc;
        if (ilosc >= 100) {
            rabat = 0.50;
            znizka = rabat * wartosc;
            calkowitaCena = wartosc - znizka;

            System.out.println("Rabat wynosi: " + rabat + "Łączna cena zakupu po rabacie: " + calkowitaCena);
        } else if (ilosc <= 99 && ilosc >=50){
            rabat = 0.40;
            znizka = rabat * wartosc;
            calkowitaCena = wartosc - znizka;

            System.out.println("Rabat wynosi: " + rabat + "Łączna cena zakupu po rabacie: " + calkowitaCena);

        }
        else if (ilosc <= 49 && ilosc >=30){
            rabat = 0.30;
            znizka = rabat * wartosc;
            calkowitaCena = wartosc - znizka;
            System.out.println("Rabat wynosi: " + rabat + "Łączna cena zakupu po rabacie: " + calkowitaCena);
        }
        else if (ilosc <= 19 && ilosc >=10){
            rabat = 0.20;
            znizka = rabat * wartosc;
            calkowitaCena = wartosc - znizka;
            System.out.println("Rabat wynosi: " + rabat + "Łączna cena zakupu po rabacie: " + calkowitaCena);
        }
    }
}

