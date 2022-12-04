public class Main {
    public static void main (String[] args) throws Exception {
       Perangkat perangkat = new Perangkat("iphone", 8, 1.2);
       perangkat.informasi();
 
       Laptop laptop = new Laptop("Legion", 32, 2.80, false); 
       laptop.informasi();
       laptop.bukaGame("GTA5");
       laptop.kirimEmail("jiminganteng@gmail.com");
       laptop.kirimEmail("yoongiganteng@gmail.com", "jinganteng@gmail.com");
 
       Handphone handphone = new Handphone("Samsung", 128, 3.2, true);
       handphone.informasi();
       handphone.telfon(628121427);
       handphone.kirimSMS(628121208);
       handphone.kirimSMS(628121382, 628131134);
    }          
 }
 