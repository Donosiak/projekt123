import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner liczby  = new Scanner(System.in);
        System.out.println("Podaj liczbe kilometrów: ");
        double przejechaneKilometry = liczby.nextDouble();
        liczby.nextLine();
        System.out.println("Podaj zużyte litry paliwa: ");
        double litryPaliwa = liczby.nextDouble();
        double kilometryNaLitrze;
        kilometryNaLitrze = przejechaneKilometry/litryPaliwa;
        System.out.println("Przejechane kilometry: " +przejechaneKilometry +
                " Zużyte litry paliwa: " + litryPaliwa +
                " Kilometry na litrze: " +kilometryNaLitrze );

    }
}
