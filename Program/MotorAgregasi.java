public class MotorAgregasi{
    private String merek, jenis;
    private Integer cc;
    private final Mesin mesin;
   
    public MotorAgregasi (Mesin mc){
        mesin = mc;
    }
    public void setmerek(String merek){
        this.merek = merek;
    }
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public void setcc(Integer cc){
        this.cc = cc;
    }
    public void Start(){
        mesin.Start();
    }
    public void Stop(){
        mesin.Stop();
    }
    public void run(){
        mesin.run();
    }
    public void Spekmotor(){

        System.out.println("Spesifikasi motor : " );
        System.out.println("1. Merk Motor   :   " + this.merek);
        System.out.println("2. Jenis Motor  :   " + this.jenis);
        System.out.println("3. Mesin        :   " + this.cc);

    }
}
