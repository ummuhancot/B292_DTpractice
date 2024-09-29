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


        int satir1= 5;
        for (int bulunanSatir= 1; bulunanSatir <= satir1 ; bulunanSatir++) {
            for (int yildizSayisi = satir1-bulunanSatir; yildizSayisi > 0; yildizSayisi--) {
                System.out.print(" * ");
            }

            for (int bulunanSatırNokta =1; bulunanSatırNokta <= satir1; bulunanSatırNokta++){
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










    }
}
