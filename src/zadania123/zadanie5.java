package zadania123;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj masę obiektu");
        double masa = liczby.nextDouble();
        double ciezar;
        double liczba = 9.8;
        ciezar = masa * liczba;
        System.out.println("Ciężar wynosi: "+ciezar);
        if (ciezar > 1000) {
            System.out.println("Obiekt jest za ciężki");
        } else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        }
    }
}
