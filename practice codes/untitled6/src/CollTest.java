import java.util.ArrayList;
import java.util.HashSet;

public class CollTest {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(132);
        al.add("qwoiubfo");
        al.add('h');
        HashSet hs=new HashSet();
        hs.add(841);
        hs.add("wqieufnoiun");
        hs.add('k');

        hs.addAll(al);
        System.out.println("hs is now: "+hs);
        System.out.println("a1 is: "+al);
    }
}
