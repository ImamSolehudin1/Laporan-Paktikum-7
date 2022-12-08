public class Motor{
    private String Merk;
    private int CC;
    private String Warna;
    private int Berat;

    public void setMerk(String Merk){
        this.Merk = Merk;
    }
    
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }
    public void setBerat(int Berat){
        this.Berat = Berat;
    }
    public void Start(Mesin a){
        a.Start();
    }
    public void Stop(Mesin a){
        a.Stop();
    }
    public void run(){
        System.out.println("Motor Berjalan...");
    }

    public void Display() {
        System.out.println("Identitas Motor     : " );
        System.out.println("1. Merk     : " + this.Merk );
        System.out.println("2. Warna    : " + this.Warna);
        System.out.println("3. CC       : " + this.CC);
        System.out.println("4. Berat    : " + this.Berat);
    }
}