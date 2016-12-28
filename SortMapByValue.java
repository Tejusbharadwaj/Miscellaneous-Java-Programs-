package compare;


import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
 
public class SortMapByValue {
    

 
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 10);
        map.put("b", 30);
        map.put("c", 50);
        map.put("d", 40);
        map.put("e", 20);
        System.out.println(map);

        Comparator<String> comparator = new ValueComparator(map);
        

        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(comparator);
        
        sortedMap.putAll(map);
        
        System.out.println(sortedMap);
    }
}
