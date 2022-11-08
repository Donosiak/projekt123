import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner cena = new Scanner(System.in);
        System.out.println("Podaj cene posiłku: ");
        double cena1 = cena.nextDouble();
        double podatek = 0.0675;
        double napiwek = 0.20 * (cena1+podatek);
        double cenaPodatku = podatek * cena1;
        double kwota = napiwek + cenaPodatku + cena1;
        System.out.print("Cena posiłku: " +cena1+ " Wartość podatku: "+cenaPodatku+
                "Wysokość napiwku: "+napiwek+ "Łączna kwota: "+kwota);



    }
}
