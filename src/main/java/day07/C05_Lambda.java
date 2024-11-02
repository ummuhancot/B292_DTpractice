package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Lambda {
    public static void main(String[] args) {

          /*
        5)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
         */

        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,16,64));
        dordeTamBolunenKarekokCarpim(mylist);


    }

    private static void dordeTamBolunenKarekokCarpim(List<Integer> mylist) {

        //double carpım = mylist.stream().distinct().filter(t -> t % 4 == 0).map(t -> Math.pow(t,0.5)).reduce(1.0,(t,u) -> t * u);
        //double carpım = mylist.stream().distinct().filter(t -> t % 4 == 0).map(t -> Math.sqrt(t)).reduce(1.0,(t,u) -> t * u);
        double carpım = mylist.stream().distinct().filter(t -> t % 4 == 0).map(Math::sqrt).reduce(1.0,(t,u) -> t * u);
        //hepsi karekök alma için

        System.out.println("carpim = " + String.format("%.2f",carpım));

    }


}
