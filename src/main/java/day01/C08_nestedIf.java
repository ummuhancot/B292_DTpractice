package day01;

import java.util.Scanner;

public class C08_nestedIf {
    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali

        //1. adım scanner objesi olusturalım
        Scanner input=new Scanner(System.in);

        //2.adım bilgi verelim
        System.out.println("Lütfen yaşınızı giriniz");

        //3. adım yaş bilgisini bir variable'a atayalım
        short yas= input.nextShort();

        //4.adım olarak önce yaş kontrolüne gecicem
        if (yas>=18){
            System.out.println("Lütfen kilonuzu giriniz");
            float kilo= input.nextFloat();
            if (kilo>50){
                System.out.println("Lütfen kan vermek icin formu doldurunuz.....");
            }else {
                System.out.println("Lütfen "+(50-kilo)+" kilo alıp geliniz");
            }
        }else {
            System.out.println("Lütfen "+(18-yas)+" yıl sonra tekrar geliniz");
        }
    }
}
