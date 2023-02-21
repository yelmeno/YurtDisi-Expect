public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        String sartlar = "Gideceğiniz ülkeye vizenizin bulunması gerekmektedir..\n" +
                "Yurtdışı çıkış yasağınızın bulunmaması gerekmektedir..\n"
                + "15TL olan harç tutarını yatırmış olmanız gerekmektedir..\n ";
        System.out.println("------------------------------");
        System.out.println(sartlar);
        System.out.println("------------------------------");
        Yolcu yolcu = new Yolcu();
        while (true) {
            System.out.println("Gideceğiniz ülkeye vizeniz bulunuyor mu ?");

            try {
                yolcu.VizeDurumuKontrol();
            } catch (Yolcu.VizeDurumuExceptions e) {
                e.printStackTrace();
                continue;

            }
            System.out.println("Yurtdışı yasağınız bulunuyor mu ? ");
            try {
                yolcu.YurtDisiKontrol();
            } catch (Yolcu.YurtDisiYasagiExceptions e) {
                e.printStackTrace();
                continue;

            }
            System.out.println("Yurtdışı harc ücretinizi ödediniz mi ? ");
            try {
                yolcu.HarcSorgulama();
            } catch (Yolcu.HarcExceptions e) {
                e.printStackTrace();
                continue;

            }
        }
    }
}