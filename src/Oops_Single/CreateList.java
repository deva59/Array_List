package Oops_Single;

import java.util.ArrayList;

public class CreateList {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();

        li.add("abc");
        li.add(100);
        li.add(10.2);
        li.add('a');

        for(Object Abc : li) {

            System.out.println(Abc);
        }
    }
}
