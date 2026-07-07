import java.util.*;
public class ArrayListEx{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(80);
        list.set(1,30);
        list.remove(2);
        System.out.println(list.size());
        for(int i =0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
