import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        Scanner nazwa = new Scanner(System.in);
        System.out.println("Podaj nazwę ulubionego miasta: ");
        String miasto = nazwa.nextLine();
        int dlugosc = miasto.length();
        String duze, male;
        duze = miasto.toUpperCase();
        male = miasto.toLowerCase();
        char pierwszaLitera = miasto.charAt(0);
        System.out.println("Liczba znaków: "+dlugosc);
        System.out.println("Nazwa miasta napisana dużymi literami: "+duze);
        System.out.println("Nazwa miasta napisana małymi literami: "+male);
        System.out.println("Pierwszy znak miasta: "+pierwszaLitera);







    }
}

