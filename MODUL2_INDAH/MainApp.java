public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Transportasi Air");

        TransportasiAir ta = new TransportasiAir(4,20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        System.out.println("");

        System.out.println("Class Sampan");
        Sampan sampan = new Sampan(20,50000,2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlayar(2);
        System.out.println("");

        System.out.println("Class Kapal");
        Kapal kapal = new Kapal(50,100000, "knot");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
        System.out.println("");
        




    }
}
