public class MainMotorDependensi {

    public static void main(String[] args){
        // Membuat objek mesin
        Mesin system = new Mesin();

        /*Memanggil atribut dan nilai */

        system.engine = 150;
        system.merk = "Honda Yamaha";

        //Membuat Objek Motor
        MotorDependensi matic = new MotorDependensi();
        System.out.println("=======================");
        System.out.println("      Dependensi");
        System.out.println("=======================");
        matic.setmerek("Yamaha");
        matic.setjenis("Nmax");
        matic.setcc("150 cc");
        matic.Start(system);
        matic.Spekmotor();
        matic.run(system);
        matic.Stop(system);
        System.out.println("=======================");
    }
}