package uss;


import java.util.HashSet;


public class SortUse {
    public static void main(String[] args) {
        HashSet<Integer> ll = new HashSet<Integer>();
        ll.add(5);
        ll.add(7);
        ll.add(2);
        ll.add(1);
        ll.add(6);

        HashSet<Integer> ll1 = new HashSet<Integer>();
        ll1.add(9);
        ll1.add(11);
        ll1.add(15);
        ll1.add(8);
        ll1.add(7);

        System.out.println(ll);
        System.out.println(ll1);

        //Intersection set
        //ll.retainAll(ll1);//It Will Give Output both set element is Duplicate print(Common Element Print)
      //  System.out.println(ll);

        //Difference set
      //  ll1.removeAll(ll);//(Not Common Emelent Print)
     //   System.out.println(ll1);

        //Union set
       // ll.addAll(ll1);
     //   System.out.println(ll);

        ll.containsAll(ll1);
        System.out.println(ll);
    }
}
