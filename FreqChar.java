import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        String s = "Frequency";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}
