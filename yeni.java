import java.util.Scanner;

//100 çalışanın maaşının girilerek toplam maaş ve ort maaş ekrana yazdıran kodu yazınız
public class yeni {
public static void main(String[]args){
    Scanner x = new Scanner(System.in);
    float toplam=0;
    for (int i=1;i<=100;i++)
    {
        System.out.println("Maaş Bilgisini Giriniz");
        float maas = x.nextFloat();
         toplam = toplam+maas;
    }
    float ortalamamaas = toplam/100;
    System.out.println("Ortalama Maas="+ortalamamaas);
}
}
