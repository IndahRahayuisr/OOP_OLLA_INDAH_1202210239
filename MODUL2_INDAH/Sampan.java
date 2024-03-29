public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." + biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar dengan menggunakan" + layar + "layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlayar(int jangkar){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai menggunakan" + jangkar + "jangkar");
    }
    
}
