package day03;

import java.util.Scanner;

public class C03_forloop {
    public static void main(String[] args) {

        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        //7! = 1x2x3x4x5x6x7 tekrar var o zaman for

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 10 dan kucuk bir tam sayı giriz");

        byte sayı = input.nextByte();
        if(sayı < 10 && sayı>0){
            int bosInt=1;
            for (int i = 1; i<=sayı; i++){
                bosInt *=i;//bosInt=bosInt * i;
            }
            System.out.println(sayı + " ! = " + bosInt);
        } else {
            System.out.println("Lütfen gecerli bir deger giriniz!!!");
        }



    }//kendi olusturduğumuz hesap makinesine güncelleme olarak ekleyelim  ÖDEV!!1

}
