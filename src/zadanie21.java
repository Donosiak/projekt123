public class zadanie21 {
    public static void main(String[] args) {
        double akcje = 1000;
        double cenaAkcji1 = 32.87;
        double prowizja = 0.02;
        double prowizja1;
        double kwotaBez;
        kwotaBez = akcje*cenaAkcji1;
        double kwotaZaplacona = prowizja * (akcje*cenaAkcji1);
        prowizja1 = prowizja * kwotaZaplacona;
        double cenaAkcji2 = 33.92;
        double kwotaSprzedana = prowizja * (akcje*cenaAkcji2);
        double prowizja3 = prowizja * kwotaSprzedana;
        double zysk = kwotaSprzedana - kwotaZaplacona;
        double kwotaBez1;
        kwotaBez1 = akcje*cenaAkcji2;
        System.out.println("Kwota bez prowizji: "+kwotaBez);
        System.out.println("Kwota zapłacona z prowizją: " + kwotaZaplacona);
        System.out.println("Wartość prowizji pierwszej: "+prowizja1);
        System.out.println("Kwota otrzymana bez prowizji: "+kwotaBez1);
        System.out.println("Kwota otrzymana z prowizją : "+kwotaSprzedana);
        System.out.println("Kwota prowizji drugiej: "+prowizja3);
        System.out.println("Zysk: "+zysk);

    }
}
