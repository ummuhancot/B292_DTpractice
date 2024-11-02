package day03;

public class C04_forloop {
    public static void main(String[] args) {



        /*
                * * * * .
                * * * . .
                * * . . .           //5 satır
                * . . . .           //5 sutun var
                . . . . .
        */


        int satir2= 5;
        for (int bulunanSatir= 1; bulunanSatir <= satir2 ; bulunanSatir++) {
            for (int yildizSayisi = satir2-bulunanSatir; yildizSayisi > 0; yildizSayisi--) {
                System.out.print(" * ");
            }

            for (int bulunanSatırNokta =1; bulunanSatırNokta <= satir2; bulunanSatırNokta++){
                System.out.print(" . ");
            }
            System.out.println();

        }

         /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */

        int satir=10;
        for (int bulunSatir = 1; bulunSatir <=satir ; bulunSatir++) {
            for (int yildizSayisi = satir-bulunSatir; yildizSayisi >0 ; yildizSayisi--) {
                System.out.print("* ");
            }
            for (int nokta = 1; nokta <=bulunSatir ; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }


        /*
               1            *   ortaya gelebilmesi icin 4 boşluk             satır=5
               2           * *                          3
               5          *****                         2
                         *     *                        1
                        *       *                       0
        */

        int satır = 5; //satır - bulundugu satır sayısı

        for (int bulunduguSatır = 1; bulunduguSatır <= satir; bulunduguSatır++){
            for (int bosluk = satır - bulunduguSatır; bosluk >= 1; bosluk--) {
                System.out.println(" ");
            }
            for (int yildiz = 1; yildiz <= bulunduguSatır * 2 - 1; yildiz++) {
                if (yildiz == 1 || yildiz == bulunduguSatır * 2 - 1 || bulunduguSatır == satır/ 2 + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        /*
                                *
                               * *
                              *****
                             *     *
                            *       *
        */

        int satir1=6;


        for (int bulsatir = 1; bulsatir <=satir1 ; bulsatir++) {
            for (int bosluk = satir1-bulsatir; bosluk >=1 ; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulsatir*2-1; yildiz++) {
                if (yildiz==1||yildiz==bulsatir*2-1||bulsatir==satir1/2+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
}
