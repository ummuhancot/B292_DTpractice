package day06.inheritance;

public class Parent {

    /*
    - isim ve soyisim static değişkenleri oluşturalım.
    - method1 ve method2 static method'ları oluşturalım.
    - yas isimli bir instance variable oluşturalım.
    - method3 ve method4 isimli instance method'lar oluşturalım.
    - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
    - bir parametreli birde parametresiz iki tane cons ekleyin
    */

    //1
    public static String isim = "Ali";
    public static String soyIsim = "Can";

    //2
    public static void method1(){
        System.out.println("Parent classdaki static method1");
    }
    public static void method2(){
        System.out.println("Parent classdaki static method2");
    }

    //3
    public int yas = 27;

    public  void method3(){
        System.out.println("Parent classdaki static method3");
    }
    public void method4(){
        System.out.println("Parent classdaki static method4");
    }

    //4
    public  Parent() {

    }

    //5
    //constrakter ne zaman çalışıyor obje oluştururken
    //benim static dediğim şey obje oluşturmayı gerektiriyor mu
    //class seviyesinde olduğu icin direk yazdırabiliyordum bu yüzden
    //constructer
    public Parent(int yas) {
        this.yas = yas;
    }
    //6 child kılaş oluşturduk
}
