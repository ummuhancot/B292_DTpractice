package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lambda {

    //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.
    public static void main(String[] args) {
        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        tekYazdiran1(mylist);//2 4 6 8 10
        tekYazdiran2(mylist);//1 3 5 7 9 11
        System.out.println(mylist);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    }


    public static void tekYazdiran1(List<Integer> mylist){
        for (int a: mylist ){
          if (a % 2 == 0){
              System.out.print(a + " ");
          }
        }
    }

    public static void tekYazdiran2(List<Integer> mylist){
        mylist.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.print(t + " "));
    }

    //colleksin yapılarda coklu yapılarda kullanabiliyoruz list arraylis gibi



}
