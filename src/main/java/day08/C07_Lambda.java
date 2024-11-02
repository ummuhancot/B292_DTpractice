package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C07_Lambda {
    public static void main(String[] args) {
    //7) Bir List'teki karakter sayisi 7 ve 7’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

        List<String> mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");

        yedidenBuyukHarf(mylist);


    }

    private static void yedidenBuyukHarf(List<String> mylist) {
        List<String> my =mylist.stream().filter(t -> t.length()>=7).map(String::toUpperCase).toList();
        System.out.println("my = " + my);
        //mylist.stream().filter(t -> t.length()>=7).map(String::toLowerCase).collect(Collectors.toUnmodifiableList());
    }
}
