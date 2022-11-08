public class zadanie18 {
    public static void main(String[] args) {
        int konsumenci = 12467;
        double energetytki = 0.14;
        double smakCytrusowy = 0.64;
        double przyblizonaLiczba;
        przyblizonaLiczba =(double) energetytki *konsumenci ;
        double preferowanySmak;
        preferowanySmak = (double)przyblizonaLiczba * smakCytrusowy;
        int jd1 = (int)przyblizonaLiczba;
        int jd2 = (int)preferowanySmak;
        System.out.println("Liczba osób kupujących energetyki: "+jd1);
        System.out.println("Liczba osób które preferują smak cytrynowy: "+jd2);


    }
}
