import java.util.Scanner;
public class atm {
/*BURADA DİKKAT EDİLMESİ GEREKEN SATIRLAR(26,27,28.)SATIRLARDA UFAK BİR PÜF NOKTA BULUNMAKTADIR */
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ATM UYGULAMASINA HOŞGELDİNİZ");
        int bakiye=1000;
        System.out.println("*******************************************************************************************************************");
        System.out.println("1.İŞLEM = BAKŞYE SORGULAMA"+"2.İŞLEM = PARA ÇEKME"+"3. İŞLEM = PARA YATIRMA"+"4.İŞLEM = ÇIKMAK İÇİN q YA BASINIZ");
        System.out.println("*******************************************************************************************************************");
        System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ:");
        String islem=scanner.nextLine();

        while (true){if (islem.equals("q")){

            System.out.println("PROGRAMDAN ÇIKILIYOR İYİ GÜNLER DİLERİZ :):):):):):):):):):)");
            break ;
            

        }
        else if (islem.equals("2")){

            System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ:");
            int tutar=scanner.nextInt();
            if (bakiye-tutar<0){
                System.out.println("YETERSİZ BAKİYE");
                scanner.nextLine();
            }
            else {

                bakiye-=tutar;
                System.out.println("YENİ BAKİYENİZ="+bakiye);

            }
        }
        else if(islem.equals("3")){

            System.out.println("YATIRMAK İSTEDĞİNİZ TUTARI GİRİNİZ");
            int miktar=scanner.nextInt();
            bakiye+=miktar;
            System.out.println("YENİ BAKİYE="+bakiye);
            scanner.nextLine();
        }
        else if (islem.equals("1")){

            System.out.println(bakiye);
        }
        else{

            System.out.println("GEÇERSİZ İŞLEM");
        }

        }





    }
    
}
