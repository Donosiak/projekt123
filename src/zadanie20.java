import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        System.out.println("Podaj kwotę pieniędzy:");
        double kwota = bank.nextDouble();
        System.out.println("Podaj procent rocznej stropy oprocentowanej: ");
        double procenty = bank.nextDouble();
        System.out.println("Podaj ilosć kapitalizowania odsetek w roku: ");
        double rok = bank.nextDouble();
        System.out.println("Podaj liczbę lat: ");
        double lata = bank.nextDouble() ;
        double potega;
        potega = rok*lata;
        double potega2;
        double liczby;
        liczby = (1+procenty/rok);
        potega2 = Math.pow(liczby, potega);
        double  kwotaPieniedzy;
        kwotaPieniedzy = kwota * potega2;
        System.out.println("Kwota jaka znajdzie się na koncie po określonym czasie:" +kwotaPieniedzy);

    }
}
