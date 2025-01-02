package LamdaExpression;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class FirstLamda {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        System.out.println(ll);

        for(Object oo : ll){
            System.out.println("Using ForLoop: "+oo);
        }

        Iterator it = ll.iterator();
        while (it.hasNext()){
            System.out.println("Using While: "+it.next());
        }

        //Lamda Expression is use to Perform in Single Line of code
        //(n)=parameter, ->=Expression
        ll.forEach((n)->{System.out.println("Using lamda "+n);});





    }
}
