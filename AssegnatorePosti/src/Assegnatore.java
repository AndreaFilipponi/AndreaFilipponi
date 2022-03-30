public class Assegnatore {
    private int totPosti = 20;

    public synchronized boolean assegnaPosti(String cliente, int numPosti) {
        System.out.println("--Richiesta di " + numPosti + " da " + cliente);
        if (totPosti >= numPosti) {
            System.out.println("---Assegna " + numPosti + " a " + cliente);
            totPosti -= numPosti;
            return true;
        }
        return false;
    }

    int getPosti() {
        return totPosti;
    }
}

