public class Mesin implements Imesin {
    public String Jenis;
    public String Warna;

    @Override
    public void Start() {
        System.out.println("Nyalakan Mesin...");
    }

    @Override
    public void Stop() {
        System.out.println("Matikan mesin...");
    }
}