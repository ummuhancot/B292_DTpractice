package day01;

import java.util.Scanner;

public class C07_ifStatements {
    public static void main(String[] args) {



        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”

        //1. adım olarak scanner objesi olusturmak
        Scanner input=new Scanner(System.in);

        //2. adım olarak kullanıcıya bilgi vermek
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz");

        //3. adım olarak uygun bir variable atama işlemi
        float not= input.nextFloat();

        //4.adım kontrol etmek
        if (not<0||not>100){
            System.out.println("Lütfen geçerli bir not giriniz!!!");
        } else if (not<50) {
            System.out.println("D");
        } else if (not<60) {
            System.out.println("C");
        }else if (not<80) {
            System.out.println("B");
        } else if (not<=100) {
            System.out.println("A");
        }
    }
}
