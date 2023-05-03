package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
public static Map <String, Integer> getWordCount(String sentence) {
Map<String, Integer> wordsCountMap = new HashMap<>();
String[] words = sentence.split(" ");

for (String word : words) {
    if (!word.isEmpty()) {
        if (wordsCountMap.containsKey(word)) {
            int count = wordsCountMap.get(word);
            count++;
            wordsCountMap.put(word, count);
        } else {
            wordsCountMap.put(word, 1);

        }
    }
}
return wordsCountMap;

}
public static String toString(Map<String,Integer> wordsCountMap) {
    StringBuilder sb = new StringBuilder();
    if (wordsCountMap.isEmpty()) {
        sb.append("{}");
    } else {
        sb.append("{\n");
        for (String word : wordsCountMap.keySet()) {
            sb.append("  ");
            sb.append(word);
            sb.append(": ");
            sb.append(wordsCountMap.get(word));
            sb.append("\n");
        }
        sb.append("}");
    }
    return sb.toString();
}

}



//END
