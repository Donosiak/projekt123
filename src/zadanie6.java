public class zadanie6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie4= 3*4;
        int pomieszczenie2 = 2*3;
        int pomieszczenie3 = 2*2;
        int polecalkowite = pomieszczenie1 + pomieszczenie2 + pomieszczenie3  + pomieszczenie4;
        double powierzchniaNaOsobe;
        powierzchniaNaOsobe = (double) polecalkowite /4;
        System.out.println("Pole na osoobę: " +powierzchniaNaOsobe);
    }
}

