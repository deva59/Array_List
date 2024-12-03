package Oops_Single;

class demo1 {
    public void disp() {
        System.out.println("The parent Class....");
    }
}
class Demo2 extends demo1{
    public void disp(){
        super.disp();
        System.out.println("This is Child Class");

    }
}
class Demo3 extends demo1{
    public void disp(){
        super.disp();
        System.out.println("This is Third Class");

    }
}
public class Inheritancee {
    public static void main(String[] args) {
        Demo3 dd = new Demo3();
        dd.disp();

    }
}
