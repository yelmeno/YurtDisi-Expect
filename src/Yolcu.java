import java.util.Scanner;

public class Yolcu {
   class VizeDurumuExceptions extends Exception {
       @Override
       public void printStackTrace() {
           System.out.println("Vizeniz bulunmuyor");
       }

   }
   class YurtDisiYasagiExceptions extends Exception{
       @Override
       public void printStackTrace() {
           System.out.println("Yurtdışı yasağınız bulunuyor..");
       }
   }
   class HarcExceptions extends Exception {
       @Override
       public void printStackTrace() {
           System.out.println("Harcınız yatırılmamıştır..");
       }
   }

    private int harc;
    private boolean VizeDurumu;
    private boolean YurtDisiYasagi;
    public  Yolcu (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yatırdığınız harç bedelini giriniz..");
        int harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gideceğiniz ülkeye vizeniz bulunuyor mu ? (EVET HAYIR)");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")){
            this.VizeDurumu = true;

        }else {
            this.VizeDurumu = false;
        }
        System.out.println("Yurtdışı yasağınız bulunuyor my ? 8EVET HAYIR)");
        String cevap2 = scanner.nextLine();
        if (cevap2.equals("evet")){
            this.YurtDisiYasagi = true;
        }else {
            this.YurtDisiYasagi = false;
        }

    }
    public void HarcSorgulama () throws HarcExceptions {
        if (this.harc < 15 ){
            throw new HarcExceptions();

        }else {
            System.out.println("Harcınız yatırılmıştır.");
        }

    }
    public void VizeDurumuKontrol() throws VizeDurumuExceptions {
        if (this.VizeDurumu == true){
            System.out.println("Vize işlemleriniz tamamlanmıştır.");


        }else {
            throw new VizeDurumuExceptions();

        }

    }
    public void YurtDisiKontrol() throws YurtDisiYasagiExceptions {
        if (this.YurtDisiYasagi == true){
            throw new YurtDisiYasagiExceptions();

        }else {
            System.out.println("Yurt dışı çıkış yasağınız bulunmuyor..");
        }
    }
}
