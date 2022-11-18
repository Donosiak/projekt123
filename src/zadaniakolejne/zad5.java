package zadaniakolejne;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner zdanie = new Scanner(System.in);
        int a =0;
        System.out.println("Podaj słowo do sprawdzenia: ");
        String nazwaPliku = zdanie.nextLine();
        System.out.println("Podaj znak");
        String znak = zdanie.nextLine();
        int ilosc = nazwaPliku.length();
        char e;
        char litera1 = znak.charAt(0);
        for(int i=0 ;i<ilosc;i++){
            e= nazwaPliku.charAt(i);
            if(e ==litera1)
            {
                a=a+1;
            }
        }
        System.out.println("Znak " +znak+" wystepuje "+a+" razy w słowie " +nazwaPliku);
    }
}
