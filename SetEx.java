import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hash= new HashSet<>();
        hash.add(10);
        hash.add(10);
        hash.add(70);
        hash.add(80);
        for(int i:hash){
            System.out.print(i+" ");
        }
        System.out.println();
        LinkedHashSet<Integer> linked =new LinkedHashSet<>();
        linked.add(10);
        linked.add(80);
        linked.add(80);
        linked.add(20);
        linked.add(10);
        for(int i:linked){
            System.out.print(i+" ");
        }
        System.out.println();
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(90);
        tree.add(20);
        tree.add(70);
        tree.add(10);
        for(int i:tree){
            System.out.print(i+" ");
        }
    }
}
