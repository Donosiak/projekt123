package zadaniakolejne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String nazwaPliku;
        System.out.println("Podaj nazwe pliku ");
        nazwaPliku = keyboard.nextLine();
        File mojPlik = new File(nazwaPliku);
        if (!mojPlik.exists()){
            System.out.println("Plik nie istnieje ");
            System.exit(0);

        }
        Scanner czyPlik = new Scanner(mojPlik);
        while (czyPlik.hasNext()){
            String linia = czyPlik.nextLine();
            System.out.println("Kolejna linia pliku to "+linia);
        }
        czyPlik.close();
        String znak;
        System.out.println("Podaj znak");
        znak = keyboard.nextLine();
        int e = 0;
        int ilosc = nazwaPliku.length();
        char litera = znak.charAt(0);
        char inic;
        for(int i = 0;i<ilosc;i++){
            inic=nazwaPliku.charAt(i);
            if(inic==litera)
            {
                e=e=1;
            }
        }
    }
}