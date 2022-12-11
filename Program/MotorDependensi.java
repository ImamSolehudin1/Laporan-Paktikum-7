public class MotorDependensi{
    private String merek;
    private String jenis;
    private String cc;
   
    public void setmerek(String merek) {
        this.merek = merek;
    }
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public void setcc(String cc){
        this.cc = cc;
    }
    public void Start(Mesin onMesin){
        onMesin.Start();
    }
    public void Stop(Mesin onMesin){
        onMesin.Stop();
    }
    public void run(Mesin onMesin){
        onMesin.run();
    }
    public void Spekmotor(){
        System.out.println("Spesifikasi motor : " );
        System.out.println("1. Merk Motor   :" + this.merek);
        System.out.println("3. Jenis Motor  :" + this.jenis);
        System.out.println("2. Mesin        :" + this.cc);
    } 
}