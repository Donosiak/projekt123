import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner oceny = new Scanner(System.in);
        int liczba = 3;
        System.out.println("Podaj pierwszą ocene: ");
        int ocena1 = oceny.nextInt();
        System.out.println("Podaj drugą ocene: ");
        int ocena2 = oceny.nextInt();
        System.out.println("Podaj trzecią ocene: ");
        int ocena3 = oceny.nextInt();
        int suma;
        suma =  ocena1 + ocena2 + ocena3;
        double srednia = (double)suma/liczba;
        System.out.println("Wynik pierwszego testu: "+ocena1 +
                " Wynik drugiego testu: " + ocena2+ " Wynik trzeciego testu: "+
                ocena3 + " Suma ocen: "+ suma + " Średnia ocen: " + srednia);
        }
}
