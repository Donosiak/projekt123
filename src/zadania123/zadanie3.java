package zadania123;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj wzrost w metrach");
                double wzrost = liczby.nextDouble();
        System.out.println("Podaj wagę w kg");
        double waga = liczby.nextDouble();
        double bmi;
        double potega;
        potega = Math.pow(wzrost, 2);
        bmi = waga/potega;
        if(bmi < 18.5){
            System.out.println("Niedowaga");

        }
        else if (bmi > 25){
            System.out.println("Nadwaga");
        }
        else if(bmi < 25){
            System.out.println("Waga prawidłowa");
        }
    }
}
