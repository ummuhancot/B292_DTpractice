package day03;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

            //döngü sayısı belli değil o zaman for loop olamaz
            //do while ya yada while loop
            //en az bir kere çalışmalı mı  o zaman do while secicez.

        //1.adım
        Scanner input = new Scanner(System.in);

        //2.adım döngü oluşturma
        //System.out.println("Lütfen toplamak istediginiz sayıları giriniz siz 0 a basıncaya kadar toplamaya devam edecek");

        //3. adım döngü içerisine girilicek olan degerin yaşam alının oluşturmak
        //double sayi = input.nextDouble();
        //asagıya sayi=input.nextDouble() ekledik
        double sayi;
        double toplam = 0;

        //döngü içerisine almamız lazım
        do {
            System.out.println("Lütfen toplamak istediginiz sayıları giriniz siz 0 a basıncaya kadar toplamaya devam edecek");
            sayi = input.nextDouble();
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("toplam = " + toplam);

        //toplamda 0 yazarsak topluyor
    }
}
