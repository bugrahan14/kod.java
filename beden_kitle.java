import java.util.Scanner;
public class beden_kitle {
    
    public static void main(String[]args){

    //BEDEN KİLO ENDEKSİ=KİLO/BOY**2 FORMULÜ İLE BULUNUR
    Scanner scanner=new Scanner(System.in);

    System.out.println("LÜTFEN BOYUNUZU M CİNSİNDEN GİRİNİZ:");
    double boy=scanner.nextDouble();

    System.out.println("LÜTFEN KİLONUZU GİRİNİZ:");
    int kilo=scanner.nextInt();

    double beden_kilo_endeksi=kilo/(boy*boy);
    System.out.println("BEDEN KİLO ENDEKSİ="+beden_kilo_endeksi);


    }
}
