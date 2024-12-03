package uss;

import java.util.HashSet;
//duplicates are not allowed
public class Firsh_HashSet {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();

        hs1.add(null);
        hs1.add("xyz");
        hs1.add(true);
        hs1.add(2);
        hs1.add('a');


        System.out.println(hs1);

        System.out.println(hs1.size());

        System.out.println(hs1.remove(2));

        System.out.println(hs1);

        System.out.println(hs1.isEmpty());

        System.out.println(hs1.contains(1));//Check Wheather Element Present Or Not

        HashSet ff = new HashSet();

       ff.addAll(hs1);

       ff.removeAll(hs1);
        System.out.println(hs1);
    }
}
