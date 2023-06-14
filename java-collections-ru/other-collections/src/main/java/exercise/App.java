package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {

    public static Map<String, String> genDiff(Map<String, ?> firstMap, Map<String, ?> secondMap) {
        Map<String, String> resultMap = new LinkedHashMap<>();

        Set<String> firstMapKeys = firstMap.keySet();
        Set<String> secondMapKeys = secondMap.keySet();

        for(String key : firstMapKeys) {
            if(secondMapKeys.contains(key)) {
                if(firstMap.get(key).equals(secondMap.get(key))) {
                    resultMap.put(key, "unchanged");
                } else {
                    resultMap.put(key, "changed");
                }
            } else {
                resultMap.put(key, "deleted");
            }
        }

        for(String key : secondMapKeys) {
            if(!firstMapKeys.contains(key)) {
                resultMap.put(key, "added");
            }
        }

        return resultMap;
    }
}
//END
