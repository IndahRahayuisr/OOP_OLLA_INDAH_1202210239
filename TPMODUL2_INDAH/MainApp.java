public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80F);
        perangkat.informasi();
        System.out.println("\n");
        Laptop laptop = new Laptop("Seagate", 8, 2.40F, true);
        laptop.informasi();
        laptop.bukaGame("hayday \n");
        laptop.kirimEmail("iniemyemail@gmail.com \n");
        laptop.kirimEmail("ituyouremail@gmail.com", "iyakahituemailmu@gmail.com");
        System.out.println("\n");
        Handphone handphone = new Handphone("Sandisk", 3 , 2.20F, false);
        handphone.informasi();
        handphone.telfon(987654321);
        handphone.kirimSMS(987654321);
        handphone.kirimSMS(987654321, 123456789);
    }
}
