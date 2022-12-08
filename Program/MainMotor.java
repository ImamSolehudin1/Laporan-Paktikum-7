public class MainMotor{
    public static void main(String[] args){
        // Membuat objek mesin
        Mesin engine = new Mesin();

        /*Memanggil atribut dan nilai */

        engine.Jenis = "Bebek";
        engine.Warna = "Merah";

        //Membuat Objek Motor
        Motor beat = new Motor();

        Motor Beat = new Motor();
        Beat.setMerk("Beat Street");
        Beat.setWarna("Merah");
        Beat.setCC(125);
        Beat.setBerat(150 );
        Beat.Start(engine);
        Beat.Display();
        Beat.Stop(engine);

    }
}