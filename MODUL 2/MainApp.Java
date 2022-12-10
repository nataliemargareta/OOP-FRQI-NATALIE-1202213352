public class Main {
    public static void main (String[] args) throws Exception {
       Perangkat Transportasi = new Transportasi("TransportasiAir", 8, 1.2);
       perangkat.informasi();
 
       Kapal Kapal = new Kapal; 
       Kapal.informasi();
       Kapal.mesin("Diesel");
       Kapal.biaya("10000");
       Kapal.kecepatan("tidak stabil", "20 knot");
 
       Sampan Sampan = new Sampan;
       Sampan.informasi();
       Sampan.jumlahKursi("20");
       Sampan.layar("2");
       Sampan.biaya("50000");
    }          
 }
 