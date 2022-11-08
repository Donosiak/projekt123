package zadania123;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund");
                int czas = liczby.nextInt();
        double minuta, godzina, dzien;
        minuta = (double)czas/60;
        godzina = (double)czas/3600;
        dzien =(double)czas/86400;
        if(czas>=86400){
            System.out.println("Czas w dniach: "+dzien);
        }
        else if(czas>=3600){
            System.out.println("Czas w godzinach: "+godzina);
        }
        else if (czas>=60){
            System.out.println("Czas w minutach: "+minuta);
        }
    }
}
