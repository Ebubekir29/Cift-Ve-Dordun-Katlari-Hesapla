import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi,toplam=0;
        System.out.print("Bir sayi giriniz : ");
        sayi = scan.nextInt();

        while (sayi%2==0)
        {
            if(sayi%4==0)
            {
                toplam = toplam+sayi;
            }
            System.out.print("Bir sayi giriniz : ");
            sayi = scan.nextInt();
        }
        System.out.println("Toplam = "+toplam);
    }
}
