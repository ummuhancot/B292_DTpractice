package day01;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        //1. adım scanner objesi olusturma
        Scanner input=new Scanner(System.in);

        //2.adım kullanıcıdan bilgi almak icin bilgi vermeliyiz
        System.out.println("Lütfen hesaplamak istediginiz dairenin yarıçapını giriniz ☻");

        //3.adım aldığımız bilgiyi bir kavanoza(variable) koymamız gerekiyor
        double r= input.nextDouble();//3,5

        //4.adım olarak hesaplama işlemi yapıcaz
        System.out.println("Çevre = "+2*Math.PI*r);
        System.out.println("Alanı = "+Math.PI*r*r);//Math.pow(r,2)=r²;
        System.out.println("Çevre = "+String.format("%.2f",2*Math.PI*r));

    }
}
