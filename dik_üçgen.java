import java.util.Scanner;
public class dik_üçgen {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("BİRİNİCİ KENARI GİRİNİZ:");
        int a = scanner.nextInt();
        
        System.out.println("İKİNCİ KENARI GİRİNİZ:");
        int b = scanner.nextInt();

        double c=Math.sqrt(a*a+b*b);
        System.out.println("HİPOTENÜS="+c);
    }
}
