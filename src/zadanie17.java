public class zadanie17 {
    public static void main(String[] args) {
        int akcje =  600;
        double cena = 21.77;
        double procent = 0.02;
        double kwota;
        kwota = (double)akcje * cena;
        double prowizja;
        prowizja = kwota * procent;
        double cena2 = prowizja + kwota;
        System.out.println("Kwota zapłacona za same akcje:"  + kwota);
        System.out.println("Wysokość prowizji " + prowizja );
        System.out.println("Łączna zapłacona kwota: "+cena2);

    }
}
