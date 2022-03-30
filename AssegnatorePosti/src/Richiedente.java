public class Richiedente extends Thread{
    private int numPosti;
    private Assegnatore assegnatore;

    public Richiedente(String nome, int numPosti, Assegnatore assegnatore) {
        super(nome);
        this.numPosti = numPosti;
        this.assegnatore = assegnatore;
    }
    public void run() {
        System.out.println("-" + getName() + ": richiede " + numPosti + "...");
        if (assegnatore.assegnaPosti(getName(), numPosti)){
            System.out.println(TEXT_GREEN + "-" + getName() + ": ottenuti " + numPosti + TEXT_RESET);
        } else{
            System.out.println(TEXT_RED + "-" + getName() + ": posti non disponibili [" + numPosti + "]" + TEXT_RESET);
        }
    }

    //console color
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
}
