package day03;

import java.util.Scanner;

public class C02_forloop {
    public static void main(String[] args) {


         /*
        soru 1) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen carpım toblosunu oluşturmak istediğiniz tam sayıyı giriniz");
        int sayı = input.nextInt();
        for (int i =1; i<= 10; i++){
            System.out.println(sayı + "*" +i+ " = " + sayı * i);
        }

        //güncelleme lütfen 10x10 luk bir carpım tablosunu oluşturunuz
        //kullanıcıdan almadan yapıldı
        for (int i = 0; i <=10; i++){
            System.out.println(i);
            for (int j =1; j <=10; j++){
                System.out.println(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println("");//son sout alt satıra geçmeyi sağlıyor
        }



        /*
        1*1=1
        .....


        2*1=2
        ......

         */














    }
}
