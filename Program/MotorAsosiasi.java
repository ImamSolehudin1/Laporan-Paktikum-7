public class MotorAsosiasi{
    public String merek, jenis;
    public Integer cc;
    Mesin mesin;

    public void setmerek(String merek){
        this.merek = merek;
    }
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public void setcc(Integer cc){
        this.cc = cc;
    }
    public void setMesin(Mesin mc){
        mesin = mc;
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
        System.out.println("3. Mesin        :   " + this.cc);
    }
}
