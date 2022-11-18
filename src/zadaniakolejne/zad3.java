package zadaniakolejne;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class zad3 {
    public static void main(String[] args) throws IOException {
        int b =1;
        Scanner liczba = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("tekst.txt");
        System.out.println("Podaj prędkość w kilometrach na godzine");
        int v = liczba.nextInt();
        System.out.println("Podaj czas");
        int czas = liczba.nextInt();
        for(int a= 1; a<czas; a++){
            int wynikK;
            wynikK= v*b++;
            pw.println("Przebyta droga  w ciagu" + a+ "godziny"+wynikK);


        }
        pw.close();
    }
}