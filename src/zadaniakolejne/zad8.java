package zadaniakolejne;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rok, opadyCoMiesiac, liczbaM,lacznaLiczba=0,a;
        double sredniPoziom;
        System.out.println("Podaj ilość lat: ");
        rok = keyboard.nextInt();
        if(rok>=1){
        for( a=0; a<rok;a++){
            for(int i=0;i<12;i++){
            System.out.println("Podaj liczbę opadów w " +(i+1)+" miesiącu "+(a+1)+" w roku podanym w cm");
            opadyCoMiesiac = keyboard.nextInt();
            lacznaLiczba+=opadyCoMiesiac;
            }
        }
        liczbaM =12;
        sredniPoziom = (double) lacznaLiczba/liczbaM;
        System.out.println("Miesiące "+liczbaM);
        System.out.println("Łączna ilość opadów po "+(a)+" latach "+lacznaLiczba);
        System.out.println("Średnie opady na miesiąc: "+sredniPoziom);
        }else{
            System.out.println("Liczba nie może być mniejsza niż 1");
    }
    }
}
