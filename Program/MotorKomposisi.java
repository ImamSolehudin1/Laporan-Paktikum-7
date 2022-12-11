public class MotorKomposisi{
    private final Integer cc;
    private final String jenis;
    private final String merek;
    private final Mesin mesin;
   
    public MotorKomposisi(String merek, String jenis, Integer cc){
        mesin = new Mesin();
        // mesin.engine = mc;
        this.merek = merek;
        this.jenis = jenis;
        this.cc = cc;
    }

    public void Start(){
        mesin.Start();
    }
    public void Stop(){
        mesin.Stop();
    }
    public void run(){
        System.out.println();
        mesin.run();
    }
    public void Spekmotor(){

        System.out.println("Spesifikasi motor : " );
        System.out.println("1. Merk Motor   :   " + this.merek);
        System.out.println("2. Jenis Motor  :   " + this.jenis);
        System.out.println("3. CC           :   " + this.cc);

    }
}