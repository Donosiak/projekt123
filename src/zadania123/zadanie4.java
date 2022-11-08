package zadania123;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner oceny = new Scanner(System.in);
        System.out.println("Podaj pierwszy wynik");
                double wynik = oceny.nextDouble();
        System.out.println("Podaj drugi wynik");
        double wynik2 = oceny.nextDouble();
        System.out.println("Podaj trzeci wynik");
        double wynik3 = oceny.nextDouble();
        double srednia;
        srednia = (wynik+wynik2+wynik3)/3;
        if(srednia>=90 && srednia<=100){
            System.out.println("Ocena 5");
        }
        else if(srednia>=80&& srednia<=89){
            System.out.println("Ocena 4");
        }
        else if (srednia>=70&&srednia<=79){
            System.out.println("Ocena 3");

        }
        else if (srednia>=60&&srednia<=69){
            System.out.println("Ocena 2");
        }
        else if(srednia<60){
            System.out.println("Ocena 1");
        }
    }
}
