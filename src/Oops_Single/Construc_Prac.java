package Oops_Single;
  class xyz {
    xyz(){
        System.out.println("I am Parent Class");
    }
}
class demo extends  xyz {
        demo() {
        System.out.println("I am Child Class");

    }
}
  class Construc_Prac{
      public static void main(String[] args) {
          demo d = new demo();

      }
  }
