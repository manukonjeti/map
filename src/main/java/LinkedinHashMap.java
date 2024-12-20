import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedinHashMap {
    public static void main(String[] args) {
        Map<String,Integer> linkedin=new LinkedHashMap<>();
        linkedin.put("books" ,30);
        linkedin.put("blogs" ,20);
        linkedin.put("bks" ,50);
        linkedin.put("fruits",400);
        linkedin.put("tabkes",70);
        for(Map.Entry<String,Integer> entry: linkedin.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
