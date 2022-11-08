package zadania123;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Podaj dzień");
        int dzien = data.nextInt();
        System.out.println("Podaj miesiąc ");
        int miesiac = data.nextInt();
        System.out.print("Podaj 2 ostatnie cyfry roku ");
        int rok = data.nextInt();
        int iloczyn = dzien * miesiac;
        if (iloczyn == rok){
            System.out.println("Data jest magiczna");

        }
        else{
            System.out.println("Data nie jest magiczna");
        }

    }
}
