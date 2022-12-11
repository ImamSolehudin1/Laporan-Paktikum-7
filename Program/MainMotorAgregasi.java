public class MainMotorAgregasi{
    public static void main(String[] args){
        // Membuat objek mesin
        Mesin system = new Mesin();

        /*Memanggil atribut dan nilai */
        
        system.engine = 125;
        system.merk = "Honda";

        //Membuat Objek Motor
        MotorAgregasi bebek = new MotorAgregasi(system);
        System.out.println("=======================");
        System.out.println("       Agregasi");
        System.out.println("=======================");

        bebek.setmerek("Honda");
        bebek.setjenis("supraX");
        bebek.setcc(125);
        bebek.Start();
        bebek.Spekmotor();
        bebek.run();
        bebek.Stop();
        System.out.println("=======================");
    }
}