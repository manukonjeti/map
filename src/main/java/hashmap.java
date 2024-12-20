import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("corejava", 300);
        map.put("Microservices", 200);
        map.put("Springboot", 500);
        System.out.println(map.get("Springboot"));
        System.out.println(map);
        // for (Map.Entry<String, Integer> entry : map.entrySet())
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {

            System.out.println(entry.getKey()+"        "+entry.getValue());
    }
        }

    }

