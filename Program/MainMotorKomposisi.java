public class MainMotorKomposisi{
    public static void main(String[] args){

        //Membuat Objek Motor
        MotorKomposisi Beat = new MotorKomposisi("Yamaha","Aerox",155);

        System.out.println("=======================");
        System.out.println("       Komposisi");
        System.out.println("=======================");
        Beat.Start();
        Beat.Spekmotor();
        Beat.run();
        Beat.Stop();
        System.out.println("=======================");

    }
}