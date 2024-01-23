import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(55);
        hs.add(554);
        hs.add(54);
        
        for(int n:hs){
            System.out.println(n);
        }
    }
}
