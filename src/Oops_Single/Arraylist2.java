package Oops_Single;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//collection:-interface
//collections:class
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add('X');
        li.add('A');
        li.add('Z');
        li.add('F');
        li.add('T');
        System.out.println(li);

//        Collections.sort(li);Its Sorting Arraylist by default Accending

//       Collections.sort(li,Collections.reverseOrder());//Its Decending

//        System.out.println(li);

        Iterator obj = li.iterator();
        while(obj.hasNext()){
            System.out.println(obj.next());
        }

    }

    public void add(int i) {
    }
}
