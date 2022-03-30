public class Main {

    public static void main(String[] args) throws InterruptedException {

        Assegnatore assegnatore = new Assegnatore ();

        Richiedente client1 = new Richiedente("CLIENTE1", 3, assegnatore);

        Richiedente client2 = new Richiedente("CLIENTE2", 10, assegnatore);

        Richiedente client3 = new Richiedente("CLIENTE3", 5, assegnatore);

        Richiedente client4 = new Richiedente("CLIENTE4", 3, assegnatore);

        client1.start(); client2.start(); client3.start(); client4.start();
        client1.join(); client2.join(); client3.join(); client4.join();

        System.out.println("Numero di posti ancora disponibili: " + assegnatore.getTotPosti());
    }
}
