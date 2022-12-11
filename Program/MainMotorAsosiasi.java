public class MainMotorAsosiasi{
    public static void main(String[] args){
        // Membuat objek mesin
        Mesin system = new Mesin();

        /*Memanggil atribut dan nilai */
        
        system.engine = 500;
        system.merk = "Honda";

        //Membuat Objek Motor
        MotorAsosiasi sport = new MotorAsosiasi();
        System.out.println("=======================");
        System.out.println("       Asosiasi");
        System.out.println("=======================");

        sport.setMesin(system);
        sport.setmerek("Honda");
        sport.setjenis("CBR");
        sport.setcc(500);
        sport.Start();
        sport.Spekmotor();
        sport.run();
        sport.Stop();
        System.out.println("=======================");
    }
}