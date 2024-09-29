package day01;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        //1.adım scanner objesi olusturma
        Scanner input=new Scanner(System.in);

        //----------------------------------------
        //1.yol
        ////2.adım kullanıcıya mesaj vermek
        //System.out.println("Lütfen hesaplamak istediginiz dikdortgenin uzun kenari giriniz ");

        ////3. adım bir variable'a atamak
        //double uzunKenar= input.nextDouble();

        ////2.adıma tekrar donuyoruz ve tekrar bilgi verelim
        //System.out.println("Lütfen hesaplamak istediginiz dikdortgenin kısa kenari giriniz ");

        ////3. adım bir variable'a atamak
        //double kisaKenar= input.nextDouble();

        ////2.adıma tekrar donuyoruz ve tekrar bilgi verelim
        //System.out.println("Lütfen hesaplamak istediginiz dikdortgenin yüksekliği giriniz ");
        //
        ////3. adım bir variable'a atamak
        //double yukseklik= input.nextDouble();

        //4. adım hesaplayıp yazdırmak

        //2.yol
        System.out.println("Lütfen sırasıyla kısa , uzun kenarı ve yukselikligi giriniz : ");
        double kisaKenar= input.nextDouble();
        double uzunKenar= input.nextDouble();
        double yukseklik= input.nextDouble();
        System.out.println("Hacmi = "+uzunKenar*kisaKenar*yukseklik);
    }
}
