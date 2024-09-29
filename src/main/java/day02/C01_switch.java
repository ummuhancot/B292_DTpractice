package day02;

import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {

        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        //1. adım
        Scanner input1 = new Scanner(System.in);

        //2. adım normal koşullarda kullanıcıya bilgi verirdik
        System.out.println("Lütfen işlem yapmak istediğiniz operatoru giriniz : \ntoplama icin : +\ncıkarma icin : -\ncarpma icin : *\nbolme icin : /\nus almak icin : ^\nkalan hesaplama icin : %");

        //3.adım uygun bir variable 'a atamak(Kullanıcıdan aldığımız veriyi karsılıyoruz. değişkene atıyoruz. int gibi)
        char operator1 = input1.next().charAt(0);

        //4. adım işlemi operotörü kontrol etmek için switch e geçeriz
        switch (operator1){
            case '+':
                System.out.println("Lütfen toplamak istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıları toplamı : " +(input1.nextDouble() + input1.nextDouble()));
                break;
            case '-' :
                System.out.println("Lütfen cıkarmak istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıları farkı : " +(input1.nextDouble() - input1.nextDouble()));
                break;
            case  '*':
                System.out.println("Lütfen carpma istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıları carpmı : " + input1.nextDouble() * input1.nextDouble());
                break;
            case '/'://payda'nın 0 olma durumunu kontrol ediniz
                System.out.println("Lütfen bolme istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıları bolumu : " + input1.nextDouble() / input1.nextDouble());
                break;//Mod kısmı / olarak kalmış % olarak değiştirmek gerekmiyor muydu?
            case '%'://payda'nın 0 olma durumunu kontrol ediniz
                System.out.println("Lütfen modunu almak istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıları modu : " +(input1.nextDouble() % input1.nextDouble()));
                break;
            case '^'://sayi*sayi karesini alırız//aynısını for ile yapabilirsiniz bu odev!!!!!
                System.out.println("Lütfen birbirinin kuvvetini almak istediğimiz sayıları sırayısla giriniz");
                System.out.println("sayıların kuvvet durumu : " +Math.pow(input1.nextDouble(), input1.nextByte()));
                break;


        }

        System.out.println("Bizi tercih ettiginiz icin teşekkürler :) ");


        System.out.println("--------------------------");

        //hocanın yaptığı
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        //1. adım
        Scanner input=new Scanner(System.in);


        //2.adım normal koşullarda kullanıcıya bilgi verirdik
        System.out.println("Lütfen işlem yapmak istediğiniz operatoru giriniz : \ntoplama icin : +\ncıkarma icin : -\ncarpma icin : *\nbolme icin : /\nus almak icin : ^\nkalan hesaplama icin : %");


        //3.adım uygun bir variable'a atamak

        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Lütfen toplamak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların toplamı : "+(input.nextDouble()+ input.nextDouble()));
                break;
            case '-':
                System.out.println("Lütfen cıkarmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların farkı : "+(input.nextDouble()- input.nextDouble()));
                break;
            case '*':
                System.out.println("Lütfen carpmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların carpımı : "+input.nextDouble()* input.nextDouble());
                break;
            case '/':
                System.out.println("Lütfen bolmek istediginiz sayilari sırasıyla giriniz : ");
                double sayi1= input.nextDouble();
                double sayi2= input.nextDouble();
                if (sayi2==0){
                    System.out.println("Payda 0 OLAMAZ!!!");
                }else {
                    System.out.println("sayıların bolumu : "+sayi1/ sayi2);//payda'nın 0 olma durumunu kontrol ediniz
                }
                break;
            case '%':
                System.out.println("Lütfen modunu almak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların modu : "+input.nextDouble()% input.nextDouble());//payda'nın 0 olma durumunu kontrol ediniz
                break;
            case '^':
                System.out.println("Lütfen birbirinin kuvvetini almak istediginiz sayilari sirasiyla giriniz : ");
                // System.out.println("sayilar kuvvet durumu : "+Math.pow(input.nextDouble(), input.nextDouble()));//sayi*sayi karesini alırız//aynısını for ile yapabilirsiniz bu odev!!!!!
                sayi1=input.nextDouble();
                sayi2=input.nextDouble();
                double sonuc=sayi1;
                for (int i = 1; i <sayi2 ; i++) {
                    sonuc*=sayi1;//sonuc = sonuc * 7;
                    System.out.println("sonuc : "+sonuc);
                }
                break;
            default:
                System.out.println("Lütfen gecerli bir operator giriniz ☺");
                break;
        }

        System.out.println("Bizi tercih ettiginiz icin tesekkürler ☻");


    }
}
