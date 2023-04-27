import java.util.Scanner;
public class farkllı_değer {


    public static void main(String[] args) {
    
    Scanner scanner=new  Scanner(System.in);
    
    System.out.println("birinci sayi giriniz:");
    int birinci_sayi=scanner.nextInt();
    
    System.out.println("ikinci sayiyi giriniz");
    int ikinci_sayi=scanner.nextInt();

    int yeni=birinci_sayi;
    birinci_sayi=ikinci_sayi;
    ikinci_sayi=yeni;

    System.out.println("DEĞİŞTİRİLDİKTEN SONRA BİRİNİCİ SAYI"+birinci_sayi);
    System.out.println("DEĞİŞTİRİLDİKTEN SONRA İKİNCİ SAYI"+ikinci_sayi);





    }
    
}
