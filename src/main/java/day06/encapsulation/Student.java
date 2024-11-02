package day06.encapsulation;

public class Student { //bu clasa obje diyebilirim

    //encapsulation : data hiding veri koruma ve gizleme yani data saklama

    /*
    bir class oluşturalım.
    private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor oluşturun
    toString metodunu oluşturun
    */
    /*local: mothod un içinde oluşturulan veraybılla ra denir işlem yapmaya yarar
    static: kılasa a ait ve clas ismiyle cağrılan yapılardır genelde yardımcı kılaslarda kullanılır
    global static:
    instance:
     */

    //instance veraybılları
    //acces modifier erişim belirleyici
    //private = gizli , protected = ev , defualt = oda , public = kütüphane;
    //1
    private String isim;
    private String soyisim;
    private int yas;

    //5
    //gettir : okuma

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }


    //4
    //setter : degistirme , güncelleme


    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setYas(int yas) {
        //7 de düzenleme
        if (yas < 0){
            System.out.println("yaş degeri negatif olamaz!!!!");
        }else {
            this.yas = yas;
        }
    }

    //3
    //NoArguments constructor
    public Student() {

    }

    //2
    //allArguments constructor
    //hızlı değer atama
    public Student(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    //6
    //hızlı görüntüleme
    //to string

    @Override
    public String toString() {
        return "Student{" +
                "isim=" + isim +
                ", soyisim=" + soyisim +
                ", yas=" + yas +
                '}';
    }



}
