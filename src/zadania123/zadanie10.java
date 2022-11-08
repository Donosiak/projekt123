package zadania123;

import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj liczbe kalorii");
        double kalorie = liczby.nextDouble();
        System.out.println("Podaj gramy tłuszcu w produkcie");
        double tluszc = liczby.nextDouble();
        double kalorieZ, procent;
        kalorieZ = tluszc*9;
        procent = kalorieZ/kalorie;
        if(kalorieZ>kalorie){
            System.out.println("Podano złe dane");
        }
        else {
            System.out.println(procent);
        }
         if(procent<=0.30){
            System.out.println("Produkt nisko tłuszczowy");
        }
         else{
             System.out.println("Odpowiednia wartość tłuszczowa");
         }



    }
}
