import java.util.Scanner;

public class bki {
    
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("LÜTFEN KİLONUZU KG CİNSİNDEN GİRİNİZ");
        double kilo=scanner.nextDouble();

        System.out.println("LÜTFEN 'SI' BİRİİM SİSTEMİNE GÖRE BOYUNUZU GİRİNİZ");
        double boy=scanner.nextDouble();

        double beden_kitle_endeksi=kilo/(boy*boy);

        if (beden_kitle_endeksi<18.5){

            System.out.println("BEDEN KİTLE ENDEKSİ="+beden_kitle_endeksi+"ZAYİF BİR FİZYOLOJİ");
        
        }
        else if (18.5<beden_kitle_endeksi && beden_kitle_endeksi<25){
            System.out.println("BEDEN KİTLE ENDEKSİ="+beden_kitle_endeksi+"NORMAL BİR FİZYOLOJİ");
        }
        else if (25<beden_kitle_endeksi && beden_kitle_endeksi<30){
            System.out.println("BEDEN KİTLE ENDEKSİ="+beden_kitle_endeksi+"KİLOLU BİR FİZYOLOJİ");

        }
        else if (beden_kitle_endeksi>30){
            System.out.println("BEDEN KİTLE ENDEKSİ="+beden_kitle_endeksi+"OBEZ BİR FİZYOLOJİ");

        }


    }
}
