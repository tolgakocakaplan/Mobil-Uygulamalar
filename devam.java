import java.util.Scanner;

//15 öğrencinin notu girilerek ortalama notu ekrana yazdırınız.
public class devam {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        int toplam=0;
        float ortalama = 0;
        for (int i=1;i<=15;i++)
        {
            System.out.println(i+"Notu Giriniz");
            int not1 = x.nextInt();
            toplam = toplam+not1;

        }
        ortalama= (toplam/15);
        System.out.println(ortalama);
    }
}
