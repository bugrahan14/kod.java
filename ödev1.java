/*BAŞLA

    SINAV_ADI = kullanıcıdan_sınav_adını_oku()
    BAŞLANGIÇ_SAATİ = kullanıcıdan_başlangıç_saati_ve_dakikasını_oku()
    SINAV_SÜRESİ = kullanıcıdan_sınav_süresini_oku()
    
    BAŞLANGIÇ_SAATİ_PARS = BAŞLANGIÇ_SAATİ.split(':')
    SAAT = BAŞLANGIÇ_SAATİ_PARS[0]
    DAKİKA = BAŞLANGIÇ_SAATİ_PARS[1]
    
    TOPLAM_DAKİKA = SAAT * 60 + DAKİKA + SINAV_SÜRESİ
    BİTİŞ_SAATİ = (TOPLAM_DAKİKA / 60) mod 24
    BİTİŞ_DAKİKA = TOPLAM_DAKİKA mod 60
    
    EKRANA_YAZDIR("Sınav adı: " + SINAV_ADI)
    EKRANA_YAZDIR("Başlangıç saati: " + BAŞLANGIÇ_SAATİ)
    EKRANA_YAZDIR("Bitiş saati: " + BİTİŞ_SAATİ + ':' + BİTİŞ_DAKİKA)
    
SON
 */

import java.util.Scanner;
public class ödev1 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Sınavın adını girin: ");
    String sinavAdi = input.nextLine();
    
    System.out.print("Sınavın başlangıç saati (saat:dakika formatında) girin: ");
    String baslangicSaati = input.nextLine();
    
    System.out.print("Sınavın süresini (dakika cinsinden) girin: ");
    int sinavSuresi = input.nextInt();
    
    String[] baslangicSaatiParcalari = baslangicSaati.split(":");
    int saat = Integer.parseInt(baslangicSaatiParcalari[0]);
    int dakika = Integer.parseInt(baslangicSaatiParcalari[1]);
    int toplamDakika = saat * 60 + dakika + sinavSuresi;
    int bitisSaat = (toplamDakika / 60) % 24;
    int bitisDakika = toplamDakika % 60;
    
    System.out.println("Sınav adı: " + sinavAdi);
    System.out.println("Başlangıç saati: " + baslangicSaati);
    System.out.printf("Bitiş saati: %02d:%02d", bitisSaat, bitisDakika);
}
    
}
