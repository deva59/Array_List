package Oops_Single;
import java.util.ArrayList;

public class ArrayListtt {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
//        System.out.println(li.isEmpty());//Is Return Bollean Form

        li.add("abc");
        li.add(100);
        li.add(10.2);
        li.add('a');
        System.out.println(li);

        System.out.println(li.isEmpty());

        System.out.println(li.size());//total size count

        System.out.println(li.get(2));//specific index check

        System.out.println(li.remove(1));

        System.out.println(li);

        System.out.println(li.size());

        System.out.println(li.set(1,"xyz"));//Replace Element

        System.out.println(li);




    }
}
