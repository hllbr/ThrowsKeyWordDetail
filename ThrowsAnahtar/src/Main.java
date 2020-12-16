
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void mekanKontrol(int yas){
        if(yas>18){
            System.out.println("Mekana hoşgelnidiz...");
        }else if(yas == 18){
            System.out.println("Mekana giriş iznin var fakat içki tükeyimi konusunda kısıtlamaya tabisin.");
            throw new ArithmeticException();
        }else{
            System.out.println("Mekana girişiniz devlet kanunlarına göre yasak ....");
            System.out.println("Lütfen zorluk çıkarmayınız....");
            
        }
    }
    public static void zorlukCıkar() throws InterruptedException{
        System.out.println("İnsanlara rahatsızlık veriliyor....");
        Thread.sleep(2000);
        System.out.println("Zorluk Çıkarıldı....");
        System.out.println("mekanda sigara içiliyor....");
        Thread.sleep(2000);
        System.out.println("Sigra paketi bitti....");
        System.out.println("içki siparişi veriliyor....");
        Thread.sleep(2500);
        System.out.println("İçki masaya geldi\n içki tüketiliyor....");
        Thread.sleep(4000);
        System.out.println("KADINLARA sarkıntılık ediliyor....");
        Thread.sleep(1000);
        System.out.println("sarkıntılık işlemi herşeyi karıştırdı....");
        System.out.println("Güvenlikler ve insan etiyle beslenen Köpekler geliyor....");
        Thread.sleep(1500);
        System.out.println("Mutlu son sadece kadınlara sarkınılık yaptığın için cesedin dahi bulunamadı....");
        System.out.println("Kamu spotu kadına Şiddete HAYIR.....!!!!!");
        Thread.sleep(8000);
        System.out.println("HİÇBİR KÖTÜLÜK CEZASIZ KALMAZ....");
        
       
    }
    public static void mekandanAyrılma() throws InterruptedException{
        
        try{
        System.out.println("Hayatının hatasını yaptın....");
      
        }catch(NullPointerException e){
            System.out.println("Bedel ödetildi...");
        }finally{
              zorlukCıkar();
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        /*
        Throws anahtar kelimesi....
        
        */
        Scanner scn = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz...");
        int yas = scn.nextInt();
        System.out.println("Lütfen bekleyiniz yaşınız kontrol ediliyor....");
        
        String islemler = "1.islem yas kontrol \n"
                + "2.islem zorluk çıkar\n"
                + "3.islem mekandan ayrılma\n"
                + "q veya Q ile çıkış yapılıyor.";
        while(true){
        System.out.println("Lütfen yapmak istediğiniz (içinizden geçenleri yaptırınız.....)");
        String islem =  scn.nextLine();
        if(islem.equals("1")){
            mekanKontrol(yas);
        }else if(islem.equals("2")){
            zorlukCıkar();
        }else if(islem.equals("3")){
            mekandanAyrılma();
        }else if(islem.equals("q") || islem.equals("Q")){
            System.out.println("Sistemden çıkış işlem talebi işleniyor...");
            Thread.sleep(2000);
            System.out.println("çıkış işlemi gerçekleşti...");
            break;
        }
        else{
            try{
            System.out.println("HATALI YADA YANLIŞ TUŞLAMA YAPTINIZ ...");
            Thread.sleep(3000);
            }catch(RuntimeException e){
                System.out.println("Yürütme Hatası....");
            }finally{
                System.out.println("Sistemden çıkıyor tekrar bekleriz....");
                break;
            }
        }
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
