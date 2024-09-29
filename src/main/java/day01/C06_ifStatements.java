package day01;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        //if eğer demektir  else değilse demektir
        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //1. adım scanner objesini olusturmak
        Scanner input=new Scanner(System.in);

        //2. adım kullanıcıya bilgi vermek
        System.out.println("Lütfen bir tam sayi giriniz");

        //3. adım uygun bir kavanoza koyalım
        int sayi= input.nextInt();//7

        //4. adım kontrol etmek
        if (sayi%2==0){//% bolumunden kalanı verir
            System.out.println("Bir çift sayıdır.");
        }else {
            System.out.println("Bir tek sayıdır.");
        }
        //else if : değilse eğer

        //---------------------------------------------------------------------

        //Kullanicidan alinan bir sayinin pozitif,
        //negatif veya notr oldugunu kontrol eden kodu yaziniz

        //1. adım scanner objesi olusturmak fakat halihazırda zaten bir tane bulunuyor o zaman bir tane daha olusturmamıza gerek yok!!!
        //Scanner input1=new Scanner(System.in);

        //2.adım bilgi ver ki bilgi alabil.
        System.out.println("Lütfen bir sayi giriniz");

        //3. adım variable'a atamak
        double number=input.nextDouble();

        //4.adım kontrol edelim!!!
        if (number>0){
            System.out.println("Bu sayi pozitiftir");
        }else if (number<0){
            System.out.println("Bu sayi negatiftir");
        }else {
            System.out.println("Bu sayi nötrdur!!!");
        }

    }
}
