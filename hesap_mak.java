import java.util.Scanner;
public class hesap_mak {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("HESAP MAKİNESİ PROGRAMI");
        System.out.println("***********************");
        System.out.println("LÜTFEN İŞLEMİ SEÇİNİZ");

 // AYNI DEĞİŞKENLER HER SATIRDA AYRI AYRI TANIMLANAMAZ BİR KERE TAANIMLANIR....       
        String islem=scanner.next();
        int a;
        int b;
        switch(islem){


            case "1":
                System.out.println("LÜTFEN 1.SAYIYI GİRİNİZ");
                 a=scanner.nextInt();
                System.out.println("LÜTFEN 2.SAYIYI GİRİNİZ");
                 b=scanner.nextInt();
                System.out.println("TOPLAMLARI="+(a+b));
                break;

            case "2":
                System.out.println("LÜTFEN 1.SAYIYI GİRİNİZ");
                 a=scanner.nextInt();
                System.out.println("LÜTFEN 2.SAYIYI GİRİNİZ");
                 b=scanner.nextInt();
                System.out.println("SAYILARIN FARKLARI"+(a-b));
                break;

            case "3":
                System.out.println("LÜTFEN 1.SAYIYI GİRİNİZ");
                 a=scanner.nextInt();
                System.out.println("LÜTFEN 2.SAYIYI GİRİNİZ");
                 b=scanner.nextInt();
                System.out.println("SAYILARIN BÖLÜMÜ"+(double)(a/b));
                break;

            case "4":
                System.out.println("LÜTFEN 1.SAYIYI GİRİNİZ");
                 a=scanner.nextInt();
                System.out.println("LÜTFEN 2.SAYIYI GİRİNİZ");
                 b=scanner.nextInt();
                System.out.println("SAYILARIN ÇARPIMI"+(a/b));
                break;

            default:
                System.out.println("GEÇERSİZ İŞLEM");
        

        



        }

         



    }
}
