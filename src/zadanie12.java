import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner dane = new Scanner (System.in);
        int kaloriePorcji = 300;
        double kalorieCiastka;
        kalorieCiastka = (double)kaloriePorcji/4;
        System.out.println("Podaj ilość zjedzonych ciasteczek: ");
        int ciastka = dane.nextInt();
        double kalorieZjedzonychCiastek;
        kalorieZjedzonychCiastek = ciastka * kalorieCiastka;
        System.out.println("Liczba zjedzonych kalori: "+kalorieZjedzonychCiastek);

    }
}

