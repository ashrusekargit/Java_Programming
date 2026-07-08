import java.util.HashMap;
import java.util.Map;

public class FrequencyArr {
    public static void main(String[] args) {
    //Frequency values of array - key , no of times - values
        int[] arr = {1,2,1,2,3,4};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }   
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                System.out.print(entry.getKey()+"->"+entry.getValue()+", ");
            }

        // 
        String s = "frequency";
        Map<Character,Integer> map1 = new HashMap<>();
        for (char c:s.toCharArray()){
            //map.put(i,map.getOrDefault(i,0)+1) - getOrDefault method
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }
            else{
                map1.put(c,1);
            }
        }   //
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
                System.out.print(entry.getKey()+"->"+entry.getValue()+", ");
            }
        
    }
}

