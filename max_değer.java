import java.util.Scanner;
public class max_değer {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("LÜTFEN 1. SAYIYI GİRİNİZ");
        int a=scanner.nextInt();

        System.out.println("LÜTFEN 2. SAYIYI GİRİNİZ");
        int b=scanner.nextInt();

        System.out.println("LÜTFEN 3.SAYIYI GİRİNİZ");
        int c=scanner.nextInt();

        if (a>=b && a>=c){

            System.out.println("MAX DEĞER="+a);
        }
        else if (b>=c && b>=a){

             System.out.println("MAX DEĞER="+b);
        }
        else {

            System.out.println("MAX DEĞER="+c);
        }
// 21.VE BU SATIRA BENZER SATIRLAARDA && OPERATÖRÜ KULLANILMASI ZORUNLU DEĞİLDİR......

    }
    
}
