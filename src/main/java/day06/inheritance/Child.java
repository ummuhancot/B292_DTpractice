package day06.inheritance;

public class Child extends Parent{//6 da yaptık

    //perınt yapmak için kullanıyan exkends dir

    //8
    public static String isim = "Veli";

    //10
    public int yas=5;

    //11
    public void method4(){
        System.out.println("Child method4 yas : "+this.yas);
    }

    //7
    public static void main(String[] args) {
        System.out.println(isim);//Veli //8
        System.out.println(Parent.isim);//Ali //9
       // Parent.method1();//extends yapmasaydık clas ismini yazardık başına
        method1();//Parent classdaki static method1





        Parent p=new Parent();
        System.out.println(p.yas);//22
        Child c=new Child();
        System.out.println(c.yas);//5 --//10 . adımın devamı

        Parent parent=new Child();
        System.out.println(parent.yas);//22

        parent.method4();//child method4 yas : 5--//11. adımın devamı
        p.method4();//parenttaki instance method4





    }


}
