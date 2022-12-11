public class Mesin implements Imesin {
    public int engine;
    public String merk;

    @Override
    public void Start() {
        System.out.println("Nyalakan Mesin...");
    }

    @Override
    public void Stop() {
        System.out.println("Matikan mesin...");
    }
    @Override
    public void run() {
        System.out.println("Motor Berjalann...");
    }
}