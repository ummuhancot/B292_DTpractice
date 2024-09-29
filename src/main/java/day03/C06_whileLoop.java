package day03;

import java.util.Scanner;

public class C06_whileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin


            //sayı belli değil ve en az bir kere calışsın olduğu için do while kullanamayız.while loop kullanıcaz
            //while en az bir kere true cıkmalı

        Scanner input1 = new Scanner(System.in);

        int sayi1;
        int toplam1 = 0;

        while (toplam1 <= 500){
            System.out.println("Lütfen toplamak istediğiniz sayıları giriniz");
            sayi1=input1.nextInt();
            toplam1 += sayi1;

        }
        System.out.println("artik yeter cok sayi girdin, toplam" + " " + toplam1 + " " + "oldu yazsin");



/*
        do{

        } while (toplam <= 500); en az 1 kere calışma şartı burada sanırım
*/

            //hocanın notu
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin
        Scanner input=new Scanner(System.in);
        int sayi;
        int toplam=0;
        while (toplam<=500) {
            System.out.println("lütfen toplamak istediginiz sayilari giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin, toplam "+toplam+ " oldu");


    }
}
