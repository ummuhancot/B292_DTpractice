package day03;

import java.util.Random;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin


        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int rndsayi = rnd.nextInt(100);
        System.out.println(rnd);
        int tahminHakki =5;
        while (tahminHakki > 0){
            System.out.println("Lütfen tahminde bulunmak icin 1-100 arasında bir sayi giriniz");
            int sayi = input.nextInt();
            if (sayi >100 || sayi<100){
                System.out.println("lütfen verilen aralıkta bir değer giriniz");
            }
            if (rndsayi>sayi){
                System.out.println("daha büyük bir sayi giriniz");
            } else if (rndsayi < sayi){
                System.out.println("daha kücük bir sayi giriniz");
            } else {
                System.out.println("tebrikler, doğru tahmin");
                break;
            }
            tahminHakki--;
            System.out.println("Kalan tahmin hakkınız : " + tahminHakki);
            if (tahminHakki == 0){
                System.out.println("tahmin hakkkınız bitmiştir eger dilerseniz 3 tane daha alabilirsiniz almak e almammak için h tuşuna basınız");
                String str = input.next();
                if (str.equals("e")){
                    tahminHakki += 3;
                } else {
                    System.out.println("görüşmek üzere tekrar deneyiniz ...");
                }
            }

        }
    }
}
