package zadaniakolejne;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner liczby= new Scanner(System.in);
        System.out.println("Podaj ilość przepracowanych dni");
        int dni = liczby.nextInt();
        int b =2;
        double zarobki = 0;
        for(int a=0;a<dni;a++){
            double wynik=1;
            double wynikK=0;
            wynikK=Math.pow(b,a);
            wynik = wynikK/100;
            zarobki +=wynik;
            System.out.println("Zarobek w " +(a+1)+" dniu: " +wynik+ "złotych");
        }
        System.out.println("Zarobki całkowite "+zarobki+ " złotych");
    }
}
