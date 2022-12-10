public class Kapal extends TransportasiAir {
    protected boolean mesin;

    public Kapal(String mesin, int jumlahKursi, int biaya, int kecepatan) {
        super(informasi, berlayar, berlabuh);
        this.mesin = mesin;
      }

      public void informasi() {
        if (mesin == true) {
          System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar " + biaya);
          } else {
          System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan " + mesin + " dengan kecepatan " + informasi);  
          }
      }
    
      public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar dengan kecepatan" + berlayar);          
      }
    
      public void berlabuh(int informasi) {
        System.out.println("Transportasi Air jenis Kapal berlabuh di " + informasi);          
      }
    }