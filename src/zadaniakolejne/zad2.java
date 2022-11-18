package zadaniakolejne;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int b =1;
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj prędkość w kilometrach na godzine");
        int v = liczba.nextInt();
        System.out.println("Podaj czas");
        int czas = liczba.nextInt();
        for(int a= 1; a<czas; a++){

            System.out.println("Przebyta odległosć w ciagu jednej godziny: "+v*b++);
        }
    }
}
