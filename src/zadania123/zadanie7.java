package zadania123;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner imiona = new Scanner(System.in);
        System.out.println("Podaj pierwsze imię");
        String imie = imiona.nextLine();
        System.out.println("Podaj drugie imię");
        String imie2 = imiona.nextLine();
        System.out.println("Podaj trzecie imię");
        String imie3 = imiona.nextLine();
        if(imie.compareToIgnoreCase(imie2)<0&& imie.compareToIgnoreCase(imie3)<0) {
            System.out.println(imie);
            if (imie2.compareToIgnoreCase(imie3) < 0) {
                System.out.println(imie2);
                System.out.println(imie3);
            } else {
                System.out.println(imie3);
                System.out.println(imie2);
            }
            if (imie2.compareToIgnoreCase(imie3) < 0 && imie2.compareToIgnoreCase(imie) < 0) {
                System.out.println(imie2);
            } else if (imie.compareToIgnoreCase(imie3) < 0) {
                System.out.println(imie);
                System.out.println(imie3);
            } else {
                System.out.println(imie3);
                System.out.println(imie);
            }
            if (imie3.compareToIgnoreCase(imie) < 0 && imie3.compareToIgnoreCase(imie2) < 0) {
                System.out.println(imie3);
                if (imie.compareToIgnoreCase(imie2) < 0) {
                    System.out.println(imie);
                    System.out.println(imie2);
                } else {
                    System.out.println(imie2);
                    System.out.println(imie);
                }
            }
        }
    }
}

