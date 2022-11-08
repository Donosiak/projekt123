import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        Scanner cena = new Scanner(System.in);
        System.out.println("Podaj cene płytki drukowanej: ");
        double cenaDetaliczna = cena.nextDouble();
        double marza;
        marza = 0.4;
        double zysk;
        zysk = cenaDetaliczna * marza;
        System.out.println("Cena detaliczna: "+zysk);


    }

}
