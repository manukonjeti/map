import java.util.Map;
import java.util.TreeMap;

public class treemap {

    public static void main(String[] args) {
        Map<String,Integer> treemap=new TreeMap<>();
       treemap.put("java" ,30);
         treemap.put("python" ,30);
 treemap.put("boss" ,30);
 treemap.put("chromes" ,30);
 treemap.put("fire" ,30);
     for(Map.Entry<String,Integer>  en : treemap.entrySet())
     {
         System.out.println(en.getKey()+"     "   + en.getValue() );
            }

        }
    }

