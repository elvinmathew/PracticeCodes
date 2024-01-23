import java.util.ArrayList;
import java.util.ListIterator;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.listIterator());
        System.out.println(list.stream().findAny());

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
