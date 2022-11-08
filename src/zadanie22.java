import java.util.Scanner;

public class zadanie22 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj długość rzędu w metrach");
        double dlugosc = liczby.nextDouble();
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach");
        double miejsce = liczby.nextDouble();
        System.out.println("Podaj odległość miejsca między sadzonkami w metrach");
        double odleglosc = liczby.nextDouble();
        double liczbaSadzonek;
        liczbaSadzonek = (dlugosc - 2*miejsce)/odleglosc;
        System.out.println("Liczba sadzonek jakie zmieszczą się w rzędzie: "+liczbaSadzonek);
    }
}
