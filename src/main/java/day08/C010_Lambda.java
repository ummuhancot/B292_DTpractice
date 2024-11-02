package day08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C010_Lambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple");
        /*
        Soru: "Bir liste içinde verilen bir kelimenin sayısını hesaplayan bir Java metodu yazın.
         Kullanıcıdan alınan kelime için,
          listenin içindeki kelimeleri filtreleyin
           ve kaç kez tekrar ettiğini sayın. Lambda ifadelerini kullanın."
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen list'e icerisinde aramak istediginiz kelimeyi giriniz");
        String kelime=input.next();
        counter(words,kelime);

    }

    private static void counter(List<String> words, String kelime) {
        long a=words.stream()
                .filter(t->t.equalsIgnoreCase(kelime))
                .count();
        System.out.println("Bu kelimeden "+a+" tane vardır.");
    }

}