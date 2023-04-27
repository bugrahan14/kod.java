import java.util.Scanner;
public class araç_ücret {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("LÜTFEN ARACIN 100 KM DE KAÇ LİTRE YAKIT HARCADIĞINI GİRİNİZ");
        double harcanan=scanner.nextDouble();

        System.out.println("LÜTFEN GÜNCEL YAKIT FİYATINI GİRİNİZ");
        double yakit=scanner.nextDouble();

        System.out.println("LÜTFEN ARACIN KAÇ KM YOL YAPTIĞINI GİRİNİZ:");
        double km=scanner.nextDouble();

        double total=(harcanan*yakit)/km;
        System.out.println("TOPLAM TUTAR MİKTARI="+total);
        

        

    }
    
}
