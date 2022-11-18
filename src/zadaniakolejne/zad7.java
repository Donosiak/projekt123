package zadaniakolejne;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczbaPieter, liczbaPokojow, liczbaZajetychPokojow;
        double poziomOblozenia=0;
        double lacznaLiczbaZP=0;
        double lacznaIloscPokoi = 0, wolnychPokoi=0, liczbaWolnychPokoi=0;
        System.out.println("Podaj liczbe pięter");
        liczbaPieter= klawiatura.nextInt();


        for(int i = 0;i<liczbaPieter;i++){
            System.out.println("Piętro "+(i+1));
            System.out.println("Podaj liczbe pokojów");
            liczbaPokojow=klawiatura.nextInt();
            System.out.println("Podaj liczbe zajętych pokojów ");
            liczbaZajetychPokojow = klawiatura.nextInt();
            lacznaIloscPokoi += liczbaPokojow;
            lacznaLiczbaZP += liczbaZajetychPokojow;
            wolnychPokoi =liczbaPokojow-liczbaZajetychPokojow;
            liczbaWolnychPokoi+=wolnychPokoi;
            System.out.println("Wolne pokoje "+wolnychPokoi);
            poziomOblozenia = lacznaLiczbaZP/lacznaIloscPokoi;

        }
        System.out.println("Łączna liczba zajetych pokoi: "+lacznaLiczbaZP);
        System.out.println("Łączna liczba wolnych pokoi:" +liczbaWolnychPokoi);
        System.out.println("Łączna liczba pokoi: "+lacznaIloscPokoi);
        System.out.println("Poziom obłożenia: "+poziomOblozenia);
    }
}
