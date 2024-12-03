package Oops_Single;
import java.util.*;
public class Arrays_Add {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        System.out.println(sum);
    }
}
