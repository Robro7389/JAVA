import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ronak",99);
        map.put("Bittu",100);
        map.put("Chals",98);

        System.out.println(map.containsKey("Bittu"));
        System.out.println(map.getOrDefault("A",34));
        System.out.println(map.remove("Bittu"));
        System.out.println(map.size());
        System.out.println(map.get("Chals").hashCode());

        System.out.println();
    }
}
