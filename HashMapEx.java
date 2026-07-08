import java.util.HashMap;
import java.util.Map;


public class HashMapEx{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        //Normal Methods
        map.put(101, "Nithin");
        map.put(102, "harish");
        map.put(103, "Basith");
        map.put(104, "Naveen");
        map.put(105, "Sachin");
        map.put(106, "Madhan");
        //System.out.println(map.containsKey(104));
        //System.out.println(map.containsValue("raju"));
        //System.out.println(map.get(101));
        //System.out.println(map.size());
        //System.out.println(map.remove(101));
        //System.out.println(map.keySet());
        //System.out.println(map.values());

        //traverseing Map Using keySet()
        for(Integer i : map.keySet()){
            System.out.print(i+"->"+map.get(i)+", ");
        }System.out.println();
        //traversing Map Using entrySet() - represents both key and values
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            if(entry.getKey() %2 == 0){
                System.out.print(entry.getKey()+"->"+entry.getValue()+", ");
            }
        }



        
    }
}